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
);
--drop table
drop table pegawai;

--nik KTP
create table ktp(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text
);

select * from ktp;

--rename ttl -> tempat_tanggal_lahir
alter table ktp rename column ttl to tempat_tanggal_lahir;

--ganti tipe data kolom jenis kelamin -> boolean
alter table ktp alter column jenis_kelamin type boolean using jenis_kelamin::boolean;

--delete kolom tempat_tanggal_lahir
alter table ktp
drop column tempat_tanggal_lahir;

-- add column tanggal lahir tipe data date
alter table ktp
add column tgl_lahir date;

--DML
select * from pegawai;

--insert data cara 1(menyebutkan kolom)
insert into pegawai(id_pegawai,nama_pegawai)
values (1,'riswandha');
insert into pegawai(nama_pegawai,id_pegawai)
values ('ika',2);

--insert data cara 2 (data harus urut, dan diisi semua)
insert into pegawai
values (3,20,'Dianty');

--insert multiple data
insert into pegawai (nama_pegawai,id_pegawai) values
('Rida',4),('Friska',5),('Bagus',6);

--Update pegawai
update pegawai
set umur = 24
where id_pegawai = 1;

update pegawai
set nama_pegawai = 'Friska Sakurachan', umur = 26
where id_pegawai = 5;

--delete pegawai
delete from pegawai
where id_pegawai = 2;

--update pegawai secara default
update pegawai
set umur = 20
where umur is null;

--select semua kolom tabel..
select * from pegawai;

--select kolom tertentu
select nama_pegawai,umur from pegawai;

--alias kolom yang ditampilkan
select
	nama_pegawai as nama
from pegawai;

select
	nama_pegawai as "Nama Pegawai"
from pegawai;

--order by(urutkan berdasarkan asc/desc)
select * from pegawai
order by id_pegawai asc;

select * from pegawai
order by umur desc;

--distinc (menampilkan yang unik)
select distinct umur from pegawai;

--select where
--Tampilkan pegawai umur 20
select * from pegawai where umur = 20;

-- tampilkan pegawai umur 23/26
select * from pegawai where umur = 23 or umur = 26;

-- tampilkan pegawai umur 20 nama bagus
select * from pegawai where umur = 20 and nama_pegawai = 'Bagus';

--where in
select * from pegawai where umur in (23,26);

select * from pegawai where nama_pegawai in ('Bagus','Rida');

-- where beetween / diantar
select * from pegawai where umur between 20 and 25;

--select where like / contains / mengandung
-- cari nama pegawai, yang awalnya R --sensitive like
select * from pegawai where nama_pegawai like 'R%';

--ilike ->tidak memperhatikan capital case
select * from pegawai
where nama_pegawai ilike 'r%';

--cari nama pegawai, yang akhirnya n
select * from pegawai where nama_pegawai ilike '%n';

--cari nama pegawai yang ada huruf c
select * from pegawai where nama_pegawai ilike '%C%';

--agregat
--AVG,MAX,MIN,SUM,COUNT
select
	avg(umur) as "Rata Rata umur Pegawai",
	max(umur) as "Maksimal umur Pegawai",
	min(umur) as "Minimum umur Pegawai",
	sum(umur) as "jumlah umur Pegawai",
	count(umur) as "Jumlah data"
from pegawai;

--Group by(dikelompokkan bedasarkan kolom apa)
select * from pegawai;
--tampilkan data umur dan jumlah pegawai yang memiliki umur
select
	umur,
	count(umur) as"jumlah pegawai"
from pegawai group by umur;

--having(filternya si group by)
select
	umur,
	count(umur) as"jumlah pegawai"
from pegawai group by umur having umur = 20 or umur = 26;

--limin (batas banyaknya data yang harus ditampilkan)
select
	umur,
	count(umur) as"jumlah pegawai"
from pegawai 
group by umur 
having umur in(20,26)
limit 1;


--Latihan Film
create table film(
	kd_film text primary key,
	nm_film text,
	pendapatan integer,
	nominasi integer
);
--insert data
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

