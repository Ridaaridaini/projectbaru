-- 1. Tampilkan status karyawan dan jumlah karyawan untuk setiap statusnya
SELECT e.status,
    COUNT(e.status) AS "Jumlah Karyawan"
from biodata b
    JOIN employee e ON e.biodata_id = b.id
GROUP BY e.status;
-- 2 Tampilkan data biodata yang bukan merupakan karyawan
SELECT b.*
FROM biodata b
    LEFT JOIN employee e ON e.biodata_id = b.id
WHERE e.nip IS NULL -- 3 Tampilkan fullname, status pernikahan (sudah menikah/ belum menikah) dan jumlah anak dari biodata
SELECT CONCAT(b.first_name, ' ', b.last_name) AS "Fullname",
    CASE
        WHEN b.marital_status = true THEN 'Sudah Menikah'
        ELSE 'Belum Menikah'
    END AS "Status Pernikahan",
    SUM(
        CASE
            WHEN f.status = 'Anak' THEN 1
            ELSE 0
        END
    ) AS "Jumlah Anak"
FROM biodata b
    JOIN family f ON f.biodata_id = b.id
GROUP BY "Fullname",
    "Status Pernikahan";
-- 4 Tampilkan Semua departemen
SELECT *
FROM department;
-- 5 Tampilkan tahun lahir & jumlah karyawan yang mempunyai tahun lahir yang sama
SELECT date_part('year', to_date(b.dob, 'yyyy-mm-dd')) AS "Tahun Lahir",
    COUNT(date_part('year', to_date(b.dob, 'yyyy-mm-dd'))) AS Jumlah
FROM biodata b
    JOIN employee e ON e.biodata_id = b.id
GROUP BY "Tahun Lahir";
-- 6 Tampilkan data biodata & jabatan dari karyawan
SELECT b.*,
    p.name
FROM biodata b
    JOIN employee e ON e.biodata_id = b.id
    JOIN employee_position ep ON ep.employee_id = e.id
    JOIN position p ON p.id = ep.position_id;
-- 7 Tampilkan data biodata yang lahir di Jakarta namun tidak tinggal di Jakarta
SELECT b.*
FROM biodata b
WHERE b.address NOT ILIKE '%Jakarta'
    AND b.pob ILIKE 'jakarta';
-- 8 Tampilkan fullname, jabatan, usia, dan jumlah anak dari masing-masing
-- karyawan saat ini (kalau tidak ada anak tulis 0 (nol) atau \'-\' saja.
SELECT CONCAT(b.first_name, ' ', b.last_name) AS fullname,
    p.name AS jabatan,
    date_part('year', AGE(NOW(), to_date(b.dob, 'yyyy-mm-dd'))) AS usia,
    SUM(
        CASE
            WHEN f.status = 'Anak' THEN 1
            ELSE 0
        END
    ) AS jumlah_anak
FROM biodata b
    JOIN employee e ON e.biodata_id = b.id
    JOIN employee_position ep ON e.id = ep.employee_id
    JOIN position p ON p.id = ep.position_id
    LEFT JOIN family f ON f.biodata_id = b.id
    GROUP BY fullname, jabatan, usia;

-- 9 Tampilkan nama karyawan dan jumlah hari cuti yang sudah pernah diambil
SELECT CONCAT(b.first_name, ' ', b.last_name) AS fullname,
    COALESCE(SUM(date_part('day', AGE(lr.end_date, lr.start_date))),0) || ' Hari' AS jumlah_hari_cuti
FROM biodata b
    JOIN employee e ON e.biodata_id = b.id
    LEFT JOIN leave_request lr ON lr.employee_id = e.id
    GROUP BY fullname;

-- 10 Tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas, dan total pengeluarannya selama perjalanan dinas tersebut
SELECT CONCAT(b.first_name, ' ', b.last_name) AS fullname,
    tp.name AS jenis_perjalanan_dinas,
    tr.start_date AS tanggal_perjalanan_dinas,
    SUM(ts.item_cost) + tp.travel_fee AS total_pengeluaran
FROM biodata b
    JOIN employee e ON e.biodata_id = b.id
    JOIN travel_request tr ON tr.employee_id = e.id
    JOIN travel_type tp ON tp.id = tr.travel_type_id
    JOIN travel_settlement ts ON ts.travel_request_id = tr.id
    GROUP BY fullname, jenis_perjalanan_dinas, tanggal_perjalanan_dinas, tp.travel_fee;