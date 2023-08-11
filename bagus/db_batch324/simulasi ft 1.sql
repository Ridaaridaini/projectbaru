--1

select employee.status, count(employee.status), biodata.id from employee inner join biodata
on biodata.id = employee.biodata_id
group by employee.status, biodata.id

--2

select biodata.* from biodata left join employee on biodata.id=employee.biodata_id
where employee.id is null

--3

select concat(first_name,' ', last_name) as "Nama Lengkap",
case
when biodata.marital_status = 'true' then 'Sudah Menikah'
else 'Belum Menikah'
end as "Status Pernikahan",
sum(case
	when family.status ilike 'Anak' then 1
	else 0
	end) as "Jumlah Anak"
from biodata left join family on biodata.id = family.biodata_id 
right join employee on biodata.id = employee.biodata_id
group by "Nama Lengkap", biodata.marital_status

--4

select * from department

--5

select count(first_name) as "Jumlah karyawan", date_part('year',to_date(dob,'yyyy-mm-dd')) as "Tahun Lahir" from biodata 
group by "Tahun Lahir"

--6

select biodata.*, position.name as jabatan from biodata right join employee on biodata.id = employee.biodata_id 
right join employee_position
on employee.id = employee_position.employee_id 
right join position on employee_position.position_id = position.id

--7

select * from biodata where pob = 'Jakarta' and address not ilike '%jakarta%'

--8

select concat(first_name, ' ' , last_name) as "Nama Lengkap", position.name as "Jabatan",
date_part('year',age(now(),to_date(dob, 'yyyy-mm-dd'))) as usia,
sum(case
	when family.status ilike 'Anak' then 1
	else 0
	end) as "Jumlah anak"
from biodata right join employee 
on biodata.id = employee.biodata_id left join family 
on biodata.id = family.biodata_id left join employee_position
on employee.id = employee_position.employee_id 
left join position on employee_position.position_id = position.id
group by "Nama Lengkap", position.name, dob

--9

select concat(first_name,' ', last_name) as "Nama Lengkap",
sum(age(leave_request.end_date, leave_request.start_date))
from biodata inner join employee on biodata.id = employee.biodata_id inner join leave_request
on employee.id = leave_request.employee_id
group by "Nama Lengkap"

--10

select concat(first_name,' ',last_name) as "Nama Lengkap", travel_type.name, travel_request.start_date,
sum(travel_settlement.item_cost) + travel_type.travel_fee
from biodata inner join employee on biodata.id = employee.biodata_id 
inner join travel_request on travel_request.employee_id = employee.id inner join travel_type
on travel_request.travel_type_id = travel_type.id inner join travel_settlement on
travel_settlement.travel_request_id = travel_request.id
group by "Nama Lengkap", travel_type.name, travel_request.start_date, travel_type.travel_fee

