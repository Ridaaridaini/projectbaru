-- 1
select 
	e.status,
	count(e.status) as status
from biodata b
join employee e
	on b.id = e.biodata_id
group by e.status

--2
select
	b.*
from biodata b
left join employee e
	on b.id = e.biodata_id where e.id is null
	
--3
select
	b.first_name || ' ' ||b.last_name as fullname,
	b.marital_status,
	sum(case
		when f.status ilike 'anak' then 1
		else 0
	end)
from biodata b
full outer join family f
	on f.biodata_id = b.id
group by fullname,b.marital_status

--4
select * from department

--5
select 
	date_part('year',age(now(),to_date(dob,'yyyymmdd'))) as umur,
	count(date_part('year',age(now(),to_date(dob,'yyyymmdd'))))
from biodata b
join employee e
	on b.id = e.biodata_id
group by umur

with table1 as(select 
	date_part('year',age(now(),to_date(dob,'yyyymmdd'))) as umur,
	count(date_part('year',age(now(),to_date(dob,'yyyymmdd')))) as banyak_umur
from biodata b
join employee e
	on b.id = e.biodata_id
group by umur), table2 as (select max(banyak_umur) from table1)
select umur,banyak_umur from table1 where banyak_umur = (select * from table2)

--6
select
	b.*,
	p.name
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on ep.employee_id = e.id
join position p 
	on ep.position_id = p.id
	
--7
select
	biodata.*
from biodata where pob ilike 'jakarta' 
and address not ilike ('%jakarta%')

--8
select
	b.first_name || ' '|| b.last_name as fullname,
	p.name,
	date_part('year',age(now(),to_date(dob,'yyyy-mm-dd'))) as usia,
	sum(case
		when f.status ilike 'anak' then 1
		else 0
	end) as jml_anak
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
left join family f
	on b.id = f.biodata_id
group by fullname,p.name,usia

--9
select
	b.first_name || ' ' || b.last_name as fullname,
	sum(end_date - start_date)
from biodata b
join employee e
	on b.id = e.biodata_id
join leave_request lr
	on e.id = lr.employee_id
group by fullname
--10
select
	b.first_name || ' '||b.last_name as fullname,
	tt.name,
	tr.start_date,
	sum(ts.item_cost)+tt.travel_fee
from biodata b
join employee e
	on b.id = e.biodata_id
join travel_request tr
	on e.id = tr.employee_id
join travel_settlement ts
	on tr.id = ts.travel_request_id
join travel_type tt
	on tt.id = tr.travel_type_id
group by fullname,tt.name,tr.start_date,tt.travel_fee