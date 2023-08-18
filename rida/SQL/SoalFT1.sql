--1. tampilkan status karyawan dan jumlah karyawan untuk setiap statusnya
select 
	status as "Status Karyawan",
	count(status) as jumlah
from biodata b
join employee e
	on b.id= e.biodata_id
group by e.status;

--2. tampilkan data biodata yang bukan karyawan
select 
	b
from biodata b
full outer join employee e
	on b.id = e.biodata_id
where e.status is null

--3. tampilkan fullname, status pernikahan (sudah/belom) dan jumlah anak 
select
	b.first_name||' '||b.last_name as fullname,
	case
	when b.marital_status= 'true' then 'Sudah menikah'
	else 'belum menikah'
	end as statuspernikahan,
	sum(case
	when f.status ilike 'Anak' then 1
	else 0
	end) as jumlahanak
from biodata b
left join family f
	on b.id=f.biodata_id
right join employee e
	on b.id= e.biodata_id
group by fullname, b.marital_status

--4 tampilkan semua departemen
select 
	d.name
from department d

--5 tampilkan tahun lahir dan jumlah karyawan yang punya tahun lahir yang sama
select
	date_part('year',to_date(b.dob,'YYYY')) as tahun,
	count(date_part('year',to_date(b.dob,'YYYY'))) as jumlah
from biodata b
join employee e
	on	b.id =e.biodata_id 
group by tahun

--6 tampilkan data biodata & jabatan dari karyawan
select 
	b.* as "Data biodata",
	p.name as "Jabatan"
from biodata b
join employee e
	on e.biodata_id = b.id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on ep.position_id =p.id

--7 tampilkan data biodata yang lahir di jakarta namun tidak tinggal di jakarta
select
	*
from biodata b
where b.pob='Jakarta' and b.address not ilike '%Jakarta%'

--8 tampilkan fullname, jabatan, usia, dan jumlah anak dari masing-masing karyawan
select
	b.first_name||' '|| b.last_name as fullname,
	p.name as jabatan,
	date_part('year', age(now(),to_date(b.dob,'YYYY-MM-DD'))) as usia,
	sum(case
	when f.status ilike 'Anak' then 1
	else 0
	end	) as jumlahanak
from biodata b
left join family f
	on f.biodata_id =b.id
left join employee e
	on e.biodata_id = b.id
join employee_position ep
	on ep.employee_id= e.id
join position p
	on ep.position_id = p.id
group by fullname,jabatan, usia

--9tampilkan nama karyawan dan jumlah hari cuti yang sudah pernah diambil
select
	b.first_name ||' '|| b.last_name as fullname,
	coalesce(sum(date_part('day',age(lr.end_date,lr.start_date))),0)as "Jumlah hari"	
from biodata b
right join employee e
	on e.biodata_id=b.id
left join leave_request lr
	on e.id=lr.employee_id
group by fullname;

--10 Tampilkan nama karyawan, jenis perjalanan dinas, 
--tanggal perjalanan dinas, dan total pengeluarannya selama perjalanan dinas tersebut

select
	concat(b.first_name, ' ' , b.last_name) as fullname,
	tt.name as travel_type,
	tr.start_date as tgl_mulai,
	tt.travel_fee + sum(ts.item_cost) as total_cost
	from biodata b
		inner join employee e
			 on b.id = e.biodata_id
		inner join travel_request tr
			on e.id = tr.employee_id
		inner join travel_type tt
			on tr.travel_type_id = tt.id
		inner join travel_settlement ts
			on tr.id = ts.travel_request_id
	group by fullname, travel_type, tgl_mulai, tt.travel_fee