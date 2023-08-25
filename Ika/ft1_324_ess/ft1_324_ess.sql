--1. Tampilkan data biodata yang memiliki jabatan/posisi
SELECT b.*,
    p.name as jabatan
 FROM biodata b join employee e ON
    b.id = e.biodata_id
join employee_position ep on 
e.id = ep.employee_id 
join position p ON
    ep.position_id=p.id;

--2. cuti

select 
    e.nip as NIP,
    concat(b.first_name,' ', b.last_name) as full_name,
    coalesce((sum(date_part('day', age(end_date, start_date)))),0) as "Cuti Diambil"

from biodata b right join employee e on
    b.id = e.biodata_id
left join leave_request as lr on
    e.id = lr.employee_id
    GROUP BY 1,2
ORDER BY 1;

--3. betul upload ulang
SELECT
    concat(b.first_name, ' ' ,b.last_name) as "Nama Lengkap",
    p.name as jabatan,
    date_part('year', age(now(), b.dob)) || ' Tahun' as Usia,
    sum(CASE
    when f.status ilike 'anak' then 1
    else 0
    end) as anak
from biodata b right join employee e ON
    b.id = e.biodata_id
left join employee_position ep on 
e.id = ep.employee_id 
left join position p ON
    ep.position_id=p.id
left join family f ON
    b.id = f.biodata_id
    GROUP BY 1, 2 ,3;

--4. 
SELECT
    concat(b.first_name,' ', b.last_name) as full_name,
    e.nip as NIP,
    e.status as Status,
    e.salary as Salary
from biodata b join employee e ON
    b.id = e.biodata_id
where b.pob= 'Jakarta' and b.address not ilike '%jakarta%'

--5. jumlah masing-masing karyawan kontrak dan permanen fixx
SELECT
    status,
    count(status) as jml_karyawan
from employee
group by status
order by jml_karyawan desc;

--6 belum
select 
    distinct (concat(b.first_name, ' ', b.last_name)) as "Nama Lengkap",
    tt.name as "Jenis Perjalanan",
    (tr.start_date),
    (tr.end_date),
    (sum((date_part('day' ,age(tr.end_date, tr.start_date))))* ts.item_cost) + tt.travel_fee as "Total Pengeluaran"

from biodata b join employee e on
    b.id = e.biodata_id
join travel_request tr on
    e.id = tr.employee_id
join travel_type tt on
    tr.travel_type_id = tt.id
join travel_settlement ts on
    tr.id= ts.travel_request_id
group by 1,2,3,4, ts.item_cost, tt.travel_fee

--7. belum fixx
select 
    concat(first_name,' ',last_name) as "Nama Lengkap",
    CASE
    when id = 1 then 'Sales'
    when id=2 then 'Human Resource'
    end as Departement
from biodata;

--8 belum
-- (case 
   -- when b.marital_status =0 then 'Belum menikah'
    --else 'menikah'
    --end ) as status_pernikahan


select 
    concat(b.first_name,' ', b.last_name) as "Nama Lengkap",
    case 
    when b.marital_status = false then 'belum menikah'
    when b.marital_status= true then  'menikah'
    end as status_pernikahan,
    f.name

from biodata b right join employee e on
    b.id = e.biodata_id
join family f on
    b.id = f.biodata_id
where f.status = 'Suami';

--9 fixx
select
    b.* 
from biodata b left join employee e on
    b.id = e.biodata_id
where e.nip is null;


--10. fixx
select
    date_part('year', dob) as tahun_lahir,
    count(date_part('year', dob))
from biodata
where date_part('year', dob) = 1991 or date_part('year', dob)=1992
group by tahun_lahir

