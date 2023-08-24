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



---concat-> Menampilkan full name dari table first name dan last name

select
	first_name,
	last_name,
	concat(first_name,'',last_name) as fullname,
	first_name ||''|| last_name as fullname2
from biodata;



--- fungsi now() : mengambil waktu sekarang
select now();



---fungsi date_part() : mengambil/extrack dari bagian waktu
select date_part('year',now());

select date_part('month',now());


---fungsi to_date() : konversi dari string ke date

select 
	'10-08-2023',
	to_date('10-08-2023','DD-MM-YYYYY'),
	date_part('year',to_date('10-08-2023','DD-MM-YYYY')),
	Extract(year from to_date('10-08-2023','DD-MM-YYYY'))


--latihan
--tampilkan dob(text),dob(date),tahun lahir seluruh biodata

select * from biodata;

select 
	dob,
	to_date(dob,'yyyy-mm-dd'),
	date_part('year',to_date(dob,'yyyy-mm-dd'))
from biodata;

--Fungsi Age()
--untuk menghitung selisih dari 2 date

select
	'27-05-2000',
	to_date('27-05-2000','dd-mm-yyyy'),
	age(now(),to_date('27-05-2000','dd-mm-yyyy')),
	date_part('year',age(now(),
			to_date('27-05-2000','dd-mm-yyyy'))) || 'tahun'
							 

--case when end -> kondisi percabangan di sql
							 
select							 
	pob,						 
	case						 
		when pob ilike 'jakarta' then 'jekardah'
		when pob ilike 'bali' then 'bali skuy'
		else 'kota lain'					 
	end
from biodata;

--1.tampilkan fullname,jabatan,usia & jumlah anak dari masing2 karyawan

select
	biodata.first_name ||' '||biodata.last_name as fullname,
	position as jabatan,
	date_part('year',age(now(),to_date(biodata.dob,'yyyy-mm-dd'))) || 'tahun' as usia,
	sum(case
	   when family.status ilike 'anak' then 1
		else 0 
	   end) as jml_anak
from biodata
inner join employee
	on biodata.id = employee.biodata_id
inner join employee_position 
	on employee.id = employee_position.employee_id
inner join position
	on position.id = employee_position.position_id
left join family
	on family.biodata_id = biodata.id
group by fullname,jabatan,usia


--2.hitung berapa hari cuti yg sudah di ambil masing masing karyawan
select
	biodata.first_name ||' '|| biodata.last_name as fullname,
	sum(coalesce (date_part('day',age(leave_request.end_date,leave_request.start_date)),0))
	from
	biodata
inner join employee on employee.biodata_id = biodata.id 
left join leave_request on leave_request.employee_id = employee.id
group by fullname
order by sum desc;


--3.tampilkan fullname dan jabatan 3 karyawan paling tua
select
	biodata.first_name ||' '||biodata.last_name as fullname,
	position as jabatan,
	date_part('year',age(now(),to_date(biodata.dob,'yyyy-mm-dd'))) || ' tahun' as usia
	
from biodata
inner join employee
	on biodata.id = employee.biodata_id	
inner join employee_position 
	on employee.id = employee_position.employee_id
inner join position
	on position.id = employee_position.position_id
group by fullname,position,usia 
order by fullname,position,usia desc
limit 3;
	

	
--4.tampilkan nama nama pelamar yg tidak diterima karyawan
select 
	biodata.first_name ||' '||biodata.last_name as Nama_pelamar
from biodata
left join employee 
	on employee.biodata_id = biodata.id where employee.nip is null


	
--5.hitung berapa rata-rata gaji karyawan dengan level staff
select
	round(avg(employee.salary),2) as rata_rata
	from
employee 
inner join employee_position 
	on employee_position.employee_id = employee.id 
inner join position 
	on position.id = employee_position.position_id where position.name = 'Staff'
	

--6.urutkan nama2 karyawan dan statusnya,diurutkan dari yg paling tua ke yg paling muda
select
	biodata.first_name||' '||biodata.last_name as fullname,
	employee.status as status,
	date_part('year',age(now(),to_date(biodata.dob,'yyyy-mm-dd'))) as umur
	
	from
biodata
inner join employee on employee.biodata_id = biodata.id
order by umur desc;

--7.tampilkan last name dengan huruf kapital, dimana last name diawali dengan huruf M
select
	upper (biodata.last_name) as Last_name
	from
biodata 
where biodata.last_name ilike 'M%';

--8. tampilkan empoyee id, fullname, salary_lama, dan salary_baru.
--dimana salary baru itu sebesar 10% lebih besar dari salary lama
--dan ditampilkan dengan kolom alias gaji baru
select
	employee.id as employee_id,
	biodata.first_name||' '||biodata.last_name as fullname,
	employee.salary as salary_lama,
	(employee.salary + (employee.salary * 0.1)) salary_baru

	from
biodata
inner join employee on employee.biodata_id = biodata.id


--9.tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas,
--dan total pengeluaran selama dinas tersebut
select 
	biodata.first_name||' '||biodata.last_name as Nama_karyawan,
	travel_type.name as jenis_perjalanan,
	travel_request.start_date as tanggal_perjalanan,
	travel_type.travel_fee + sum(travel_settlement.item_cost) as pengeluaran
	
	from
biodata
inner join employee 
	on employee.biodata_id = biodata.id 
inner join travel_request 
	on travel_request.employee_id = employee.id
inner join travel_type 
	on travel_request.travel_type_id = travel_type.id
