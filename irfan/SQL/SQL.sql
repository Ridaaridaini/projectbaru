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

--group by (mengelompokkan berdasarkan kolom apa)
select * from pegawai

--tampilkan data umur dan jumlah pegawai yang memiliki umur tsb
select
	umur,
	count(umur) as "Jumlah pegawai"
from pegawai
group by umur;


--having (filtering groub by)
select
	umur,
	count(umur) as "Jumlah pegawai"
from pegawai
group by umur
having umur = 20 or umur = 26;

--limit (batas banyaknya data yang ditampilkan)
select
	umur,
	count(umur) as "Jumlah pegawai"
from pegawai
group by umur
having umur in (20,26)
limit 1;

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
select 
	nm_film as "Nama film",
	nominasi 
from film
order by nominasi desc;

--2.tampilkan nama film dan pendapatan dari yg terkecil
select 
	nm_film as "Nama Film",
	pendapatan 
from film
order by pendapatan asc;

--3. tampilan nama film dan nominasi yang tidak dapat nominasi
select 
	nm_film 
	as "Nama Film",nominasi 
from film
where nominasi = 0;

--4.tampilkan nama film

select 
	nm_film
	as "Nama film",
	nominasi
	from film
where nominasi = (select max(nominasi) as "banyak nominasi" from film)


--5 tampilkan nama film pendapatan terbesar
select 
	nm_film
	as "Nama film",
	pendapatan
	from film
where pendapatan = (select max(pendapatan) from film);

--6 nama film dan pendapatan terkecil

select 
	nm_film
	as "Nama film",
	pendapatan
	from film
where pendapatan = (select min(pendapatan) from film);


--7 nampilkan rata2 pendapatan

select 
	avg (pendapatan) as "Rata-rata pendapatan film"
from film;

--8 tampilkan rata2 nominal
select 
	round (avg (nominasi)) as "Rata-rata nominasi film"
from film

--angka dibelakang koma
select 
	round (avg (nominasi),2) as "Rata-rata nominasi film"
from film

-- 9 nampilkan nama film huruf depan awalan p
select 
nm_film
from film
where nm_film ilike 'p%'


--lower -> huruf kecil (mengubah Semua jadi lower case)
select lower('irfan');

select 
nm_film as "Nama film"
from film
where lower (nm_film) like lower ('p%');

--upper ->huruf besar ( mengubah semua jadi upper case)
select upper ('irfan');

select 
nm_film
from film
where upper (nm_film) ilike 'p%'


--floor(boletin ke bawah)
select floor(2.5)

--ceil(boletin ke atas)
select ceil(2.5)

--round(buletin yang terdekat)
select round(2.5)



--10
select 
	nm_film as "Nama film"
	from film
	where nm_film ilike '%s'
	

--11
select 
	nm_film as "Nama film"
	from film
	where nm_film ilike '%d%'
	
--12  tampilkan nama film dengan pendapatan terkecil yg mengandung huruf 'h'
select 
	nm_film as "Nama film",
	pendapatan
	 from film
	 where nm_film ilike '%h%' 
	 and pendapatan = (select min (pendapatan) from film where nm_film ilike '%h%');
	  

--13 tampilkan nama film dengan pendapatan terbesar yg mengandung huruf 'd'
select 
	nm_film as "Nama film",
	pendapatan
from film
where nm_film ilike '%h%' 
and pendapatan = (select max (pendapatan) from film where nm_film ilike '%d%');


drop table kota;

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

select * from propinsi


--inner join / join
select * from kota
inner join propinsi
	on kota.id_propinsi = propinsi.id;
	
select 
	kota.nama AS "Nama kota", 
	propinsi.nama AS "Nama propinsi"
from kota
inner join propinsi on kota.id_propinsi = propinsi.id;


select
	k.nama as "Nama kota",
	p.nama as "Nama propinsi"
from kota k
inner join propinsi p
on k.id_propinsi = p.id;


-- left join

select
	kota.nama as "Nama kota",
	propinsi.nama as "Nama propinsi"
from kota
left join propinsi 
on kota.id_propinsi = propinsi.id;


--- right join

select 
	kota.nama as "Nama kota",
	propinsi.nama as "Nama propinsi"
from kota
right join propinsi
on kota.id_propinsi = propinsi.id;


-- full outer join

select 
	kota.nama as "Nama kota",
	propinsi.nama as "Nama propinsi"
from kota full outer join propinsi
on kota.id_propinsi = propinsi.id;



drop TABLE film;

CREATE TABLE public.film (
    kd_film character varying(5) primary key,
    nm_film character varying(50),
    genre character varying(5),
    artis character varying(5),
    produser character varying(5),
    pendapatan integer,
    nominasi integer
);
CREATE TABLE public.produser (
    kd_produser character varying(5) primary key,
    nm_produser character varying(50),
    international character varying(10)
);
CREATE TABLE public.negara (
    kd_negara character varying(5) primary key,
    nm_negara character varying(50)
);
CREATE TABLE public.genre (
    kd_genre character varying(5) primary key,
    nm_genre character varying(50)
);
CREATE TABLE public.artis (
    kd_artis character varying(5) primary key,
    nm_artis character varying(50),
    jk character varying(10),
    bayaran integer,
    award integer,
    negara character varying(5)
    );

INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F001', 'IRON MAN', 'G001', 'A001', 'PD01', 2000000000, 3);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F002', 'IRON MAN 2', 'G001', 'A001', 'PD01', 1800000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F003', 'IRON MAN 3', 'G001', 'A001', 'PD01', 1200000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F004', 'AVENGER:CIVIL WAR', 'G001', 'A001', 'PD01', 2000000000, 1);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F005', 'SPIDERMAN HOMCOMING', 'G001', 'A001', 'PD01', 1300000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F006', 'THE RAID', 'G001', 'A004', 'PD03', 800000000, 5);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F007', 'FAST N FURIOUS', 'G001', 'A004', 'PD05', 830000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F008', 'HABIBI N AINUN', 'G004', 'A005', 'PD03', 670000000, 4);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F009', 'POLICE STORY', 'G001', 'A003', 'PD02', 700000000, 3);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F010', 'POLICE STORY 2', 'G001', 'A003', 'PD02', 710000000, 1);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F011', 'POLICE STORY 3', 'G001', 'A003', 'PD02', 615000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F012', 'RUSH HOUR', 'G003', 'A003', 'PD05', 695000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F013', 'KUNGFU PANDA', 'G003', 'A003', 'PD05', 923000000, 5);


INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD01', 'MARVEL', 'YA');
INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD02', 'HONGKONG CINEMA', 'YA');
INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD03', 'RAPI FILM', 'TIDAK');
INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD04', 'PARKIT FILM', 'TIDAK');
INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD05', 'PARAMOUNT PICTURE', 'YA');

INSERT INTO public.negara (kd_negara, nm_negara) VALUES ('AS', 'AMERIKA SERIKAT');
INSERT INTO public.negara (kd_negara, nm_negara) VALUES ('HK', 'HONGKONG');
INSERT INTO public.negara (kd_negara, nm_negara) VALUES ('ID', 'INDONESIA');
INSERT INTO public.negara (kd_negara, nm_negara) VALUES ('IN', 'INDIA');

INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G001', 'ACTION');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G002', 'HORROR');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G003', 'COMEDY');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G004', 'DRAMA');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G005', 'THRILER');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G006', 'FICTION');

INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A001', 'ROBERT DOWNEY JR', 'PRIA', 1000000000, 2, 'AS');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A003', 'JACKIE CHAN', 'PRIA', 1200000000, 7, 'HK');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A004', 'JOE TASLIM', 'PRIA', 350000000, 1, 'ID');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A005', 'CHELSEA ISLAN', 'WANITA', 300000000, 0, 'ID');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A002', 'ANGELINA JOLIE', 'WANITA', 700000000, 1, 'AS');


--14 tampilkan nama film dan artis
select 
film.nm_film as "Nama film",
artis.nm_artis as "Nama artis"
from film
inner join artis 
on film.artis = artis.kd_artis;

--15 tampilkan film yang artisnya berasal dari negara hongkong

select
film.nm_film as "Nama film"
from film
inner join artis
on film.artis = artis.kd_artis
where negara = 'HK';

--16 tampilkan nama film,nama artis & nama negara
select 
film.nm_film as "Nama film",
artis.nm_artis as "Nama artis",
negara.nm_negara as "Nama negara"
from film
inner join artis 
on film.artis = artis.kd_artis
inner join negara
on artis.negara = negara.kd_negara;

--17 tampilkan nama film,artis, & awardnya yg memiliki award terbanyak

select 
film.nm_film as "Nama film",
artis.nm_artis as "Nama artis",
film.nominasi as "Award"
from film
inner join artis 
on film.artis = artis.kd_artis
and nominasi = (select max (nominasi) from film);

--18 tampilkan nama film, nama artis & bayaran dengan artis bayaran terendah
select 
film.nm_film as "Nama film",
artis.nm_artis as "Nama artis",
artis.bayaran as "bayaran"
from film
inner join artis 
on film.artis = artis.kd_artis
where bayaran = (select min (bayaran) from artis);


-- 19. tampilkan nama artis, yang tidak pernah bermain film
select
artis.nm_artis as "Nama artis"
from artis
left join film
on artis.kd_artis = film.artis
where film.artis ='null';

-- 20. tampilkan nama artis, film dan genre, yang bermain film dengan genre drama
select 
artis.nm_artis as "Nama artis",
film.nm_film as "Nama film",
genre.nm_genre as "Nama genre"
from film
inner join genre on film.genre = genre.kd_genre 
where nm_genre = 'DRAMA';

-- 21 tampilkan nama artis,film & genre yg bermain film dengan genre horor
select 
artis.nm_artis as "Nama artis" 
film.nm_film as "Nama film",
genre.nm_genre as "Nama genre"
from artis
inner join film on film.artis = artis.kd_artis
inner join genre on film.genre = genre.kd_genre
where nm_genre = 'HOROR';


-- 22 tampilkan nama film & artis yg dibintangi oleh artis yg huruf depannya 'J'


-- 23 tampilkan nama artis yg paling banyak bermain film

-- 24 tampilkan negara mana yang paling banyak filmnya


-- 25 tampilkan nama negara dengan jumlah filmnya



