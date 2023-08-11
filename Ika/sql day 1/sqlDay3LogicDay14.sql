--6 urutkan nama-nama karyawan dan statusnya, diurutkan dari yang paling tua ke paling muda
SELECT
    concat(b.first_name,' ', b.last_name) as nama_karyawan,
    e.status as status
    --date_part('year' , age(now(), to_date(b.dob, 'yyyy-mm-dd')))
from biodata b join employee e ON
    b.id = e.biodata_id
order by date_part('year' , age(now(), to_date(b.dob, 'yyyy-mm-dd'))) desc;

--7. tampilkan last name dengan huruf kapital, dimana last namenya diawal dengan huruf a
SELECT
    UPPER(last_name)
from biodata
where last_name ilike '%a';

--8. tampilkan employee_id, fullname, salary_lama, salary_baru, dimana salary baru itu sebesar 10% lebih 
--- besar dari salary lama dan ditampilkan dengan kolom alias gaji baru
SELECT
    e.id as employee_id,
    concat(b.first_name,' ', b.last_name) as full_name,
    e.salary as salary_lama,
    round((e.salary + e.salary/10),0) as salary_baru
from biodata b join employee e on
    b.id = e.biodata_id;

--9. tampilkan nama karyawan, jenis perjalanan dinas, tinggal perjalanan dinas,
    -- dan total pengeluaran selama dinas tersebut
SELECT
    concat(b.first_name,' ', b.last_name) as nama_karyawan,
    tt.name as jenis_perjalanan_dinas,
    sum(ts.item_cost ) + tt.travel_fee as total_pengeluaran,
    tr.start_date
from biodata b right join employee e on
    b.id = e.biodata_id
left join travel_request tr on
    e.id = tr.employee_id
left join travel_type tt on
    tr.travel_type_id = tt.id
join travel_settlement  ts on
    tr.id= ts.travel_request_id
GROUP BY nama_karyawan,
    jenis_perjalanan_dinas, 
    tt.travel_fee,
    tr.start_date;

-- 10. buatkan query untuk menampilkan data karyawan yang belum pernah melakukan perjalanan dinas
SELECT 
    concat(b.first_name,' ', b.last_name) as nama_karyawan
    --tr.employee_id
from biodata b right join employee e on
    b.id=e.biodata_id
left join travel_request tr on
    e.id = tr.employee_id
where tr.employee_id is null;

--11. tampilkan nama lengkap karyawan, jenis cuti, alasan cuti, durasi cuti
-- dan nomor telpon yang bisa dihubungi untuk masing-masing karyawan yang mengajukan cuti
SELECT
    concat (b.first_name,' ', b.last_name) as nama_karyawan,
    l.type as jenis_cuti,
    lr.reason as alasan_cuti,
    coalesce(sum(date_part('day', age(lr.end_date, lr.start_date))),0) as durasi_cuti,
    cp.contact
from biodata b  join employee e on
    b.id = e.biodata_id
join leave_request lr on
    e.id = lr.employee_id
 join leave l on
 lr.leave_id = l.id
join contact_person cp on
    b.id = cp.biodata_id
where cp.type ilike 'phone'
group by 1,2,3,5

--12. tampilkan alasan cuti yang paling sering diajukan karyawan
with f as (SELECT 
        reason,
        count(reason) as jumlah_alasan
    from leave_request
    group by 1),
 f_max as (select max(jumlah_alasan) from f)
 select reason from f where jumlah_alasan =(select * from f_max)

--13. tampilkan last_name, salary, bonus,
-- dan salary plus bonus untuk karyawan yang namanya minimal salah satu dari huruf vokal
-- dimana bonus itu sebesar 20% dari salary
select 
    b.last_name,
    e.salary,
    round(e.salary*0.2, 0) as bonus,
    round((e.salary + e.salary*0.2),0) as bonus_salary
from biodata b join employee e on
    b.id = e.biodata_id
where b.first_name ilike '%a%' or b.first_name ilike '%u%'
     or b.first_name ilike '%i%' or b.first_name ilike '%e%' or 
     b.first_name ilike '%o%' or
    b.last_name ilike '%a%' or b.last_name ilike '%u%'
     or b.last_name ilike '%i%' or b.last_name ilike '%e%' or 
     b.last_name ilike '%o%'