inner join travel_settlement 
	on travel_request.id = travel_settlement.travel_request_id
group by Nama_karyawan,jenis_perjalanan,tanggal_perjalanan,travel_fee;


--10. buatlah query untuk menampilkan data karyawan yang belum pernah melakukan dinas
select
	biodata.first_name||' '||biodata.last_name as Nama_karyawan
	from
biodata
right join employee 
	on employee.biodata_id = biodata.id
left join travel_request 
	on travel_request.employee_id = employee.id 
	where travel_request.employee_id is null


--11.Tampilkan nama lengkap karyawan,jenis cuti,alasan cuti,durasi cuti,
--dan nomor telepon yang bisa dihubungi untuk masing2 karyawan yg mengajukan cuti
select
	biodata.first_name||' '||biodata.last_name as Nama_karyawan,
	leave.type as jenis_cuti,
	leave_request.reason as alasan_cuti,
	sum(date_part('day',age(leave_request.end_date,leave_request.start_date))) || ' hari' as durasi_cuti,
	contact_person.contact as "nomor_telepon"
	from
biodata
right join employee 
	on employee.biodata_id = biodata.id
left join leave_request 
	on leave_request.employee_id = employee.id
inner join leave 
	on leave_request.leave_id = leave.id
inner join contact_person 
	on contact_person.biodata_id = biodata.id
group by Nama_karyawan,jenis_cuti,alasan_cuti,nomor_telepon

--12.tampilkan alasan cuti yg paling sering diajukan karyawan
with table1 as(
select 
	leave_request.reason as alasan,
	count(leave_request.reason) as jumlah

	from
employee
inner join leave_request 
	on leave_request.employee_id = employee.id
group by alasan
)select * from table1 where jumlah = (select max(jumlah) from table1)

	
--13.tampilkan last_name,salary,bonus,dan salary_plus_bonus untuk 
---karyawan yg namanya mengandung minimal salah satu dari
---huruf vocal.Dimana bonus itu sebesar 20% dari salary

select
	biodata.last_name,
	employee.salary,
	(employee.salary + (employee.salary * 0.2)) as bonus,
	case
		when last_name ilike 'Aurelia Putri' then 'A'
		when last_name ilike 'Indriyani' then 'I'
		when last_name ilike 'Everdeen' then 'E'
		else 'tidak_huruf_vocal'
		end
	from
biodata
inner join employee on employee.biodata_id = biodata.id

-----------------------------------


--SOAL SQL


--Nomor 1

select
	employee.status as status_karyawan,
	count (employee.status)
	from
employee
inner join biodata on biodata.id = employee.biodata_id
group by status_karyawan


--Nomor 2

select
	biodata.first_name||' '||biodata.last_name as Nama_karyawan
	from
biodata
left join employee on employee.biodata_id = biodata.id where nip is null


--Nomor 3 => belum
select
	biodata.first_name||' '||biodata.last_name as Full_name,
	case
	when biodata.marital_status is true then 'Sudah Menikah'
		else 'Belum Menikah'
	end as merit,
	sum(case
		when family.status ilike 'anak' then 1
		else 0
	end) as anak
	from
biodata
left join family on family.biodata_id = family.id
group by Full_name,merit

--Nomor 4 
select 
	*
	from
	department;
	
--Nomor 5 => belum
select 
	dob as tahun_lahir
	from 
biodata 
inner join employee on employee.biodata_id = biodata.id

--Nomor 6
select
	biodata.*,
	position.name as Jabatan
	from 
biodata 
inner join employee 
	on employee.biodata_id = biodata.id 
inner join employee_position 
	on employee_position.employee_id = employee.id
inner join position
	on employee_position.position_id = position.id 

--Nomor 7 => belum
select 
	*
	from
biodata
where pob ilike 'Jakarta' and address not ilike '%jakarta%'

--Nomor 8 => belum
select
	biodata.first_name||' '||biodata.last_name as fullname,
	position.name as jabatan,
	date_part('year',age(now(),to_date(biodata.dob,'yyyy-mm-dd'))) || ' tahun' as tahun_lahir,
	sum(case
		when family.status ilike 'anak' then 1
		else 0
	end) as jum_anak
	from
biodata
left join employee on employee.biodata_id = biodata.id
inner join employee_position on employee_position.employee_id = employee.id
left join position on employee_position.position_id = position.id
left join family on family.biodata_id = biodata.id
group by fullname,jabatan,tahun_lahir
order by tahun_lahir desc;


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


--Nomor 9 
select
	biodata.first_name||' '||biodata.last_name as fullname,
	sum(date_part('day',age(leave_request.end_date,leave_request.start_date))) || ' hari' as jumlah_cuti
	
	from
biodata
left join employee on employee.biodata_id = biodata.id
inner join leave_request on leave_request.employee_id = employee.id
group by fullname
	

--Nomor 10 
select
	biodata.first_name||' '||biodata.last_name as fullname,
	travel_type.name as perjalanan,
	travel_request.start_date as tgl_perjalanan_dinas,
	travel_type.travel_fee + sum(travel_settlement.item_cost) as total_pengeluaran
	
	from
biodata
left join employee on employee.biodata_id = biodata.id
inner join travel_request on travel_request.employee_id = employee.id
inner join travel_settlement on travel_request_id = travel_settlement.id
inner join travel_type on travel_request.travel_type_id = travel_type.id
group by fullname,perjalanan,tgl_perjalanan_dinas,travel_fee


