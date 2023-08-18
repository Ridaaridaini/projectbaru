--1. Tampilkan status karyawan dan jumlah karyawan untuk setiap statusnya
select 
    status as status_karyawan,
    count(status) as jumlah_karyawan
from employee
group by status_karyawan;

--2. Tampilkan data biodata yang bukan merupakan karyawan
SELECT 
    concat(b.first_name,' ', b.last_name) as karyawan
from biodata b left join employee e ON
    b.id = e.biodata_id
where e.nip is null;

--3. Tampilkan fullname, status pernikahan (sudah menikah/ belum menikah) dan jumlah anak dari biodata
select 
    concat(b.first_name, ' ', b.last_name) as fullname,
    CASE
    when b.marital_status = true then 'sudah menikah'
    else 'belum menikah' 
    end as status_pernikahan,
    sum(CASE
    WHEN f.status ilike 'anak' then 1
    else 0
    end) as jumlah_anak
from biodata b RIGHT JOIN employee e ON
    b.id = e.biodata_id
left join family f ON
    b.id = f.biodata_id
GROUP BY 1,2

--4.Tampilkan Semua departemen
select 
    name as nama_departmen
from department

--5. Tampilkan tahun lahir & jumlah karyawan yang mempunyai tahun lahir yang sama
select
    date_part('year', to_date(dob, 'yyyy-mm-hh')) as tahun,
    count(date_part('year', to_date(dob, 'yyyy-mm-hh'))) as jumlah
from biodata
group by tahun
order by jumlah desc;

--6. Tampilkan data biodata & jabatan dari karyawan
select 
    b.*,
    p.name as jabatan
from biodata b join employee e ON
    b.id = e.biodata_id
join employee_position ep ON
    e.id = ep.employee_id
join position p ON
    ep.position_id = p.id

--7. Tampilkan data biodata yang lahir di Jakarta namun tidak tinggal di Jakarta

select
    * 
from biodata
where pob ='Jakarta' and address not ilike '%jakarta%'


--8. Tampilkan fullname, jabatan, usia, dan jumlah anak dari masing-masing karyawan saat ini 
--(kalau tidak ada anak tulis 0 (nol) atau \'-\' saja.
select
    concat(b.first_name,' ',b.last_name) as full_name,
    p.name as jabatan,
    date_part('year', age(now(), to_date(b.dob,'yyyy-mm-dd'))) || ' tahun' as umur,
    sum(CASE
    when f.status ilike 'anak' then 1
    else 0
    end) as jumlah_anak
from biodata b right join employee e ON
    b.id = e.biodata_id
join employee_position ep ON
    e.id= ep.employee_id
join position p ON
    ep.position_id = p.id
left join family f ON
    b.id=f.biodata_id
group by full_name, jabatan,umur
order by jumlah_anak desc

--9.SOAL 9 Tampilkan nama karyawan dan jumlah hari cuti yang sudah pernah diambil
select
    concat(b.first_name, ' ', b.last_name) as full_name,
    coalesce(sum(date_part('day', age(end_date, start_date))),0)  as jumlah_cuti
from biodata b right join employee e ON
    b.id=e.biodata_id
left join leave_request lr ON
    e.id = lr.employee_id
group by full_name

--10. Tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas, 
--dan total pengeluarannya selama perjalanan dinas tersebut

select
    concat(b.first_name,' ', b.last_name) as fullname,
    tt.name as jenis_perjalanan,
    tr.start_date,
    sum(ts.item_cost) + tt.travel_fee as total_pengeluaran
from biodata b join employee e on
    b.id = e.biodata_id
join travel_request tr on
    e.id = tr.employee_id
join travel_type tt on
    tr.travel_type_id = tt.id
join travel_settlement ts on
    tr.id = ts.travel_request_id
    group by fullname, jenis_perjalanan,tr.start_date,tt.travel_fee
