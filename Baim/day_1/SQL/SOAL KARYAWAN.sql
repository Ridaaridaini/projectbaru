-- 1 tampilkan fullname, jabatan, usia, dan jumlah anak dari masing masing karyawan
SELECT concat(first_name, ' ', last_name) as fullname
From biodata;

WITH f AS(
    SELECT b.id,
        CONCAT(first_name, ' ', last_name) AS "Fullname",
        p.name AS "Jabatan",
        date_part('year', AGE(NOW(), to_date(b.dob, 'yyyy-mm-dd'))) AS "Usia",
        f.name AS "Nama",
        f.status AS "Status"
    From biodata b
        FULL OUTER JOIN employee e ON e.biodata_id = b.id
        FULL OUTER JOIN employee_position ep ON e.id = ep.employee_id
        FULL OUTER JOIN position p ON p.id = ep.position_id
        FULL OUTER JOIN family f ON f.biodata_id = b.id
    WHERE p.name IS NOT NULL
),
f_count AS (
    SELECT id,
        COUNT(f."Status")
    FROM f
    WHERE f."Status" = 'Anak'
    GROUP BY id
),
f_biodata AS(
        SELECT b.id,
        CONCAT(first_name, ' ', last_name) AS "Fullname",
        p.name AS "Jabatan",
        date_part('year', AGE(NOW(), to_date(b.dob, 'yyyy-mm-dd'))) AS "Usia",
        f_count.count AS "Jumlah anak"
    From biodata b
        FULL OUTER JOIN employee e ON e.biodata_id = b.id
        FULL OUTER JOIN employee_position ep ON e.id = ep.employee_id
        FULL OUTER JOIN position p ON p.id = ep.position_id
        LEFT JOIN f_count ON b.id = f_count.id
    WHERE p.name IS NOT NULL
)

SELECT * FROM f_biodata

-- 2 hitung berapa hari cuti yang sudah diambil oleh masing masing karyawan
SELECT CONCAT(b.first_name, ' ', b.last_name) AS "Full Name",
    COALESCE(SUM(date_part('day', AGE(lr.end_date, lr.start_date))), 0) || ' Hari' AS "Cuti"
FROM biodata b
    LEFT JOIN employee e ON b.id = e.biodata_id
    LEFT JOIN leave_request lr ON lr.employee_id = e.id
    GROUP BY "Full Name";

-- 3 tampilkan fullname dan jabatan 3 karyawan yang paling tua
SELECT CONCAT(b.first_name, ' ', last_name) AS "Full Name",
    p.name AS "Jabatan",
    date_part('year', AGE(NOW(), to_date(dob, 'YYYY-MM-DD'))) || ' Tahun' AS "Umur"
FROM biodata b
    JOIN employee e ON b.id = e.biodata_id
    JOIN employee_position ep ON ep.employee_id = e.id
    JOIN position p ON ep.position_id = p.id
ORDER BY "Umur" DESC
LIMIT 3;

-- 4 tampilkan nama nama pelamar yang tidak diterima karyawan
SELECT CONCAT(b.first_name, ' ', b.last_name),
    e.nip
FROM biodata b
    LEFT JOIN employee e ON b.id = e.biodata_id
WHERE e.nip IS NULL;

-- 5 hitung berapa rata rata gaji karyawan dengan level staff

SELECT p.name as "Jabatan", ROUND(AVG(e.salary),2) AS "Rata Rata Gaji"
FROM biodata as b
    JOIN employee e ON b.id = e.biodata_id
    JOIN employee_position ep ON ep.employee_id = e.id
    JOIN position p ON p.id = ep.position_id
WHERE p.id = 4
GROUP BY p.name

-- 6 urutkan nama nama karyawan dan statusnya, diurutkan dari yang paling tua ke yang paling 
SELECT CONCAT(b.first_name, ' ', b.last_name) AS fullname,
    e.status,
    date_part('year', AGE(now(), to_date(dob, 'yyyy-mm-dd'))) || ' Tahun' AS umur
FROM biodata b
    JOIN employee e ON b.id = e.biodata_id
    ORDER BY umur DESC;

