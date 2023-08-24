--1
select
	b.id as biodata_id,
	b.first_name,
	b.last_name,
	b.dob,
	b.pob,
	b.address,
	b.marital_status,
	p.name as jabatan
	from biodata b
	inner join employee e
		on b.id = e.biodata_id
	inner join employee_position ep
		on e.id = ep.employee_id
	inner join position p
		on ep.position_id = p.id
	order by biodata_id asc;

--2
select
	e.nip as nip,
	concat(b.first_name, ' ', b.last_name) as fullname,
	coalesce(sum(date_part('day',age(lr.end_date, lr.start_date))), 0) as cuti
	from biodata b
		inner join employee e
			on b.id = e.biodata_id
		left join leave_request lr
			on e.id = lr.employee_id
	group by nip, fullname;
	
--3
select
	concat(b.first_name, ' ', b.last_name) as fullname,
	p.name as jabatan,
	date_part('year', age(now(), b.dob)) as usia,
	sum(case
		when f.status ilike 'anak' then 1
		else 0
	end)
	from biodata b
	inner join employee e
		on b.id = e.biodata_id
	inner join employee_position ep
		on e.id = ep.employee_id
	inner join position p
		on ep.position_id = p.id
	left join family f
		on f.biodata_id = b.id
		group by fullname, jabatan,usia;
	
--4
select
	concat(first_name, ' ', last_name) as fullname,
	e.nip as nip,
	e.status as status,
	e.salary as salary
	from biodata b
	inner join employee e
		on b.id = e.biodata_id
where pob ilike 'jakarta' and address not ilike '%jakarta';

--5
select
	status,
	count(status) as jmlh_karyawan
		from employee
group by status;

--6 ragu
select
	concat(b.first_name, ' ', b.last_name) as fullname,
	tt.name as jenis_perjalanan,
	tr.start_date as start_date,
	tr.end_date as end_date,
	sum(ts.item_cost) + tt.travel_fee as total_pengeluaran
	from biodata b
	inner join employee e
		on b.id = e.biodata_id
	inner join travel_request tr
		on e.id = tr.employee_id
	inner join travel_type tt
		on tt.id = tr.travel_type_id
	inner join travel_settlement ts
		on tr.id = ts.travel_request_id
	group by fullname,jenis_perjalanan,start_date,end_date,tt.travel_fee;
	
--7 ragu
WITH table1 AS(
	select
	id as dep_id,
	name as dep_name
	from department
) select first_name, table1.dep_name
		from biodata
		inner join table1
			on biodata.id = table1.dep_id
			
--8 ragu
select
	concat(b.first_name, ' ', b.last_name) as fullname,
	b.marital_status,
	case
		when f.status ilike 'suami' or f.status ilike 'istri' then coalesce(f.name, 'belum menikah')
	end as couple,
	count(case
		when f.status ilike 'anak' then true
	end) as anak
	from biodata b
	 inner join employee e
	 	on b.id = e.biodata_id
	inner join family f
		on b.id = f.biodata_id
		group by fullname, marital_status, couple;
		
--9

select
	b.id as biodata_id,
	concat(b.first_name, ' ', b.last_name) as fullname,
	b.dob,
	b.pob,
	b.address,
	b.marital_status
	from biodata b
	left join employee e
		on b.id = e.biodata_id
	where e.nip is null;
	
--10

select
	date_part('year', dob) as tahun_lahir,
	count(date_part('year', dob)) as jumlah
	from biodata
	group by tahun_lahir;
	
WITH table1 AS(
	select
	(date_part('year', dob)) || '' as tahun_lahir,
	count(date_part('year', dob)) as jumlah
	from biodata
	group by tahun_lahir
) select * from table1 x where x.tahun_lahir ilike '1991' or x.tahun_lahir ilike '1992';
	
	
	


	
	
	