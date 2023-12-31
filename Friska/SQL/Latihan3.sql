DROP TABLE IF EXISTS biodata;
CREATE TABLE biodata (
	id bigint,
	first_name varchar(20), 
	last_name varchar(30), 
	dob varchar(10), 
	pob varchar(50), 
	address varchar(255), 
	marital_status boolean
);

INSERT INTO biodata VALUES (1, 'Raya', 'Indriyani', '1991-01-01', 'Bali', 'Jl. Raya Baru, Bali', false);
INSERT INTO biodata VALUES (2, 'Rere', 'Wulandari', '1992-01-02', 'Bandung', 'Jl. Berkah Ramadhan, Bandung', false);
INSERT INTO biodata VALUES (3, 'Bunga', 'Maria', '1991-03-03', 'Jakarta', 'Jl. Mawar Semerbak, Bogor', true);
INSERT INTO biodata VALUES (4, 'Natasha', 'Wulan', '1990-04-10', 'Jakarta', 'Jl. Mawar Harum, Jakarta', false);
INSERT INTO biodata VALUES (5, 'Zahra', 'Aurelia Putri', '1991-03-03', 'Jakarta', 'Jl. Mawar Semerbak, Bogor', true);
INSERT INTO biodata VALUES (6, 'Katniss', 'Everdeen', '1989-01-12', 'Jakarta', 'Jl. Bunga Melati, Jakarta', true);

DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
	id bigint,
	biodata_id bigint,
	nip varchar(5), 
	status varchar(10), 
	salary decimal(10, 0)
);

INSERT INTO employee VALUES (1, 1, 'NX001', 'Permanen', 12000000);
INSERT INTO employee VALUES (2, 2, 'NX002', 'Kontrak', 15000000);
INSERT INTO employee VALUES (3, 4, 'NX003', 'Permanen', 13500000);
INSERT INTO employee VALUES (4, 5, 'NX004', 'Permanen', 12000000);
INSERT INTO employee VALUES (5, 6, 'NX005', 'Permanen', 17000000);

DROP TABLE IF EXISTS contact_person;
CREATE TABLE contact_person (
	id bigint,
	biodata_id bigint,
	type varchar(5), 
	contact varchar(100)
);

INSERT INTO contact_person VALUES (1, 1, 'MAIL', 'raya.indriyani@gmail.com');
INSERT INTO contact_person VALUES (2, 1, 'PHONE', '085612345678');
INSERT INTO contact_person VALUES (3, 2, 'MAIL', 'rere.wulandari@gmail.com');
INSERT INTO contact_person VALUES (4, 2, 'PHONE', '081312345678');
INSERT INTO contact_person VALUES (5, 2, 'PHONE', '087812345678');
INSERT INTO contact_person VALUES (6, 3, 'MAIL', 'bunga.maria@gmail.com');
INSERT INTO contact_person VALUES (7, 4, 'MAIL', 'natasha.wulan@gmail.com');
INSERT INTO contact_person VALUES (8, 5, 'MAIL', 'zahra.putri@gmail.com');
INSERT INTO contact_person VALUES (9, 6, 'MAIL', 'katniss.everdeen@gmail.com');

DROP TABLE IF EXISTS leave;
CREATE TABLE leave (
	id bigint,
	type varchar(10), 
	name varchar(100)
);

INSERT INTO leave VALUES (1, 'Regular', 'Cuti Tahunan');
INSERT INTO leave VALUES (2, 'Khusus', 'Cuti Menikah');
INSERT INTO leave VALUES (3, 'Khusus', 'Cuti Haji & Umroh');
INSERT INTO leave VALUES (4, 'Khusus', 'Melahirkan');

DROP TABLE IF EXISTS employee_leave;
CREATE TABLE employee_leave (
  id integer,
  employee_id integer,
  period varchar(4),
  regular_quota integer
);

INSERT INTO employee_leave VALUES (1, 1, '2020', 16);
INSERT INTO employee_leave VALUES (2, 2, '2020', 12);
INSERT INTO employee_leave VALUES (3, 1, '2021', 16);
INSERT INTO employee_leave VALUES (4, 2, '2021', 12);
INSERT INTO employee_leave VALUES (5, 4, '2021', 12);
INSERT INTO employee_leave VALUES (6, 5, '2021', 12);
INSERT INTO employee_leave VALUES (7, 6, '2021', 12);