-- 7 tampilkan lastname dengan huruf kapital dimana last namenya diawali dengan huruf m
SELECT CASE
        WHEN last_name ILIKE 'm%' THEN UPPER(last_name)
    END AS lastname
FROM biodata
WHERE last_name ILIKE 'm%';

-- 8 tampilkan employee id, fullname, salary_lama, dan salary_baru
-- dimana salary baru itu sebesar 10% lebih besar dari salary lama
-- dan ditampilkan dengan kolom alias gaji baru
SELECT e.id AS "ID Employee",
    CONCAT(b.first_name, ' ', b.last_name) AS fullname,
    e.salary AS "Gaji Lama",
    ((salary * 0.1) + salary) AS "Gaji Baru"
FROM biodata b
    JOIN employee e ON e.biodata_id = b.id;

-- 9 tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas, dan total pengeluarannya selama dinas tersebut
SELECT CONCAT(b.first_name, ' ', b.last_name) AS "Nama Karyawan",
    tt.name AS "Jenis Perjalanan",
    tr.start_date AS "Tanggal Perjalanan",
    SUM(ts.item_cost) + tt.travel_fee AS "Pengeluaran"
FROM biodata b
    JOIN employee e ON e.biodata_id = b.id
    JOIN travel_request tr ON e.id = tr.employee_id
    JOIN travel_type tt ON tr.travel_type_id = tt.id
    JOIN travel_settlement ts ON ts.travel_request_id = tr.id
GROUP BY "Nama Karyawan",
    "Jenis Perjalanan",
    "Tanggal Perjalanan",
    tt.travel_fee;

-- 10. buatkan query untuk menampilkan data karyawan yang belum pernah melakukan perjalanan dinas
SELECT CONCAT(b.first_name, ' ', b.last_name) AS "Karyawan"
FROM biodata b
JOIN employee e ON e.biodata_id = b.id
LEFT JOIN travel_request tr ON tr.employee_id = e.id
WHERE tr.employee_id IS NULL;

-- 11 Tampilkan nama lengkap karyawan, jenis cuti, alasan cuti, durasi cuti, 
-- dan nomor telepon yang bisa dihubungi untuk masing masing karyawan yang mengajukan cuti
SELECT CONCAT(b.first_name, ' ', b.last_name) AS "Karyawan",
    l.type AS "Jenis Cuti",
    lr.reason AS "Alasan Cuti",
    date_part('day', AGE(lr.end_date, lr.start_date)) || ' Hari' AS "Durasi Cuti",
    cp.contact AS "Nomer Telepon"
FROM biodata b
    JOIN employee e ON e.biodata_id = b.id
    JOIN leave_request lr ON lr.employee_id = e.id
    JOIN leave l ON l.id = lr.leave_id
    JOIN contact_person cp ON b.id = cp.biodata_id AND cp.type = 'PHONE';

-- 12 Tampilkan alasan cuti yang paling sering diajukan karyawan
WITH c_count AS (
    SELECT lr.reason AS "Alasan Cuti",
        COUNT(lr.reason) AS "Jumlah Alasan Cuti"
    FROM biodata b
        JOIN employee e ON e.biodata_id = b.id
        JOIN leave_request lr ON lr.employee_id = e.id
        JOIN leave l ON l.id = lr.leave_id
    GROUP BY lr.reason
),
c_max AS (
    SELECT MAX(c_count."Jumlah Alasan Cuti") AS "Max Count"
    FROM c_count
),
hasil AS (
    SELECT c_count."Alasan Cuti"
    FROM c_count
    WHERE c_count."Jumlah Alasan Cuti" = (SELECT * FROM c_max)
)
SELECT *
FROM hasil;

-- 13 Tampilkan lastname, salary, bonus dan salary_plus_bonus untuk
-- karyawan yang namanya mengandung minimal salah satu dari huruf vocal,
-- dimana bonus itu sebesar 20% dari salary

SELECT b.last_name, e.salary, ((e.salary * 0.2) + salary) AS bonus
FROM biodata b
JOIN employee e ON e.biodata_id = b.id
WHERE b.last_name ILIKE '%a%'
    OR b.last_name ILIKE '%i%'
    OR b.last_name ILIKE '%u%'
    OR b.last_name ILIKE '%e%'
    OR b.last_name ILIKE '%o%';