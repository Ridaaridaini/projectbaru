--DDL

--buat database baru
create database batch324_2;

--menghapus database
drop database batch324_2;

--Bikin tabel
create table pegawai(
	id_pegawai integer primary key,
	umur integer,
	nama_pegawai text
);

--delate table
drop table pegawai;

create table ktp(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text
);

--lihat table yang telah dibuat
select * from ktp;

--rename kolom tabel ktp kolom ttl ke tempat tanggal lahir
alter table ktp 
rename column ttl to tempat_tgl_lahir;

--mengubah tipe data kolom jenis kelamin jadi boolean
alter table ktp
alter column jenis_kelamin type boolean Using jenis_kelamin::boolean;

--menghapus kolom tempat_tanggal_lahir 
alter table ktp
drop column tempat_tanggal_lahir;

--tambah kolom tanggal lahir tipe data date
alter table ktp
add column tgl_lahir date;

--DML
select * from pegawai;

--insert data cara1 (menyebutkan kolom)
insert into pegawai(id_pegawai,nama_pegawai)
values(1,'Rida');
insert into pegawai(nama_pegawai, id_pegawai)
values ('ika',2);

--insert data cara2 (data harus urut dan diisi semua)
insert into pegawai
values (3,20,'Dianty');

--insert multiple data
insert into pegawai (nama_pegawai,id_pegawai)
values 
('Riswan',4),
('Friska',5),
('Bagus',6);

--update pegawai
update pegawai
set umur =23
where id_pegawai =1;
update pegawai
set umur=23
where id_pegawai=2;
update pegawai
set nama_pegawai ='friska Sakurachan', umur=26
where id_pegawai=5;
update pegawai
set umur=20
where umur is null;

--delete pegawai
delete from pegawai
where id_pegawai =2;

--nampilkan semua kolom pada tabel
select * from pegawai;

--menampilkan kolom tertentu
select nama_pegawai, umur from pegawai;

--menampilkan nama
select nama_pegawai from pegawai;

--alias kolom yang ditampilkan
select nama_pegawai as nama from pegawai;
select nama_pegawai as "nama pegawai" from pegawai;

--order by (mengurutkan data bedasarkan kolom apa dan asc/dsc)
select * from pegawai
order by id_pegawai asc;
select * from pegawai
order by umur desc;

--distinct (menampilkan yang unik)
select distinct umur from pegawai;

--select where
--tampilkan pegawai yang umurnya 20
select * from pegawai
where umur =20;
--tampilkan pegawai umur 23 atau 26
select * from pegawai 
where umur= 23 or umur=26;
--tampilkan pegawai yang umurnya 20 dan mananya bagus
select * from pegawai
where umur=20 and nama_pegawai='Bagus';

--where in 
select * from pegwai
where umur in (23,26);

select * from pegawai
where nama_pegawai in ('Bagus','Rida');

--where between / diantara
select * from pegawai
where umur between 20 and 25;

--select where like/ contains / mengandung
--Cari nama pegawai yang awalannya
select * from pegawai
where nama_pegawai like 'R%';

--ilike -> incasesensitive  (tidak memperhatikan capital case)
select * from pegawai
where nama_pegawai ilike 'r%';

--cari nama pegawai yang akhirannya n
select * from pegawai
where nama_pegawai ilike '%n';

--cari nama pegawai yang mengandung huruf c
select * from pegawai
where nama_pegawai ilike '%c%';

--agregat
--AVG, MAX, MIN, SUM, COUNT
select 
	avg(umur) as "Rata-rata umur pegawai",
	max(umur) as "Maximal umur pegawai",
	min(umur) as "Minimal umur pegawai",
	sum(umur) as "Jumlah umur pegawai",
	count (umur) as "jumlah data"
from pegawai;

--Latihan film
create table  film(
	kd_film text primary key,
	nm_film text,
	pendapatan integer,
	nominasi integer
);
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
select * from film;
