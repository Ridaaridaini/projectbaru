-- 1 tampilkan fullname, jabatan, usia, dan jumlah anak dari masing masing karyawan
SELECT concat(first_name, ' ', last_name) as fullname From biodata;

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
    SUM(AGE(lr.end_date, lr.start_date)) AS "Lama Cuti"
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

SELECT p.name as "Jabatan", AVG(e.salary) AS "Rata Rata Gaji"
FROM biodata as b
    JOIN employee e ON b.id = e.biodata_id
    JOIN employee_position ep ON ep.employee_id = e.id
    JOIN position p ON p.id = ep.position_id
WHERE p.id = 4
GROUP BY p.name