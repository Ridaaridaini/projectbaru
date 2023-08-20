-- nomor 1
-- sisa waktu 4.58
select
	status,
	count(status)
	from employee
	group by status;
	
-- nomor 2 sisa
-- waktu 4.38
select
	concat(first_name, ' ', last_name) as name,
	dob,
	pob,
	address,
	marital_status
	from biodata b
	left join employee e
		on b.id = e.biodata_id
	where e.id is null;
	
-- nomor 3
-- lewat 1 menit
select
	concat(b.first_name, ' ', b.last_name) as fullname,
	case
		when b.marital_status is true then 'Sudah Menikah'
		else 'Belum Menikah'
	end as merit,
	sum(case
		when f.status ilike 'anak' then 1
		else 0
	end) as anak
	from biodata b
	left join family f
		on b.id = f.biodata_id
	group by fullname, merit;
	
-- nomor 4 sisa 6.**
select
	name as department
	from department;
	
-- nomor 5
-- sisa 4.20
select
	date_part('year', to_date(dob, 'yyyy-MM-dd')) as year,
	count(date_part('year', to_date(dob, 'yyyy-MM-dd'))) as employee_count
	from biodata b
	inner join employee e
		on b.id = e.biodata_id
	group by year;
	
-- nomor 6
-- sisa 3.42
select
	concat(b.first_name, ' ', b.last_name) as fullname,
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
		on ep.position_id = p.id;
		
-- nomor 7
-- sisa 5.50
select
	*
	from biodata
where pob ilike 'jakarta' and address not ilike '%jakarta%';

-- nomor 8
-- sisa 40 detik
select
	concat(b.first_name, ' ', b.last_name) as fullname,
	p.name as jabatan,
	date_part('year', age(now(), to_date(b.dob, 'yyyy-MM-dd'))) as umur,
	sum(case
		when f.status ilike 'anak' then 1
		else 0
	end) as jum_anak
	from biodata b
		inner join employee e
			on b.id = e.biodata_id
		inner join employee_position ep
			on e.id = ep.employee_id
		inner join position p
			on p.id = ep.position_id
		left join family f
			on b.id = f.biodata_id
		group by fullname, jabatan, umur;
		
-- nomor 9
-- sisa 3.21
select
	concat(b.first_name, ' ', b.last_name) as fullname,
	sum(age(lr.end_date, lr.start_date)) as total_cuti
	from biodata b
		inner join employee e
			on b.id = e.biodata_id
		inner join leave_request lr
			on e.id = lr.employee_id
	group by fullname;
	
-- nomor 10
-- lebih 20 detik
select 
	concat(b.first_name, ' ', b.last_name) as fullname,
	tt.name as jenis_perjalanan_dinas,
	tr.start_date as tgl_mulai,
	sum(ts.item_cost) + tt.travel_fee as total_biaya
	from biodata b
		inner join employee e
			on b.id = e.biodata_id
		inner join travel_request tr
			on e.id = tr.employee_id
		inner join travel_settlement ts
			on tr.id = ts.travel_request_id
		inner join travel_type tt
			on tt.id = tr.travel_type_id
		group by fullname, jenis_perjalanan_dinas, tgl_mulai, tt.travel_fee






