--DDL

--create database
create database batch324_2;

--drop database;
drop database batch324_2;

--create table pegawai

create table pegawai (
	id_pegawai integer primary key,
	umur text,
	nama_pegawai text
);

--drop table pegawai

drop table pegawai;

-- table ktp
create table ktp(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text

);

-- lihat isi table

select*from ktp;

-- rename nama kolom table
alter table ktp
rename column ttl to tempat_tanggal_lahir;

-- ganti type data
alter table ktp
alter column jenis_kelamin type boolean USING jenis_kelamin::boolean;

-- delete table
alter table ktp
drop column tempat_tanggal_lahir;

-- tambah kolom
alter table ktp
add column tanggal_lahir date;


--DML
select*from pegawai;

--insert data
--cara satu(boleh tidak urut, dan boleh ada tabel yang tidak di isi)
insert into pegawai (id_pegawai, nama_pegawai) values (1, 'Rida');

--cara dua(harus urut, dan harus di isi semua)
insert into pegawai values (2,23,'Ika');

--Insert multiple data
insert into pegawai (nama_pegawai, id_pegawai)
values
('Friska', 7),
('Danty', 8),
('Alvin', 9),
('Irfan', 10);

--update data
update pegawai set umur = 23 where id_pegawai = 1;
update pegawai set nama_pegawai = 'Bagus Iman Prasetyo', umur = 23;
update pegawai set umur = 20 where umur is null;

--delete data
delete from pegawai where id_pegawai = 2;

--select data
select nama_pegawai, umur from pegawai;

--alias kolom yang di tampilkan

select nama_pegawai as nama_peserta from pegawai;

select nama_pegawai as "Nama Pegawai Magang" from pegawai;

select * from pegawai order by id_pegawai asc;

--distinct

select distinct nama_pegawai from pegawai;

select * from pegawai where umur='23';

select * from pegawai where umur = '20' and nama_pegawai ='Friska'

alter table pegawai
alter column umur type integer USING umur :: integer;

select * from pegawai where umur between 20 and 23;

--select where like(D% di depan buat nyari nama depan diawali huruf D. 
--%N buat nyari nama yang di akhiri hurun N. %C% mencari di tengah tengah ada huruf C)

select * from pegawai where nama_pegawai like 'D%';

--Agregate
-- avg, max, min, sum, count, group by, having

--group by
select * from pegawai;

select 
	umur,
	count(umur) as "Jumlah Pegawai"
from pegawai group by umur; 

--having
select 
	umur,
	count(umur) as "Jumlah Pegawai"
from pegawai group by umur having umur = 20; 

-- agregat
select 
	avg(umur) as "Rata-rata pegawai",
	max(umur) as "Umur paling tua",
	min(umur) as "Umur paling muda",
	sum(umur) as "Total umur",
	count(umur) as "Jumlah data"
from pegawai;

-- Limit --
select 
	umur,
	count(umur) as "Jumlah Pegawai"
from pegawai group by umur having umur in(20,23)
limit 1; 

--floor(buletin ke bawah)
select floor(2.5);

--ceil(buletin ke atas)
select ceil (2.5);

--round(buletin yang terdekat)
select round (2.5);

-- nentuin berapa angka di belakang koma
select round (2.238592,2);

--lower
select lower ('BaGus');

--upper
select upper ('RIDa');









--- LATIHAN ---
--Create table

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

-- menampilkan nama film dan nominasi dari nominasi yang terbesar
select nm_film, nominasi from film order by nominasi desc;

-- menampilkan nam film dan pendapatan dari pendapatan terkecil
select nm_film, pendapatan from film order by pendapatan asc;

-- menampilkan nama filam dan nominasi dimana nominasi = 0
select nm_film, nominasi from film where nominasi = 0;

-- menampilkan nama film dan nominasi yang paling banyak mendapatkan nominasi

select nm_film, nominasi
from film where nominasi = (select max(nominasi) from film);

-- menampilkan nama film dan pendapatan yang terbesar
select nm_film as "Nama Film", pendapatan from film 
where pendapatan = (select max(pendapatan) from film);
	
-- menampilkan nama film dan pendapatan yang terbesar
select nm_film "Nama Film", pendapatan from film
where pendapatan = (select min (pendapatan) from film);

-- tampilkan rata2 pendapatan film keseluruan
select avg (pendapatan) from film;

-- tampilkan rata2 nominasi film keseluruhan
select avg (nominasi) from film;

-- tampilkan film yang judul nya di awali huruf p
select*from film where nm_film ilike 'p%'; 
select nm_film as "Nama Film" from film where nm_film ilike 'p%';

--tampilkan nama film berakhiran huruf s
select nm_film as "Nama Film" from film where nm_film ilike '%s';

--tampilkan nama film yang mengandung huruf d
select nm_film as "Nama Film" from film where nm_film ilike '%d%';

--tampilkan nama film dengan pendatapan terkecil yang mengandung huruf h
select nm_film as "Nama Film", pendapatan 
from film 
where pendapatan = (select min(pendapatan) from film where nm_film ilike '%h%');


--tampilkan nama film dengan pendapatan terbesar yang mengandung huruf d
select nm_film as "Nama Film", pendapatan 
from film where nm_film ilike '%d%' 
and pendapatan = (select max(pendapatan) from film where nm_film ilike '%d%');










--- JOIN ----
create table kota(
	id integer primary key,
	nama text,
	id_propinsi integer
);

create table propinsi(
	id integer primary key,
	nama text
);

insert into kota
values
(1, 'Jakarta', '1'),
(2, 'Bandung', '2'),
(3, 'Sumedang', '2'),
(4, 'Makasar', '4'),
(5, 'Surabaya', '5'),
(6, 'Medan', '6')

insert into propinsi
values
(1, 'DKI Jakarta'),
(2, 'Jawa Barat'),
(3, 'Papua Barat'),
(4, 'Sulawesi Selatan'),
(5, 'Jawa Timur')

insert into propinsi values (5, 'Jawa Timur')



select * from kota
select * from propinsi

drop table kota

---INNER JOIN--
select * from kota inner join propinsi on kota.id_propinsi = propinsi.id;

select kota.nama as "Nama Kota", propinsi.nama as "Nama Provinsi" from kota
	inner join propinsi
	on kota.id_propinsi = propinsi.id;
	
--ngasih alias

select k.nama, p.nama from kota k inner join propinsi p on k.id_propinsi = p.id;

-- LEFT JOIN --
select kota.nama as "Nama Kota", propinsi.nama 
	from kota left join propinsi on kota.id = propinsi.id;
	

-- RIGHT JOIN --
select kota.nama as "Nama Kota", propinsi.nama as "Nama Kota" from kota right join propinsi
	on kota.id_propinsi = propinsi.id;
