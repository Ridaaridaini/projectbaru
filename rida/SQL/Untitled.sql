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
------------------------------------------------------------------------------------------
--fungsi concat : menggabungkan 2 atau lebih text
select 
	first_name,
	last_name,
	concat(first_name,' ',last_name) as full_name,
	first_name || ' '|| last_name as full_name
from biodata;

--fungsi now() :mengambilkan waktu sekrang
select now();
--fungsi date_part() : mengambil/ extract dari bagian waktu
select date_part('year', now());
select date_part('month',now() );

--Latihan 
--tmapilkan dob(text), dob(date), tahun lahir seluruh biodata
select
	dob,
	to_date(dob,'YYYY-MM-DD'),
	date_part('year',to_date(dob,'YYYY-MM-DD')),
	extract(year from to_date(dob,'YYYY-MM-DD')),
	to_char(to_date(dob,'YYYY-MM-DD'), 'DD-MM-YYYY')
from biodata;
--fungsi age()-untuk menghitung selisih dari date
select
	'27-05-2000',
	to_date('27-05-2000', 'dd-mm-yyyy'),
	age(now(),to_date('27-05-2000', 'dd-mm-yyyy')),
	date_part('year', age(now(),to_date('27-05-2000', 'dd-mm-yyyy'))) || ' tahun';

--cese when end -> kondisi percabangan di sql
select 
	pob,
	case
		when pob ilike 'jakarta' then 'jekardah'
		when pob ilike 'bali' then 'bali skuy'
		else 'kota lain'
	end
from biodata;
--Latihan
--1 Tampilkan fullname, jabatan, usia & jumlah anak dari masing-masing karyawan
select 
	b.first_name||' '|| b.last_name as "Full name",
	p.name as "Jabatan",
	date_part('year',age(now(),to_date('27-05-2000', 'dd-mm-yyyy'))) || ' Tahun' as "Usia",
	sum(case 
		when f.status ilike 'anak' then 1
		else 0
	end) as jml_anak
from biodata b
full outer join employee e
	on b.id = e.biodata_id
join employee_position ep
	on ep.employee_id = e.id
right join position p
	on p.id= ep.position_id
left join family f
	on f.biodata_id= b.id
group by "Full name", "Jabatan", "Usia";
--2 Hitungan berapa hari cuti yang sudah di ambil masing-masing karyawan
select
	b.first_name ||' '|| b.last_name as "full name",
	coalesce (sum (date_part ('day',age(lr.end_date,lr.start_date))),0)
from biodata b
full outer join employee e
	on b.id =e.biodata_id
full outer join leave_request lr
	on e.id = lr.employee_id
group by "full name";

--3 Tampilkan fullName dan jabatan 3 karywan paling tua
select 
	b.first_name ||' '|| b.last_name as "Full name",
	p.name as "Jabatan",
	date_part('year',age(now(),to_date(dob,'yyyy-mm-dd'))) || ' Tahun' as "Usia"
from biodata b
join employee e
	on e.biodata_id = b.id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
order by "Usia" desc limit 3;

--4 Tampilkan nama pelamar yang tidak diterima karyawan
select
	b.first_Name||' '|| b.last_name as "Nama"
from biodata b
left join employee e
	on e.biodata_id =b.id
where e.nip is null;

--5 hitung  berapa rata-rata gaji karyawan dengan level staff
select 
	round (avg(e.salary),2)
from employee e
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
where p.id= 4;

--6 urutkan nama-nama karyawan dan statusnya, diurutkan dari yang paling tua ke yang paling muda
select
	b.first_name ||' '|| b.last_name as "Nama",
	e.status,
	date_part ('year',age(now(),to_date(dob,'YYYY-MM-DD')))||' Tahun' as "Usia"
from biodata b
join employee e
	on e.biodata_id = b.id
order by date_part ('year',age(now(),to_date(dob,'YYYY-MM-DD'))) desc;
--7 tampilkan last name dengan huruf kapital, dimana last namenya diawali dengan huruf m
select
	upper (last_name ) 
from biodata 
where last_name ilike 'm%'
--8 tampilkan employee id, fullname, salary_lama, dan salary_baru
--dimana salary baru itu sebesar 10% lebih besar dari salary lama
--dan tampilkan dengan kolom alias gaji baru 
select
	e.id as "employee id",
	b.first_name||' '||b.last_name as "Full Name",
	e.salary as "salary lama",
	round((e.salary+((e.salary*10)/100)),0)
from biodata b
join employee e
	on b.id =e.biodata_id
--9 tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas,
-- dan total pengeluarannya selama dinas tersebut
select
	b.first_name ||' '|| b.last_name as "Nama karyawan",
	tt.name as "jenis perjalanan dinas",
	tr.start_date,
	sum(ts.item_cost)+
	tt.travel_fee as "pengeluaran dinas"
from biodata b
join employee e
	on b.id = e.biodata_id
join travel_request tr
	on e.id = tr.employee_id
join  travel_type tt
	on tr.travel_type_id = tt.id
join travel_settlement ts
	on tr.id = ts.travel_request_id
group by "Nama karyawan", "jenis perjalanan dinas",tr.start_date,tt.travel_fee

--10. buatlah query untuk menampilkan data karyawan yang belum pernah melakukan perjalanan dinas
select
	b.first_name||' '|| b.last_name as "karyawan"
from biodata b
right join employee e
	on b.id = e.biodata_id
left join travel_request tr
	on e.id= tr.employee_id
where tr.start_date is null
	
--11 tampilkan nama lengkap karyawan, jenis cuti, alasancuti, durasi cuti
--dan nomor telpn yang bisa dihubungi untuk masing-masing karyawan yang mengajukan cuti
select 
	b.first_name||' '||b.last_name as "nama karyawan",
	l.type as "jenis cuti",
	lr.reason as "alasan cuti",
	age(lr.end_date,lr.start_date) as "durasi cuti",
	cp.contact
from biodata b
join employee e
	on 	b.id = e.biodata_id
join leave_request lr
	on lr.employee_id =e.id
join leave l
	on lr.leave_id = l.id
join contact_person cp
	on cp.biodata_id = b.id
where cp.type='PHONE'

--12 tampilkan alasan cuti yang paling sering diajukan karyawan
select 
	lr.reason
from biodata b
join employee e
	on b.id =e.biodata_id
join leave_request lr
	on lr.employee_id = e.id
--13 tampilkan last name, salary, bonus
--dan salary_plus_bonus untuk karyawan yang namanya mengandung minimal salah satu
--dari huruf vocal. dimana bonus itu sebesar 20% dari salary