DROP TABLE IF EXISTS leave_request;
CREATE TABLE leave_request (
	id bigint,
	employee_id bigint,
	leave_id bigint,
	start_date date,
	end_date date,
	reason varchar(255)
);

INSERT INTO leave_request VALUES (1, 1, 1, '2020-10-10', '2020-10-12', 'Liburan');
INSERT INTO leave_request VALUES (2, 1, 1, '2020-11-12', '2020-11-15', 'Acara keluarga');
INSERT INTO leave_request VALUES (3, 2, 2, '2020-05-05', '2020-05-07', 'Menikah');
INSERT INTO leave_request VALUES (4, 2, 1, '2020-09-09', '2020-09-13', 'Touring');
INSERT INTO leave_request VALUES (5, 2, 1, '2020-12-24', '2020-12-25', 'Acara keluarga');

DROP TABLE IF EXISTS travel_type;
CREATE TABLE travel_type (
	id bigint,
	name varchar(50),
	travel_fee integer
);

INSERT INTO travel_type VALUES (1, 'In Indonesia', 200000);
INSERT INTO travel_type VALUES (2, 'Out Indonesia', 350000);

DROP TABLE IF EXISTS travel_request;
CREATE TABLE travel_request (
	id bigint,
	employee_id bigint,
	travel_type_id bigint,
	start_date date,
	end_date date
);

INSERT INTO travel_request VALUES (1, 1, 1, '2020-07-07', '2020-07-08');
INSERT INTO travel_request VALUES (2, 1, 1, '2020-08-07', '2020-08-08');
INSERT INTO travel_request VALUES (3, 2, 2, '2020-04-04', '2020-04-07');

DROP TABLE IF EXISTS travel_settlement;
CREATE TABLE travel_settlement (
	id bigint,
	travel_request_id bigint,
	item_name varchar(100),
	item_cost integer
);

INSERT INTO travel_settlement VALUES (1, 1, 'Tiket travel Do-Car berangkat', 165000);
INSERT INTO travel_settlement VALUES (2, 1, 'Hotel', 750000);
INSERT INTO travel_settlement VALUES (3, 1, 'Tiket travel Do-Car pulang', 165000);
INSERT INTO travel_settlement VALUES (4, 2, 'Tiket pesawat berangkat', 750000);
INSERT INTO travel_settlement VALUES (5, 2, 'Hotel', 650000);
INSERT INTO travel_settlement VALUES (6, 2, 'Tiket pesawat pulang', 1250000);
INSERT INTO travel_settlement VALUES (7, 3, 'Tiket pesawat berangkat', 4750000);
INSERT INTO travel_settlement VALUES (8, 3, 'Hotel', 6000000);
INSERT INTO travel_settlement VALUES (9, 2, 'Tiket pesawat pulang', 4250000);

DROP TABLE IF EXISTS position;
CREATE TABLE position (
	id bigint,
	name varchar(100)
);

INSERT INTO position VALUES (1, 'Direktur');
INSERT INTO position VALUES (2, 'General Manager');
INSERT INTO position VALUES (3, 'Manager');
INSERT INTO position VALUES (4, 'Staff');

DROP TABLE IF EXISTS employee_position;
CREATE TABLE employee_position (
	id bigint,
	employee_id bigint,
	position_id bigint
);

INSERT INTO employee_position VALUES (1, 5, 1);
INSERT INTO employee_position VALUES (2, 4, 2);
INSERT INTO employee_position VALUES (3, 3, 3);
INSERT INTO employee_position VALUES (4, 2, 4);
INSERT INTO employee_position VALUES (5, 1, 4);

DROP TABLE IF EXISTS department;
CREATE TABLE department (
	id bigint,
	name varchar(100)
);

INSERT INTO department VALUES (1, 'Recruitment');
INSERT INTO department VALUES (2, 'Sales');
INSERT INTO department VALUES (3, 'Human Resource');
INSERT INTO department VALUES (4, 'General Affair');

DROP TABLE IF EXISTS family;
CREATE TABLE family (
	id bigint, 
	biodata_id bigint, 
	name varchar(100), 
	status varchar(50)
);

INSERT INTO family VALUES (1, 3, 'Azka Fadlan Zikrullah', 'Suami');
INSERT INTO family VALUES (2, 3, 'Primrose Everdeen', 'Anak');
INSERT INTO family VALUES (3, 5, 'Jaka Samudera Buana', 'Suami');
INSERT INTO family VALUES (4, 5, 'Friska Davira', 'Anak');
INSERT INTO family VALUES (5, 5, 'Harum Indah Az Zahra', 'Anak');
INSERT INTO family VALUES (6, 6, 'Adya Pratama Yuda', 'Suami');

