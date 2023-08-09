--DDL

--Create Database (Membuat Database)
create database batch324_2;

--Drop Database (Menghapus Database)
drop database batch324_2;

--Create Table (Membuat Tabel)
create table pegawai(
	id_pegawai integer primary key,
	umur integer,
	nama_pegawai text
);

--Drop Table (Menghapus Tabel)
drop table pegawai;

--Membuat Tabel KTP
--NIK integer (Primary Key)
--Nama text
--TTL text
--Jenis_Kelamin text
--alamat text

create table KTP(
	NIK integer primary key,
	Nama text, TTL text,
	Jenis_Kelamin text,
	Alamat text
);

select*from ktp;

--rename kolom tabel, dari TTL -> Tempat_Tanggal_Lahir
alter table ktp
rename column TTL to Tempat_Tanggal_Lahir;


--Ganti tipe data kolom jenis_kelamin
alter table ktp
alter column jenis_kelamin type boolean USING jenis_kelamin::boolean;

--Hapus Kolom tempat_tanggal_lahir
alter table ktp
drop column tempat_tanggal_lahir;

--Tambah Kolom tanggal lahir tipe data date
alter table ktp
add column tgl_lahir date;

--DML
select * from pegawai;

--Insert data cara 1 : menyebutkan kolom
insert into pegawai (id_pegawai, nama_pegawai)
values (1,'Rida');
insert into pegawai (nama_pegawai, id_pegawai)
values ('ika',2);

--insert data cara 2 : data harus urut dan diisi semua
insert into pegawai
values (3,20,'Dianty');

--insert multiple data
insert into pegawai (nama_pegawai, id_pegawai)
values ('Riswan',4), ('Friska',5), ('Bagus',6);

--update tabel
update pegawai
set umur = 23
where id_pegawai = 1;

update pegawai
set nama_pegawai = 'Ika', umur = 26
where id_pegawai = 2;

update pegawai
set umur = 20
where umur is null;

--delete data tabel
delete from pegawai
where id_pegawai = 2;

--select semua kolom dalam tabel
select * from pegawai;

--select kolom tertentu
select nama_pegawai, umur from pegawai;

--alias kolom yang ditampilkan
select nama_pegawai as nama from pegawai;

select nama_pegawai as "Nama Pegawai" from pegawai;

--Order By (Mengurutkan data berdasarkan kolom apa dan asc/desc)
select * from pegawai order by id_pegawai asc;
select * from pegawai order by umur desc;

--Distinct (menampilkan yang unik, menghilangkan duplikat)
select distinct umur from pegawai;

--select where
--tampilkan pegawai yang umurnya 20
select * from pegawai
where umur = 20;

--Tampilkan pegawai yang umurnya 23 atau 20
select * from pegawai
where umur = 23 or umur = 20;

--tampilkan pegawai yang umurnya 20 dan namanya bagus
select * from pegawai
where nama_pegawai = 'Bagus' and umur = 20;


--Where in (pengganti or)
select * from pegawai
where umur in (23,20);

select * from pegawai
where nama_pegawai in ('Bagus', 'Rida');

--where between
select * from pegawai
where umur between 20 and 25; --20 dan 25 tetap masuk ke dalam data

--select where like / contains
--Cari nama pegawai yang awalannya R (R%)
select * from pegawai 
where nama_pegawai like 'R%';

--ilike -> incasesensitive like (ignore upper and lower case)
select * from pegawai 
where nama_pegawai ilike 'r%';


--cari nama pegawai yang akhirannya n (%n)
select * from pegawai
where nama_pegawai ilike '%n';

--cari nama pegawai yang mengandung huruf d (%d%)
select * from pegawai
where nama_pegawai ilike '%d%';

--aggregate
--AVG, MAX, MIN, SUM, COUNT
select avg(umur) as "Rata-rata umur pegawai",
max(umur) as "Max umur pegawai",
min(umur) as "Min umur pegawai",
sum (umur) as "Jumlah umur pegawai",
count(umur) as "Jumlah data"
from pegawai;

