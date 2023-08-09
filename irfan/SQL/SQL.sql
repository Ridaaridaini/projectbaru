--DDL

--create database
create database batch324_2

--delete database
drop database batch324_2;

--create table
create table pegawai(
	id_pegawai integer primary key,
	umur integer,
	nama_pegawai text

);

--drop table
drop table pegawai;

--buat tabel ktp
--nik int pk
--nama text
-- ttl text
-- jenis_kelamin text
--alamat text

--buat table ktp
create table ktp(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text
	
);

--melihat table
select * from ktp;

--rename kolom table, dari ttl -> tempat_tgl_lahir
alter table ktp
rename column ttl to tempat_tgl_lahir;

-- ganti tipe data kolom jenis_kelamin_> boolean
alter table ktp
alter column jenis_kelamin type boolean using jenis_kelamin::boolean

--delete column tempat tanggal_lahir
alter table ktp
drop column tempat_tgl_lahir;

--tambah kolom tanggal lahir tipe data date
alter table ktp
add column tgl_lahir date;

--DML
select * from pegawai;

--insert data cara 1(menyebutkan kolom)
insert into pegawai(id_pegawai,nama_pegawai)
values (1,'Irfan');
insert into pegawai(nama_pegawai,id_pegawai)
values('alvin',2);

--cara 2 insert data ( data harus urut, dan diisi semua)
insert into pegawai
values (3,20,'bagus');


--insert multiple data
insert into pegawai(nama_pegawai,id_pegawai)
values
('riswan',4),
('rida',5),
('baim',6);

--update pegawai
update pegawai
set umur = 23
where id_pegawai = 1;

update pegawai
set nama_pegawai ='friska sakurachan', umur = 26
where id_pegawai = 5 ;


-- delete pegawai
delete from pegawai
where id_pegawai = 2;

update pegawai
set umur = 20
where umur is null;

--select semua kolom table pegawai
select * from pegawai

--select kolom  tertentu
select nama_pegawai,umur from pegawai
select nama_pegawai from pegawai;

--alias kolom yang ditampilkan
select 
	nama_pegawai as nama
from pegawai;

select 
	nama_pegawai as "Nama Pegawai"
from pegawai;


--order by (mengurutkan data berdasarkan kolom apa dan asc/desc)
select * from pegawai
order by id_pegawai asc;

select * from pegawai
order by umur desc;

--distinct (menampilan yang unik)
select distinct umur from pegawai;


-- select where
-- Tampilkan pegawai yang umur 20
select * from pegawai
where umur = 20;

--tampilan pegawai yang umur 23 atau 26
select * from pegawai
where umur = 23 or umur = 26;

--tampilan pegawai umur 20 dan namanya irfan
select * from pegawai
where umur = 20 and nama_pegawai ='riswan';

--where in
select * from pegawai
where umur in(23,26);

select * from pegawai
where nama_pegawai in('friska sakurachan','Irfan');

-- where between / diantara
select * from pegawai
where umur between 20 and 25;


--select where like / contains / mengandung
--cari nama pegawai, yang awalannya R
select * from pegawai
where nama_pegawai like 'r%'

--ilike -> incasesensitive like ( tidak memperhatikan capital case)
select * from pegawai
where nama_pegawai ilike 'R%'

--cari nama pegawai yang akhirannya n
select * from pegawai
where nama_pegawai ilike '%n'

--cari nama pegawai, yang mengandung huruf c
select * from pegawai
where nama_pegawai ilike '%c%'


--Agregat
--AVG ,MAX ,MIN ,SUM ,COUNT
select 
	avg (umur) as "Rata-rata umur pegawai",
	max (umur) as "max umur pegawai",
	min (umur) as "min umur pegawai",
	sum (umur) as " jumlah umur pegawai",
	count (umur) as "jumlah data"
from pegawai;

--latihan film

create table film(
	kd_film text primary key,
	nm_film text,
	pendapatan integer,
	nominasi integer
);

select * from film

insert into film values
('F001','IRON MAN',2000000000,3),
('F002','IRON MAN 2',1800000000,2),
('F003','IRON MAN 3',1200000000,0),
('F004','AVENGER:CIVIL WAR',2000000000,1),
('F005','SPIDERMAN HOME COMING',1300000000,0),
('F006','THE RAID',800000000,5),
('F007','FAST & FURIOUS',830000000,2),
('F008','HABIBI DAN AINUN',670000000,4),
('F009','POLICE STORY',700000000,3),
('F010','POLICE STORY 2',710000000,1),
('F011','POLICE STORY 3',615000000,0),
('F012','RUSH HOUR',695000000,2),
('F013','KUNGFU PANDA',923000000,5);

--soal latihan film
--1.tampilkan nama film dan nominasi dari nominasi yang terbesar



select * from film
where nominasi between 1 and 2;

select * from film
where nominasi = 1;