----------------------------------------------------------------------------------
-- fungsi concat mengabunggkan 2 atau lebih text

select
	first_name,
	last_name,
	concat(first_name,' ',last_name) as fullname,
	first_name|| ' ' || last_name as fullname2
from biodata;

-- fungsi now () :mengambil waktu sekarang
select now ();

-- fungsi date_part() : mengambil/extact dari bagian waktu

select date_part('year',now());
select date_part('month',now());

--tidak bisa karena tanggalnya masih string/text
select date_part('year','10-08-2023');

--fungsi to_date() : konversi dari string ke date
--fungsi extract : mengambil bagian dari date (contoh years,month,dll)

select
	'10-08-2023',-- text
	to_date('10-08-2023','DD-MM-YYYY'),-- date
	date_part('year',to_date('10-08-2023','DD-MMM-YYYY')),--double
	extract(year from to_date('10-08-2023','DD-MMM-YYYY')),
	to_char(now(),'DD-MM-YYYY')-- text
	
--latihan
--tampilkan dob(text), dob (date), tahun lahir seluruh biodata

select

	biodata.dob
	
from biodata;

-----------------------
select
	biodata.dob,
	to_date (biodata.dob, 'YYYY-MMM-DD'),
	date_part ('year',to_date(biodata.dob,'YYYY-MMM-DD'))
from biodata;

----------------------------------------------------------

--fungsi Age()- untuk menghitung selisih dari 2 date
select
	'27-05-2000',
	to_date('27-05-2000','dd-mm-yyyy'),
	age(now(),to_date('27-05-2000','dd-mm-yyyy')),
	date_part('year',age(now(),
		to_date('27-05-2000','dd-mm-yyyy')))|| ' tahun'
		
-------------------------------------------------
--case when end -> kondisi percabangan di sql
select
	pob,
	case
		when pob ilike 'jakarta' then 'Jakardah',
		when pob ilike 'bali' then 'Bali skuy'
		else 'Kota Lain'
	end
from biodata;

--LATIHAN
-- 1. Tampilkan full name, jabatan, usia, & jumlah anak dari masing-masing karyawan

select
	
	biodata.first_name|| ' ' || biodata.last_name as fullname,
	position.name as jabatan,
	date_part('year', age(now(),to_date(dob,'yyyy-mm-dd')))|| ' tahun' as usia,
	sum(case
		when family.status ilike 'anak' then 1
		else 0
	   end) as jml_anak

from biodata 
inner join employee
	on biodata.id = employee.biodata_id
inner join employee_position
	on employee.id =employee_position.employee_id
join position
	on employee_position.position_id = position.id
left join family
	on family.biodata_id = biodata.id
group by fullname, jabatan, usia

-- 2. Hitung berapa hari cuti yang sudah diambil masing-masing karyawan
select
	
	biodata.first_name||' '|| last_name as fullname,
	coalesce(sum(date_part('day',age(leave_request.end_date,leave_request.start_date))),0) as "hari"
	
	
from leave_request 
	right join employee
on leave_request.employee_id = employee.biodata_id
	left join biodata
on employee.biodata_id = biodata.id
group by fullname

-- 3. Tampilkan fullname dan jabatan 3 karyawan paling tua
select
	biodata.first_name ||' '|| last_name as fullname,
	date_part('year',age(now(),to_date(dob,'yyyy-mmm-dd')))||' tahun' as usia,
	position.name 
	
from biodata inner join employee
	on biodata.id = employee.biodata_id
inner join employee_position
	on employee.id = employee_position.employee_id
inner join position
	on employee_position.position_id = position.id

order by usia  desc limit 3

-- 4. Tampilkan nama-nama pelamar yang tidak diterima karyawan
select

	biodata.first_name||' '|| last_name as fullname	
	
from biodata left join employee 
	on biodata.id = employee.biodata_id
where status is null;

	
-- 5. Hitung berapa rata-rata gaji karyawan dengan level staff
select
	
	round(avg(employee.salary))

from biodata inner join employee
	on biodata.id = employee.biodata_id
inner join employee_position
	on employee.id = employee_position.employee_id
inner join position
	on  employee_position.position_id = position.id
	
