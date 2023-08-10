--DDL
--Create Database
create database batch324_2;

--drop database
drop database batch324_2;

--create table
create table pegawai(
	id_pegawai integer primary key,
	umur INTEGER,
	nama_pegawai text
);

--drop table : untuk menghapus tabel

DROP table pegawai;

--buat table ktp
CREATE table ktp(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text
);

select * from ktp;

--rename koloumn table dari ttl ke tempat tanggal lahir

alter table ktp
rename column ttl to tempat_tanggal_lahir;

--ganti tipe data kolom jenis kelamin jadi boolean :: digunakan untuk mengganti tipe data
alter table ktp
alter column jenis_kelamin type boolean using jenis_kelamin :: boolean ;

--delete coloumn tempat tanggal lahir
alter table ktp
drop column tempat_tanggal_lahir;

--add column tanggal lahir tipe data date
alter table ktp
add column tgl_lahir date;


--DML
SELECT * FROM pegawai;

--insert data cara 1(menyebutkan kolom)
insert into pegawai (id_pegawai , nama_pegawai)
values(1, 'Rida');

INSERT into pegawai(nama_pegawai, id_pegawai)
values ('Ika', 2);

--insert data cara 2(data harus urut dan diisi semua)
INSERT into pegawai
values (3, 20, 'Dianty');

--akan error karena tidak insert data umur
insert into pegawai
values (3,'Dianty');

--insert multiple data
insert into pegawai (nama_pegawai, id_pegawai)
values
('Riswan' , 4),
('Friska', 5),
('Bagus', 6);


--update pegawai
UPDATE pegawai
set umur = 23
where id_pegawai =1;

update pegawai
set nama_pegawai = 'Friska sakurachan',umur =26
where id_pegawai = 5;

--delete pegawai
delete from pegawai
where id_pegawai = 2;

update pegawai
set umur=20
where umur is null;

--select semua kolomn di tabel ----
select * from pegawai;

select nama_pegawai, umur from pegawai;
SELECT nama_pegawai from pegawai;

--alias kolom yang ditampilkan
select
	nama_pegawai as nama
from pegawai;

select 
	nama_pegawai as "nama pegawai"
from pegawai;

--order by (mengurutkan data berdasarkan kolom apa dan asc/desc)
select * from pegawai
order by id_pegawai asc;

select * from pegawai
ORDER by umur desc;

--distinct (Mempilkan yang unik)
select distinct umur from pegawai;

--select where
--tampilkan pegawai yang umurnya 20
select * from pegawai
where umur=20;

--tampilkan pegawai yang umurnya 23 atau 26
select * from pegawai
where umur = 23 or umur = 26;

--tampilkan pegawai yang umurnya 20 dan namanya bagus
select * from pegawai
where umur=20 and nama_pegawai = 'Bagus';

--where in
select * from pegawai
where umur in(23,26);

select * from pegawai
where nama_pegawai in ('Rida','Bagus');

--where between
select * from pegawai
where umur BETWEEN 20 and 25;

--select where like/contain/mengandung
--cari nama pegawai yang awlanya R
select * from pegawai
where nama_pegawai like 'R%';

--ilike->incassensitive like (tidak memperhatikan capital case)
select * from pegawai
where nama_pegawai ilike 'r%';


--cari nama pegawai, yang akhirannya n
select * from pegawai
where nama_pegawai ilike '%n';

--cari nama pegawai yang mengandung huruf c
select * from pegawai
where nama_pegawai ilike '%c%';


--Aggregate
--AVG, MAX,MIN, SUM,COUNT, group by(dikelompokan berdasarkan kolom apa)

select 
	AVG (umur) as "Rata-rata umur pegawai",
	max(umur) as "maksimal umur pegawai",
	min(umur) as "minimal umur pegawai",
	sum(umur) as "jumlah umur pegawai",
	count(umur) as "jumlah data"
from pegawai;

--group by
--tampilkan data umur dan jumlah pegawai yang memiliki umur tsb
select 
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur;


--HAVING (fillter punya group by)
select 
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur
having umur=20 or umur=26;

--limit (batas banyaknya data yang ditampilkan)
select 
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur
having umur in (20,26)
limit 1;



--Latihan film
create table film(
	kd_film text primary key,
	nm_film text,
	pendapatan integer,
	nominasi integer
);

select * from film;

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


--Soal Latihan Film
--1 tampilkan nama film dan 
