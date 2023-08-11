--1
select 
	count(status) as karyawan,
	status
from employee
join biodata
	on biodata.id = employee.biodata_id
group by status

--2
select 
	b.dob,b.pob,b.address, marital_status
from biodata b
left join employee e
	on b.id = e.biodata_id where e.biodata_id is null
--3
select
	b.first_name || ' ' || b.last_name,
	b.marital_status,
	count(f.status) as anak
from biodata b
join family f
	on b.id = f.biodata_id where f.status = 'Anak'
group by status,b.first_name,b.last_name,b.marital_status

--4
select * from department
--5
select
	date_part('year', age(now(),to_date(dob,'yyyy-mm-dd'))) ||'tahun' as usia
from biodata b
join employee e
	on b.id = e.biodata_id 
order by usia desc
--6
select
	b.first_name,
	b.last_name,
	b.dob,
	b.pob,
	b.address,
	b.marital_status,
	p.name
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on ep.position_id = p.id
	
--7
select 
	biodata.*
from biodata where pob ilike 'jakarta' and address  not ilike '%jakarta%'

--8
select
	b.first_name || ' '||b.last_name as fullname,
	date_part('year', age(now(),to_date(dob,'yyyy-mm-dd'))) ||'tahun' as usia,
	p.name,
	sum (case
		when f.status ilike 'anak' then 1
		else 0
	end) as jml_anak
from biodata b
left join employee e
	on e.biodata_id = b.id
left join employee_position ep
	on ep.employee_id = e.id
left join position p
	on ep.position_id = p.id
left join family f
	on b.id = f.biodata_id 
group by fullname,usia,p.name
--9
select
	b.first_name || ' ' || b.last_name as fullname,
	sum(lr.end_date - lr.start_date)
from biodata b
join employee e
	on b.id = e.biodata_id
join leave_request lr
	on e.id = lr.employee_id
group by b.first_name,b.last_name

--10
select
	b.first_name ||' '|| b.last_name as fullname,
	tt.name,
	tr.start_date,
	sum(ts.item_cost)+tt.travel_fee
from biodata b
join employee e
	on b.id = e.biodata_id
join travel_request tr
	on e.id= tr.employee_id
join travel_type tt
	on tr.travel_type_id = tt.id
join leave_request lr
	on e.id = lr.employee_id
join travel_settlement ts
	on lr.id = ts.travel_request_id