where position.name ilike 'staff';

-- 6. Urutkan nama-nama karyawan dan statusnya, diurutkan dari yang paling tua dan yg paling muda
select
	biodata.first_name||' '|| last_name as NamaKaryawan,
	position.name as Posisi,
	date_part('year',age(now(),to_date(dob,'yyyy-mmm-dd')))||' tahun' as usia

from biodata inner join employee
	on biodata.id = employee.biodata_id
inner join employee_position 
	on employee.id = employee_position.employee_id
inner join position
	on employee_position.position_id = position.id
	
order by usia desc;


-- 7. Tampilkan last name dengan huruf kapital,dimana last namenya diawali dengan huruf M
select
	upper (biodata.last_name) as NamaKaryawan
 
from biodata
where biodata.last_name ilike ('M%');
	

-- 8. Tampilkan employeeid, fullname, salary_lama, dan salary_baru
-- Dimana salary baru itu sebesar 10% lebih besar dari salary lama
-- dan tampilkan dengan kolom alias Gaji baru

select
	biodata.first_name||' '||last_name as fullname,
	(employee.salary * 0.1) + employee.salary as salarybaru

from biodata inner join employee
	on biodata.id = employee.biodata_id;
	

-- 9. Tampilkan nama karyawan, jenis perjalanan dinas,tanggal perjalanan dinas, 
-- dan total pengeluarannya selama dinas tersebut select
select

	biodata.first_name||' '|| last_name as karyawan,
	travel_type.name as jenisperjalanandinas,
	travel_request.start_date as tanggalperjalanandinas,
	travel_type.travel_fee + sum(travel_settlement.item_cost) as totalpengeluaran

	
from biodata inner join employee
	on biodata.id = employee.biodata_id
inner join 	travel_request
	on employee.id = travel_request.employee_id
inner join travel_type
	on travel_request.travel_type_id = travel_type.id
inner join travel_settlement
	on travel_request.id = travel_settlement.travel_request_id

group by karyawan, travel_type.name, travel_request.start_date, travel_type.travel_fee;
	

-- 10. Buatkan query untuk menampilkan data karyawan yang belum pernah melakukan perjalanan dinas
select
	biodata.first_name ||' '|| last_name as karyawan,
	employee.id 

from biodata right join employee
	on biodata.id = employee.biodata_id
left join travel_request
	on employee.id = travel_request.employee_id
where start_date is null;
	

-- 11. Tampilkan nama lengkap karyawan, jenis cuti,alasan cuti, durasi cuti,
-- dan nomor telepon yang bisa dihubungi untuk masing-masing karyawan yang mengajukan cuti
select
	biodata.first_name||' '|| last_name as karyawan,
	leave_request.reason,
	sum(date_part('day',age(leave_request.end_date, leave_request.start_date)))||' hari'as lama,
	contact_person.contact
	
from contact_person inner join biodata
on contact_person.biodata_id = biodata.id
inner join employee
	on biodata.id = employee.biodata_id
inner join leave_request
	on employee.id = leave_request.employee_id
	
group by karyawan,leave_request.reason,contact_person.contact;


-- 12. Tampilkan alasan cuti yang paling sering diajukkan karyawan
--Step 1 tampilkan yang diminta terlebih dahulu---
select 

	leave_request.reason,
	count(leave_request.reason) as alasan
	
from leave_request
group by leave_request.reason

---Step 2 menghitung jumlah max nya
select max(alasan)
from(select 

	leave_request.reason,
	count(leave_request.reason) as alasan
	
from leave_request
group by leave_request.reason)tabel1;

---Step 3 gabungkan step 1 dan 2---
select 
* 
from(select 

	leave_request.reason,
	count(leave_request.reason) as alasan
	
from leave_request
group by leave_request.reason)tabel2
where tabel2.alasan = (select max(alasan)
from(select 

	leave_request.reason,
	count(leave_request.reason) as alasan
	
from leave_request
group by leave_request.reason)tabel1);

-- 13. Tampilkan last name, salary, bonus-
-- dan salary_plus_bonus untuk karywan yang namanya mengandung minimal salah
-- satu dari huruf vocal. Dimana bonus itu sebesar 20% dari salary
Select
	biodata.last_name,
	employee.salary,
	employee.salary * 0.2 as bonus,
	employee.salary + employee.salary * 0.2 as salary_plus_bonus
	
