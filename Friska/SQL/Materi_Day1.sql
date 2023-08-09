--DDL 

--create database
create database batch324_2;

--drop database
drop database batch324_2;

--create table
create table pegawai(
	id_pegawai INTEGER primary key,
	umur INTEGER,
	nama_pegawai text
)

--drop table
drop table pegawai;

--create table datadiri

create table datadiri(
	nik INTEGER primary key,
	nama text,
	tempat_tanggal_lahir text,
	jenis_kelamin text,
	alamat text
);

select * from datadiri;

--rename kolom tabel, dari tempat_tanggal_lahir -> ttl
alter table datadiri
rename column tempat_tanggal_lahir to ttl;

--ganti tipe data kolom jenis_kelamin -> boolean
alter table datadiri
alter column jenis_kelamin type boolean USING jenis_kelamin::boolean;

--hapus/delete kolom, ttl
alter table datadiri
drop column ttl;

--tambah kolom tanggal lahir tipe data date
alter table datadiri
add column tg_lahir date;

--DML
select * from pegawai;

--insert data cara 1 (menyebutkan kolom)
insert into pegawai (id_pegawai,nama_pegawai)
values (1,'Ridam');


insert into pegawai (nama_pegawai, id_pegawai)
values ('Ika',2)

--insert cara 2 (data harus urut dan diisi semua)
insert into pegawai
values (3,20,'Dianty');

--insert multiple data
insert into pegawai (nama_pegawai, id_pegawai)
values
('Riswan',4),
('Friska',5),
('Bagus',6);

--update pegawai
update pegawai
set umur = 23
where id_pegawai = 1;



update pegawai 
set nama_pegawai ='Friska Sakurachan', umur = 26
where id_pegawai = 5;

update pegawai
set umur = 20
where umur is null

--delete pegawai
delete from pegawai
where id_pegawai = 2;


--select semua kolom didalam tabel
select * from pegawai;

--select kolom tertentu
select nama_pegawai, umur from pegawai;
select nama_pegawai from pegawai;

--alias kolom yang ditampilkan
select
	nama_pegawai as nama
from pegawai;

select 
	nama_pegawai as "Nama Pegawai"
from pegawai;

--Order By (Mengurutkan data berdasrkan kolom apa dan asc/desc)
select * from pegawai
order by id_pegawai asc;

select * from pegawai
order by umur desc;

--distinct (menampilkan yang unik)
select distinct umur from pegawai;

--select where

--tampilkan pegawai yang umur nya 20
select * from pegawai
where umur = 20;

--Tampilkan pegawai 23 atau 26
select * from pegawai
where umur = 23 or umur = 26;

--Tampilkan pegawai yang umurnya 20 dan namanya Bagus
select * from pegawai
where umur = 20 and nama_pegawai ='Bagus';

--where in
select * from pegawai
where umur in (23,26);

select * from pegawai
where nama_pegawai in ('Bagus','Ridam');

--where between
select* from pegawai
where umur between 20 and 25;

--select where like/ contains / mengandung
-- Cari nama pegawai, yang awalnya R

select * from pegawai
where nama_pegawai like 'R%';

--ilike -> incasesensitive like (tidak memperhatikan case)
select * from pegawai
where nama_pegawai ilike 'r%';

--cari nama pegawai, yang akhirnya n
select * from pegawai
where nama_pegawai ilike '%n';

--cari nama pegawau, yang mengandung huruf c
select * from pegawai
where nama_pegawai ilike '%C%';

--Agregat
--avarage, MAX, MIN, SUM, COUNT
select 
	avg(umur) as "Rata-rata umur pegawai",
	max(umur) as "Maksimal umur pegawai",
	min(umur) as "Minimal umur pegawai",
	sum(umur) as "Jumlah umur pegawai",
	count(umur) as "Jumlah data"
from pegawai;

--Group By (Dikelompokkan berdasarkan kolom apa)
select * from pegawai;

--tampilkan data umur dan pegawai yang memilki umur tersebut
select
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur;

--having(where si group by)
select
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur
having umur = 20;

--limit(batas banyaknya data yang ditampilkan)

select
	umur,
	count(umur) as "jumlah pegawai"
from pegawai
group by umur
having umur in(20,23,26)
limit 2;

--floor (buletin kebawah)
select floor(2.5)
-- ceil (buletin keatas)
select ceil (2.5)
--round (buletin yang terdekat)
select round(2.5)

-- lower (mengubah semua menjadi lower case)
select lower ('Rida');
--upper (mengubah semua menjadi upper case)
select upper ('bagus');



