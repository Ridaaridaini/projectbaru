--1. tampilkan fullname, jabatan , usia & jumlah anak dari masing-masig karyawan / kurang jumlah anak
SELECT 
    concat(b.first_name, ' ', b.last_name) as full_name,
    pn.name as jabatan,
    date_part('year' , age(now(), to_date(b.dob,'yyyy-mm-dd'))) || ' Tahun' as usia,
    sum (CASE
        when f.status ilike 'anak' then 1 
        else 0
    END) as jml_anak
from biodata b join employee e on
    b.id=e.biodata_id
join employee_position ep on
    e.id=ep.employee_id
join position pn on
    ep.position_id=pn.id
left join family f ON
    f.biodata_id = b.id
GROUP BY full_name, jabatan, usia;

--2. hitung berapa hari cuti yang sudah di ambil masing-masing karyawan
SELECT 
    concat(b.first_name, ' ', b.last_name) as karyawan,
    COALESCE(sum(date_part('day' , (age(lr.end_date, lr.start_date)))),0)|| ' hari '  as cuti
from biodata b join employee e ON
    b.id = e.biodata_id
left join leave_request lr ON
    e.id = lr.employee_id
GROUP BY karyawan;

-- 3. tampilkan fullname dan jabatan 3 karyawan paling tua
SELECT
    concat(b.first_name, ' ', b.last_name) as full_name,
    date_part('year', age(now(), to_date(dob, 'yyyy-mm-dd'))) || ' tahun' as umur
from biodata b
ORDER BY 2 DESC
limit 3;

--4. tampilkan nama-nama pelamar yang tidak diterima karyawan
SELECT
    concat(b.first_name, ' ', b.last_name) as "Nama Karyawan"
    --p.name as jabatan
from biodata b left join employee e ON
    b.id = e.biodata_id
left join employee_position ep ON
    e.id=ep.employee_id 
left join position p ON
    ep.position_id = p.id
where p.name is null;    

--5. hitung berapa rata-rata gaji karyawan dengan level staff
SELECT
    round(avg(e.salary),2) as "rata-rata gaji staff"
from employee e join employee_position ep ON
    e.id = ep.employee_id
join position p ON
    ep.position_id = p.id
WHERE p.name ilike 'staff';