from biodata inner join employee
	on biodata.id = employee.biodata_id
	where last_name ilike '%a%'or last_name ilike '%i%'or last_name ilike '%u%' or
	last_name ilike '%e%' or last_name ilike '%o%' or first_name ilike '%a%'or last_name ilike '%i%'or last_name ilike '%u%'
	or last_name ilike '%e%' or last_name ilike '%o%'

--------------------------------------Simulasi FT 1-----------------------------------------------------------

--SOAL 1 Tampilkan status karyawan dan jumlah karyawan untuk setiap statusnya
select
	biodata.first_name ||' '||last_name as karyawan,
	count(position.name) as banyaknyakaryawan
	
from biodata inner join employee
on biodata.id = employee.biodata_id
inner join employee_position 
on employee.id = employee_position.employee_id
inner join position
on employee_position.position_id = position.id
group by karyawan

--SOAL 2 Tampilkan data biodata yang bukan merupakan karyawan
select 

	*
	
from biodata left join employee
on biodata.id = employee.biodata_id
where status is null
		
--SOAL 3 Tampilkan fullname, status pernikahan (sudah menikah/ belum menikah) dan jumlah anak dari biodata

select
	
	biodata.first_name||' '|| last_name as karyawan,
	case 
	when biodata.marital_status = 'true' then 'sudah menikah'
	else
		'belum menikah'
	
	end as "Status Pernikahan",

	sum(case
	when family.status ilike 'anak' then 1
	else 0
	end) as "Jumlah anak"

from biodata left join family
on biodata.id = family.biodata_id
inner join employee
on biodata.id = employee.biodata_id
group by karyawan, biodata.marital_status, employee.id

--SOAL 4 Tampilkan Semua departemen
select
	*
from department

--SOAL 5 Tampilkan tahun lahir & jumlah karyawan yang mempunyai tahun lahir yang sama
select
	count(biodata.first_name||' '|| last_name) as karyawan,
	date_part('year',to_date(dob,'yyyy-mm-dd'))
	
from biodata
group by biodata.dob

--SOAL 6 Tampilkan data biodata & jabatan dari karyawan
select

	biodata.*,
	position.name as "Jabatan Karyawan"
	 	 	
from biodata inner join employee
	on biodata.id = employee.biodata_id
inner join 	employee_position
	on employee.id = employee_position.employee_id
inner join position
	on employee_position.position_id = position.id;
	
--SOAL 7 Tampilkan data biodata yang lahir di Jakarta namun tidak tinggal di Jakarta
select

	biodata.*
	
from biodata
where pob ilike 'jakarta' and address not ilike '%jakarta%'
	
--SOAL 8 Tampilkan fullname, jabatan, usia, dan jumlah anak dari masing-masing karyawan saat 
--ini (kalau tidak ada anak tulis 0 (nol) atau \'-\' saja.
select

	biodata.first_name||' '|| last_name as karyawan,
	position.name,
	date_part('year',age(now(),to_date(dob,'yyyy-mm-dd'))) as umur,
	sum(case
	when family.status ilike 'anak' then 1
	else 0
	end)

from family right join biodata
	on family.biodata_id = biodata.id
right join employee
	on biodata.id = employee.biodata_id
left join employee_position
	on employee.id = employee_position.employee_id
left join position
	on employee_position.position_id = position.id
group by karyawan,position.name,umur

--SOAL 9 Tampilkan nama karyawan dan jumlah hari cuti yang sudah pernah diambil
select
	biodata.first_name||' '||last_name as karyawan,
	coalesce(sum(date_part('day',age(leave_request.end_date, start_date))),0) as "Jumlah Cuti"
	
from biodata right join employee 
	on biodata.id = employee.biodata_id
left join leave_request
	on employee.id = leave_request.employee_id
group by karyawan

--SOAL 10 Tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas, 
--dan total pengeluarannya selama perjalanan dinas tersebut

select
	biodata.first_name||' '||last_name as karyawan,
	travel_type.name,
	travel_request.start_date,
	travel_type.travel_fee + sum(travel_settlement.item_cost) as totalpengeluaran
	
from biodata inner join employee
	on biodata.id = employee.biodata_id
inner join travel_request
	on employee.id = travel_request.employee_id
inner join travel_type
	on travel_request.travel_type_id = travel_type.id
inner join travel_settlement
	on travel_request.id = travel_settlement.travel_request_id
	
group by karyawan,travel_type.name,travel_request.start_date,travel_type.travel_fee
	
	

	



