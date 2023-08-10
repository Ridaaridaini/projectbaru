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

----------------------------------------------------------------------------------------------------------

--fungsi concat (menggabungkan text)

select first_name, last_name, 
concat(first_name, ' ', last_name) as full_name
from biodata;


--fungsi now () :mengambil waktu sekarang
select now();

--fungsi date_part() : untuk mengekstrak dari bagian waktu
select date_part('year', now());
select date_part ('month', now());

--fungsi to_date() : konversi dari string ke date
select to_date('10-08-2023', 'DD-MM-YYYY');

--mengekstrak bagian waktu setelah to_date
select date_part('year', to_date('10-08-2023', 'DD-MM-YYYY'));


--tampilkan dob (text), dob (date), tahun lahir seluruh biodata
select dob, to_date(dob, 'YYYY-MM-DD'), date_part('year', to_date(dob, 'YYYY-MM-DD'))
from biodata; --INGAT PATTERN TANGGAL HARUS SAMA DENGAN STRINGNYA

--Fungsi Age() - menghitung selisih dari 2 date
select '07-03-1998',
to_date('07-03-1998', 'DD-MM-YYYY'),
age(now(), to_date('07-03-1998', 'DD-MM-YYYY')),
date_part('year', age(now(), to_date('07-03-1998', 'DD-MM-YYYY'))); --ini mengambil tahun dalam arti umur yaa


--case when end ->kondisi percabangan SQL
select pob,
case 
   when pob ilike 'jakarta' then 'Jekardah'
   when pob ilike 'bali' then 'Bali wow'
   else 'kota lain'
   end
from biodata;

--1 TAMPILKAN FULLNAME, JABATAN, USIA & JUMLAH ANAK DARI MASING2 KARYAWAN
--Fullname
select concat(first_name, ' ', last_name) as Full_Name from biodata 

--Jabatan 
select position.name from position;

--Usia
select to_date(dob, 'YYYY-MM-DD'),
age(now(), to_date(dob, 'YYYY-MM-DD')),
date_part('year', age(now(), to_date(dob, 'YYYY-MM-DD'))) || ' tahun'
from biodata;

--Ambil kolom usia aja
select 
date_part('year', age(now(), to_date(dob, 'YYYY-MM-DD'))) || ' tahun'
from biodata;

--Jumlah anak
select biodata.first_name, count(family.status) as jumlah_anak
from biodata
inner join family
on biodata.id = family.biodata_id
where status = 'Anak'
group by first_name;


--PENGGABUNGAN SEMUA
select concat(first_name, ' ', last_name) as Full_Name, position.name as "Nama Posisi",
date_part('year', age(now(), to_date(dob, 'YYYY-MM-DD'))) || ' tahun' as Usia,
sum(case 
  when family.status ilike 'Anak' then 1
  else 0
  end) as Jumlah_Anak
from biodata
inner join employee
on biodata.id = employee.biodata_id
inner join employee_position
on employee.id = employee_position.employee_id
inner join position
on employee_position.position_id = position.id
left join family
on biodata.id = family.biodata_id
group by full_name,"Nama Posisi", Usia;

----------------------------------------------------------------------------------

--2 HITUNG BERAPA HARI CUTI YANG SUDAH DIAMBIL MASING2 KARYAWAN
--hitung cuti
select age(end_date, start_date) as lama_cuti 
from leave_request;

select date_part('day', age(end_date, start_date)) from leave_request;

--gabung tabel biodata, employee, dan leave_request
select biodata.first_name, coalesce(sum(date_part('day', age(end_date, start_date))),0) as lama_cuti
from biodata
left join employee
on biodata.id = employee.biodata_id
left join leave_request
on employee.id = leave_request.employee_id
group by first_name;

-------------------------------------------------------------------------
--3 TAMPILKAN FULLNAME DAN JABATAN 3 KARYAWAN PALING TUA
--tampilkan fullname
select concat(first_name, ' ',last_name) as full_name
from biodata;

--Menghitung usia karyawan dan mencari yang paling tua
select date_part('year',age(now(), to_date(dob, 'yyyy-mm-dd'))) || ' tahun' as Usia
from biodata;

--Karyawan paling tua
select first_name, date_part('year',age(now(), to_date(dob, 'yyyy-mm-dd'))) || ' tahun' as usia
from biodata
order by usia desc limit 3;

--gabung semua
select concat(first_name, ' ', last_name) as full_name, position.name as nama_jabatan
from biodata
inner join employee
on biodata.id = employee.biodata_id
inner join employee_position
on employee.id = employee_position.employee_id
inner join position
on employee_position.position_id = position.id
order by date_part('year',age(now(), to_date(dob, 'yyyy-mm-dd'))) desc limit 3;

----------------------------------------------------------------------------
--4 TAMPILKAN NAMA NAMA PELAMAR YANG TIDAK DITERIMA KARYAWAN
select concat(first_name, ' ', last_name) as full_name
from biodata
left join  employee
on biodata.id = employee.biodata_id
where employee.status is null;


--5 HITUNG BERAPA RATA2 GAJI KARYAWAN DENGAN LEVEL STAFF 
select avg(salary) as "Rata-Rata Gaji Staff"
from biodata
inner join employee
on biodata.id = employee.biodata_id
inner join employee_position
on employee.id = employee_position.employee_id
inner join position
on employee_position.position_id = position.id
where position.name = 'Staff';

