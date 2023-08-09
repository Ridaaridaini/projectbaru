--DDL

--create database
create database batch324_2;

--drop database
drop dAtAbAsE batch324_2;

--create table
create table pegawai(
	id_pegawai INTEGER primary key,
	umur INTEGER,
	nama_pegawai text
);

--drop table
drop table pegawai;

--buat tabel ktp
create table ktp(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text
);

select * from ktp;

--rename kolom tabel, dari ttl -> tempat_tgl_lahir
alter table ktp
rename column ttl to tempat_tgl_lahir;

--ganti tipe data kolom jenis_kelamin -> Boolean
alter table ktp
alter column jenis_kelamin 
type boolean USING jenis_kelamin::boolean;

--delete kolom tempat_tgl_lahir
alter table ktp
drop column tempat_tgl_lahir;

--add kolom tanggal lahir tipe data date
alter table ktp
add column tgl_lahir date;

--DML
select * from pegawai;

--insert data cara 1 (menyebutkan kolom)
insert into pegawai(id_pegawai,nama_pegawai)
values (1,'Rida');
insert into pegawai(nama_pegawai,id_pegawai)
values ('Ika',2);

--insert data cara 2 (data harus urut, dan diisi semua)
insert into pegawai
values (3,20,'Dianty');

--Error karena tidak insert data umur
--insert into pegawai values (3,'Dianty');

--insert mutiple data
insert into pegawai (nama_pegawai,id_pegawai)
values
('Riswan',4),
('Friska',5),
('Bagus',6);

--update pegawai
update pegawai
set umur = 23
where id_pegawai = 1;

update pegawai
set nama_pegawai = 'Friska Sakurachan', umur = 26
where id_pegawai = 5;

update pegawai
set umur = 20
where umur is null;

--delete pegawai
delete from pegawai
where id_pegawai = 2;

--Select semua kolom di tabel...
select * from pegawai;

--select kolom tertentu
select nama_pegawai,umur from pegawai;
select nama_pegawai from pegawai;

--alias kolom yang ditampilkan
select 
	nama_pegawai as nama
from pegawai;

select
	nama_pegawai as "Nama Pegawai"
from pegawai;

--Order By (Mengurutkan data berdasarkan kolom apa dan asc/desc)
select * from pegawai
order by id_pegawai asc;

select * from pegawai;
order by umur desc;

--distinct (menampilkan yang unik)
select distinct umur from pegawai;

--select where
--Tampilkan pegawai yang umurnya 20
select * from pegawai
where umur = 20;

--Tampilkan pegawai yang umurnya 23 atau 26
select * from pegawai
where umur = 23 or umur = 26;

--Tampilkan pegawai yang umurnya 20 dan namanya Bagus
select * from pegawai
where umur = 20 and nama_pegawai = 'Bagus';

--where in
select * from pegawai
where umur in (23,26);

select * from pegawai
where nama_pegawai in ('Bagus','Rida');

--where between / diantara
select * from pegawai
where umur between 20 and 25;

-- select where like / contains / mengandung
-- Cari nama pegawai, yang awalannya R
select * from pegawai
where nama_pegawai like 'R%';

--ilike -> tidak memperhatikan capital case
select * from pegawai
where nama_pegawai ilike 'r%';

--cari nama pegawai, yang akhirannya n
select * from pegawai
where nama_pegawai ilike '%n';

--cari nama pegawai, yang mengandung huruf c
select * from pegawai
where nama_pegawai ilike '%C%';

--Agregat
--AVG, MAX, MIN, SUM, COUNT
select
	avg(umur) as "Rata-rata umur pegawai",
	max(umur) as "Maximal Umur Pegawai",
	min(umur) as "Minimum Umur pegawai",
	sum(umur) as "Jumlah umur pegawai",
	count(umur) as "Jumlah data"
from pegawai;

--Group By (dikelompokkan berdasarkan kolom apa)
select * from pegawai;
--tampilkan data umur dan jumlah pegawai yang memiliki umur tsb
select 
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur;

--having (filternya si group by)
select 
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur
having umur = 23 or umur = 26;

--limit (batas banyaknya data yang ditampilkan)
select 
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur
having umur in (20,23,26)
limit 2;


--Latihan Film
create table film(
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

--Soal Latihan Film
--1 tampillkan nama film dan nominasi dari nominasi yg terbesar
select
	nm_film as "Nama Film",
	nominasi
from film
order by nominasi desc;

--2 tampilkan nama film dan pendapatan dari pendapatan yg terkecil
select nm_film as "Nama film",pendapatan from film order by pendapatan asc;

--3 tampilkan nama film dan nominasi yg tidak dapat nominasi
select nm_film as "Nama film", nominasi from film where nominasi=0;

--4 tampilkan nama film dan nominasi yg paling banyak mendapatkan nominasi
--step 1
select max(nominasi) from film;
--step 2
select 
	nm_film as "Nama Film",
	nominasi
from film
where nominasi = 5;
--step 3
select 
	nm_film as "Nama Film",
	nominasi
from film
where nominasi = (select max(nominasi) from film);

--5 tampilkan nama film dan pendapatan yg terbesar
select nm_film as "Nama Film", pendapatan as "Pendapatan"
	from film
	where pendapatan = (select max(pendapatan) from film);

--6 tampikan nama film dan pendapatan yg terkecil
select nm_film as "Nama Film", pendapatan
from film where pendapatan = (select min(pendapatan) from film);

--7 tampilkan rata2 pendapatan film keseluruhan
select avg (pendapatan) as "Rata-rata pendapatan film" from film;



--8 tampilkan rata2 nominasi film keseluruhan
select avg (nominasi) as "Rata-rata Nominasi"
from film;

--floor (buletin ke bawah)
select floor(2.5);
--ceil (buletin ke atas)
select ceil(2.5);
--round (buletin yang terdekat)
select round(2.5);
select round(2.981273,2); --2 angka dibelakang koma

select round(avg (nominasi),2) as "Rata-rata Nominasi"
from film;

--9 tampilkan nama film yg huruf depannya 'p' (not case sensitive)
select nm_film as "Nama Film" from film where nm_film ilike 'p%';

--lower (mengubah semua jadi lower case)
select lower('Rida');
--upper (mengubah semua jadi upper case)
select upper('bagus');

select nm_film as "Nama Film" from film where UPPER(nm_film) like UPPER('p%');
select nm_film as "Nama Film" from film where LOWER(nm_film) like LOWER('p%');


--10 tampilkan nama film yg huruf terakhirnya 's' (not case sensitive)
select nm_film as "Nama Film" from film
where nm_film ilike '%s';










--11 tampilkan nama film yang mengandung huruf 'd'
SELECT nm_film AS "Nama Film" FROM film WHERE nm_film ILIKE '%d%';

--12 tampilkan nama film dengan pendapatan terkecil yg mengandung huruf 'h'
Select nm_film AS "nama film" from film where nm_film ilike '%h%'
and pendapatan =(select min(pendapatan)from film where nm_film ilike '%h%');
select 
	nm_film as "Nama film" ,
	pendapatan
from film
where nm_film ilike '%h%'
and pendapatan=(select min (pendapatan)from film where nm_film ilike '%h%');



--13 tampilkan nama film dengan pendapatan terbesar yg mengandung huruf 'd'
select nm_film from film where nm_film ilike '%d%' 
and pendapatan = (select max(pendapatan) from film where nm_film ilike '%d%');












