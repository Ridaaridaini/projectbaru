--SIMULASI LATIHAN FT 1

--1 TAMPILKAN STATUS KARYAWAN DAN JUMLAH KARYAWAN UNTUK SETIAP STATUSNYA
select employee.status as "Status Karyawan", count(first_name) as "jumlah Karyawan" from biodata
inner join employee
on biodata.id = employee.biodata_id
group by employee.status;

--2 TAMPILKAN DATA BIODATA YANG BUKAN MERUPAKAN KARYAWAN
select * from biodata
left join employee
on biodata.id = employee.biodata_id
where status is null;

--3 TAMPILKAN FULLNAME, STATUS PERNIKAHAN DAN JUMLAH ANAK DARI BIODATA
select concat(first_name,' ',last_name) as "Full Name", biodata.marital_status as "Status Pernikahan",
sum(case
   when family.status ilike 'Anak' THEN 1
   else 0
   end) "Jumlah Anak"
   from biodata
left join family
on biodata.id = family.biodata_id
group by "Full Name", biodata.marital_status;



--4 TAMPILKAN SEMUA DEPARTEMEN
select name as "Nama Departemen" from department;



--5 TAMPILKAN TAHUN LAHIR DAN JUMLAH KARYAWAN YANG MEMPUNYAI TAHUN LAHIR YANG SAMA
select date_part('year', to_date(dob, 'yyyy-mm-dd')) as "Tahun Lahir Karyawan", count(first_name) as "Jumlah Karyawan"
from biodata
group by "Tahun Lahir Karyawan";



--6 TAMPILKAN DATA BIODATA & JABATAN DARI KARYAWAN
select biodata.*, position.name as jabatan from biodata
inner join employee
on biodata.id = employee.biodata_id
inner join employee_position
on employee.id = employee_position.employee_id
inner join position
on employee_position.position_id = position.id;


--7 TAMPILKAN DATA BIODATA YANG LAHIR DI JAKARTA NAMUN TIDAK TINGGAL DI JAKARTA

select * from biodata
where not address ilike '%Jakarta%' and pob = 'Jakarta';


--8 TAMPILKAN FULLNAME, JABATAN, USIA DAN JUMLAH ANAK DARI MASING-MASING KARYAWAN SAAT INI
--KALAU TIDAK ADA ANAK TULIS 0
select concat(first_name,' ',last_name) as "Full Name", position.name as Jabatan, 
date_part('year', (age(now(),(to_date(dob, 'yyyy-mm-dd'))))) || ' tahun' as usia,
sum(case 
   when family.status ilike 'Anak' then 1
   else 0
   end) Jumlah_Anak
from biodata
left join employee
on biodata.id = employee.biodata_id
left join family
on biodata.id = family.biodata_id
inner join employee_position
on employee.id = employee_position.employee_id
left join position
on employee_position.position_id = position.id 
group by "Full Name", jabatan, usia;


--9 TAMPILKAN NAMA KARYAWAN DAN JUMLAH HARI CUTI YANG SUDAH DIAMBIL
select concat(first_name,' ',last_name)	as full_name, coalesce(sum(date_part('day',age(leave_request.end_date, leave_request.start_date))),0) || ' hari' as cuti
from biodata
right join employee --hanya karyawan yang dikeluarkan
on biodata.id = employee.biodata_id
left join leave_request
on employee.id = leave_request.employee_id
group by full_name;		  
		  
		  
--10 TAMPILKAN NAMA KARYAWAN, JENIS PERJALANAN DINAS, TANGGAL PERJALANAN DINAS, DAN TOTAL PENGELUARAN SELAMA DINAS
select concat(first_name, ' ',last_name) as full_name, travel_type.name as jenis_perjalanan_dinas,
travel_request.start_date as tanggal_perjalanan_dinas, travel_type.travel_fee + sum(travel_settlement.item_cost)
as Total_pengeluaran_dinas
from biodata
inner join employee
on biodata.id = employee.biodata_id
inner join travel_request
on employee.id = travel_request.employee_id
inner join travel_type
on travel_request.travel_type_id = travel_type.id
inner join travel_settlement 
on travel_request.id = travel_settlement.travel_request_id
group by full_name, jenis_perjalanan_dinas,	tanggal_perjalanan_dinas, travel_type.travel_fee;	  
		  