--GROUP BY (mengelompokkan berdasarkan kolom apa)

--tampilkan data umur dan jumlah pegawai yang memiliki umur tsb
 select umur, count(umur) as jumlah_pegawai from pegawai group by umur;
 
 
--HAVING (where nya si group by)
select umur, count(umur) as jumlah_pegawai from pegawai group by umur having umur = 20;

--LIMIT (batas banyaknya data yang ditampilkan)
select umur, count(umur) as jumlah_pegawai from pegawai group by umur having umur in(20,23) limit 1;

 
 
 

--Latihan Film
create table film(
	kd_film text primary key,
	nm_film text,
	pendapatan integer,
	nominasi integer --banyak mendapat nominasi
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
--1 tampilkan nama film dan nominasi dari nominasi yang terbesar

--2 tampilkan nama film dan pendapatan dari yang terkecil

--3 tampilkan nama film dan nominasi yang tidak dapat nominasi


select * from film;

--Jawaban nomor 1
select nm_film, nominasi from film order by nominasi desc;

--Jawaban nomor 2
select nm_film, pendapatan from film order by pendapatan asc;

--Jawaban nomor 3
select nm_film, nominasi from film where nominasi = 0;

-- 4 tampilkan nama film dan nominasi yang paling banyak mendapatkan nominasi (nominasi itu jumlah bukan urutan)
--step 1
select max(nominasi) from film;
--step 2
select nm_film, nominasi from film where nominasi = 5;
--step 3
select nm_film, nominasi from film where nominasi = (select max(nominasi) from film);

--5 tampilkan nama film dan pendapatan yang terbesar
select nm_film, pendapatan from film where pendapatan = (select max(pendapatan) from film);

--6 tampilkan nama film dan pendapatan yang terkecil
select nm_film, pendapatan from film where pendapatan = (select min(pendapatan) from film);

--7 tampilkan rata2 pendapatan film keseluruhan
select AVG(pendapatan) as "Rata-Rata Pendapatan" from film;

--8 tampilkan rata2 nominasi film keseluruhan
select round(AVG(nominasi)) as "Rata-Rata Nominasi" from film;

--floor (pembulatan ke bawah)
--ceil (pembulatan ke atas)
--round (pembulatan terdekat /default pembulatan)

--hasil 2 angka dibelakang koma
select round(2.1234,2);

--9 tampilkan nama film yang huruf depannya 'p' (not case sensitive)
select nm_film from film where nm_film ilike 'p%';

--lower(mengubah semua menjadi lowercase)
--upper (mengubah semua menjadi uppercase)

select nm_film from film where UPPER(nm_film) like UPPER('p%');
select nm_film from film where LOWER(nm_film) like LOWER('p%');

--10 tampilkan nama film yang huruf terakhirnya 's' (not case sensitive)
select nm_film from film where nm_film ilike '%s';

--11 tampilkan nama film yang mengandung huruf 'd'
select nm_film from film where nm_film ilike '%d%';

--12 tampilkan nama film dengan pendapatan terkecil yang mengandung 'h'
--select nm_film, min(pendapatan) as pendapatan from film group by nm_film having nm_film ilike '%h%' order by min(pendapatan) asc;

select nm_film, pendapatan from film where nm_film ilike '%h%' and pendapatan = (select min(pendapatan) from film where nm_film ilike '%h%');


--13 tampilkan nama film dengan pendapatan terbesar yang mengandung huruf 'd'
--select nm_film, max(pendapatan) as pendapatan from film group by nm_film having nm_film ilike '%d%' order by max(pendapatan) desc limit 1;

select nm_film, pendapatan from film where nm_film ilike '%d%' and pendapatan = (select max(pendapatan) from film where nm_film ilike '%d%');