--Soal Latihan
--1 tampilkan nama film dan nominasi dari nominasi yang tersebar
select nm_film as "Nama Film",nominasi from film order by nominasi desc;

--2 tampilkan nama film dan pendapatan dari yang terkecil
select nm_film as "Nama Film", pendapatan from film order by pendapatan asc;
--3 tampilkan nama film dan nominasi yang tidak dapat dinominasi
select nm_film, nominasi from film  where nominasi = 0;
--4 tampilkan nama film dan yang paling banyak mendapatkan nominasi
--step 1
select max (niminasi) from film;
--step 2
select
	nm_film as "Nama Film",
	nominasi
from film
where nominasi =5;
--step 3
select 
	nm_film as "Nama Film",
	nominasi
from film
where nominasi = (select max(nominasi) from film);
--5 tampilkan nama film dan pendapatan yang terbesar
select 
	nm_film as "Nama Film",
	pendapatan
from film
where pendapatan = (select max(pendapatan)from film);
--6 tampilkan nama film dan pendapatan terkecil
select
	nm_film as "Nama Film",
	pendapatan
from film
where pendapatan = (select min(pendapatan)from film);
--7 tampilkan rata-rata pendapatan film keseluruhan
select round(avg(pendapatan),2) from film;
--8 tampilkan rata-rata nominasi film keseluruhan
select round(avg(nominasi),2) from film

--buletin ke atas
select floor(2.5)
--buletin ke kebawah
select ceil(2.5)
--buletin ke terdekat
select round(2.5)

--9 tampilkan nama film yang huruf depannya 'p' (not case sensitive)
select nm_film as "Nama Film" from film where nm_film ilike ('p%');

--lower (mengubah sumua menjadi lower case)
	select lower('Rida')
--upper (mengubah sumua menjadi upper case)
	select upper('bagus')
	
select nm_film as "Nama Film" from film where Upper(nm_film) like upper('p%');
select nm_film as "Nama Film" from film where Lower(nm_film) like lower('p%');

--10 tampilkan nama film yang huruf terakhir's' (not case sensitive)
select nm_film as "Nama Film" from film where nm_film ilike ('%s');
--11 tampilkan nama film yang huruf terakhir'd'
select nm_film as "Nama Film" from film where nm_film ilike ('%d');
--12 tampilkan nama film dengan pendapatan terkecil yang mengandung huruf 'h'
select nm_film as "Nama Film" from film where nm_film ilike ('%h%') order by pendapatan asc limit 1;
--belum solve
SELECT nm_film FROM film WHERE nm_film ilike '%h%' 
AND pendapatan = (SELECT pendapatan FROM film WHERE nm_film ilike '%h%');

--13 tampilkan nama film dengan pendapatan terbesar yang mengandung huruf 'd'
select nm_film as "Nama Film" from film where nm_film ilike ('%d%') order by pendapatan desc limit 1;

select * from film;

create table kota(
	id integer primary key,
	nama text,
	id_propinsi integer
);
drop table kota;
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

select * from propinsi;
--inner join / join
select * from kota
inner join propinsi
	on kota.id_propinsi = propinsi.id;
	
select
	kota.nama as "Nama Kota",
	propinsi.nama as as "Nama propinsi"
from kota
inner join propinsi
	on kota.id_propinsi = propinsi.id;
	
select 
	k.nama as "Nama Kota",
	p.nama as "Nama Propinsi"
from kota k
inner join propinsi p
	on k.id_propinsi = p.id;
	
--left join
select
	k.nama as "Nama Kota",
	p.nama as "Nama Provinsi"
from kota k
left join propinsi p
	on k.id_propinsi = p.id;

--right join
select
	k.nama as "Nama kota",
	p.nama as "Nama Provinsi"
from kota k
right join propinsi p
	on k.id_propinsi = p.id;

--full outer join
select 
	k.nama as "Nama Kota",
	p.Nama as "Nama Provinsi"
from kota k
full outer join propinsi p
	on k.id_propinsi = p.id;