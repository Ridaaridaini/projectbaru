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
(6, 'Medan', '6');

insert into propinsi
values
(1, 'DKI Jakarta'),
(2, 'Jawa Barat'),
(3, 'Papua Barat'),
(4, 'Sulawesi Selatan'),
(5, 'Jawa Timur');

select * from kota;
select * from propinsi;

--inner join / join
select
	*
from kota
inner join propinsi
	on kota.id_propinsi = propinsi.id;

select
	kota.nama as "Nama Kota",
	propinsi.nama as "Nama Propinsi"
from kota
inner join propinsi
	on kota.id_propinsi = propinsi.id
	
select 
	k.nama as "Nama Kota",
	p.nama as "Nama Propinsi"
from kota k
inner join propinsi p
	on k.id_propinsi = p.id;

--left join
select 
	k.nama as "Nama Kota",
	p.nama as "Nama Propinsi"
from kota k
left join propinsi p
	on k.id_propinsi = p.id;

--right join
select
	k.nama as "Nama Kota",
	p.nama as "Nama Propinsi"
from kota k
right join propinsi p
	on k.id_propinsi = p.id

--full outer join
select 
	k.nama as "Nama Kota",
	p.nama as "Nama Propinsi"
from kota k
full outer join propinsi p
	on p.id = k.id_propinsi 
	
--14 tampilkan nama film dan artisnya
select 
	film.nm_film as "Nama Film ",
	artis.nm_artis as "Nama Artis"
	
from film 
inner join artis
	on film.artis = artis.kd_artis;



--15 tampilkan film yg artisnya berasal dari negara HONGKONG
select film.nm_film as "Nama Film" from film inner join artis on film.artis = artis.kd_artis
where artis.negara = 'HK';

--16 tampilkan nama film, nama artis & nama negara 
select 
	f.nm_film as "Nama Film",
	a.nm_artis as "Nama Artis",
	n.nm_negara as "Nama Negara"
from negara n
join artis a
	on n.kd_negara = a.negara
join film f
	on f.artis = a.kd_artis;


--17 tampilkan nama film, artis, & awardnya yg memiliki award terbanyak
select film.nm_film, artis.nm_artis, artis.award
	from film
	inner join artis
		on film.artis = artis.kd_artis
	where artis.award = (select max(award) from artis);

--18 tampilkan nama film, nama artis & bayaran dengan 
--   artis bayaran terendah

select
	film.nm_film as "Nama film",
	artis.nm_artis as "Nama artis",
	artis.bayaran as "bayaran"
from film
inner join artis on film.artis = artis.kd_artis
where film. (select min(bayaran) from artis); 

select
	film.nm_film as "Nama film",
	artis.nm_artis as "Nama artis",
	artis.bayaran as "bayaran"
	from film
	join artis
	on film.artis = artis.kd_artis
where artis.bayaran = (select 
	min(artis.bayaran) 
	from artis);

	

--19 tampilkan nama artis yg tidak pernah bermain film
select 
	artis.nm_artis as "Nama Artis"
from artis left join film on
	artis.kd_artis = film.artis
where film.nm_film is null;






--20 tampilkan nama artis, film & genre yg bermain film dengan 
--   genre drama
select 
artis.nm_artis as "Nama Artis",
film.nm_film as "Nama Film",
genre.nm_genre as "Nama Genre"

from artis 
inner join film 
on artis.kd_artis = film.artis
inner join genre
on film.genre = genre.kd_genre
where nm_genre = 'DRAMA';

--21 tampilkan nama artis, film & genre yg bermain film dengan genre action
select nm_artis as "Nama Artis", nm_film as "Nama Film", nm_genre as "Genre"
from artis inner join film on artis.kd_artis = film.artis
inner join genre on film.genre = genre.kd_genre
where film.genre = 'G001'

--22 tampilkan nama film & artis yg dibintangi oleh artis yg huruf depannya 'J'
select 
	f.nm_film as "Nama Film",
	a.nm_artis as "Nama Artis"
from film f
join artis a
	on a.kd_artis =f.artis
	where nm_artis ilike ('j%');
--23 tampilkan nama artis yg paling banyak bermain film
--step 1: join tabel2 dulu aja sesuai yg diminta
select
	a.nm_artis, --kolom biasa
	count(f.nm_film) --agreate
from film f
inner join artis a
	on f.artis = a.kd_artis
group by nm_artis
order by count desc; --tabel 1

--step 2: bikin query untuk nilai maxnya
select max(count) from (select
	a.nm_artis, --kolom biasa
	count(f.nm_film) --agreate
from film f
inner join artis a
	on f.artis = a.kd_artis
group by nm_artis
order by count desc) tabel1;

--step 3: srosooot gabungkan
select 
	*
from (select
	a.nm_artis, --kolom biasa
	count(f.nm_film) --agreate
		from film f
		inner join artis a
			on f.artis = a.kd_artis
	group by nm_artis
	order by count desc) tabel1
where tabel1.count = (select max(count) from (select
					a.nm_artis, --kolom biasa
					count(f.nm_film) --agreate
						from film f
					inner join artis a
						on f.artis = a.kd_artis
					group by nm_artis
					order by count desc) tabel2);

--24 tampilkan negara mana yg paling banyak filmnya
--step 1 : coba tampilkan negara dan filmnya
select 
	n.nm_negara,
	f.nm_film
from film f
join artis a
	on f.artis = a.kd_artis
join negara n
	on n.kd_negara = a.negara
--step 2 : grouping berdasarkan nama negara
select 
	n.nm_negara,
	count(f.nm_film) as jml_film
from film f
join artis a
	on f.artis = a.kd_artis
join negara n
	on n.kd_negara = a.negara
group by n.nm_negara --tabel1
--step 3 : filter berdasarkan jml film
select 
	*
from (select 
		n.nm_negara,
		count(f.nm_film) as jml_film
	from film f
	join artis a
		on f.artis = a.kd_artis
	join negara n
		on n.kd_negara = a.negara
	group by n.nm_negara) tabel1
where tabel1.jml_film = 5
--step 4 : cari nilai maxnya dengan query
select 
	max(jml_film)
from (select 
		n.nm_negara,
		count(f.nm_film) as jml_film
	from film f
	join artis a
		on f.artis = a.kd_artis
	join negara n
		on n.kd_negara = a.negara
	group by n.nm_negara) tabel2
--step5 gabungngkan step3 dan step 4
select 
	nm_negara
from (select 
		n.nm_negara,
		count(f.nm_film) as jml_film
	from film f
	join artis a
		on f.artis = a.kd_artis
	join negara n
		on n.kd_negara = a.negara
	group by n.nm_negara) tabel1
where tabel1.jml_film = (select 
	max(jml_film)
from (select 
		n.nm_negara,
		count(f.nm_film) as jml_film
	from film f
	join artis a
		on f.artis = a.kd_artis
	join negara n
		on n.kd_negara = a.negara
	group by n.nm_negara) tabel2)
	
--membuat temporary table
drop view if exists view2;
drop view if exists view1;

create or replace view view1 as
select 
	n.nm_negara,
	count(f.nm_film) as jml_film
from film f
join artis a
	on f.artis = a.kd_artis
join negara n
	on n.kd_negara = a.negara
group by n.nm_negara;

select * from view1;

drop view if exists view2;
create or replace view view2 as
select max(jml_film) from view1;

select * from view2;

select 
	nm_negara
from view1
where jml_film = (select * from view2);

--25 tampilkan data negara dengan jumlah filmnya
SELECT * FROM negara;
SELECT * FROM film;
SELECT * FROM artis;

SELECT n.nm_negara AS "Negara", COUNT(f.nm_film) AS "Jumlah" FROM film f
JOIN artis a ON a.kd_artis = f.artis
RIGHT JOIN negara n ON a.negara = n.kd_negara
GROUP BY n.nm_negara
ORDER BY "Jumlah" desc;

--26 tampilkan nama produser yg skalanya international
select nm_produser as "Nama Produser" from produser
where international = 'YA';


--27 tampilkan jumlah film dr masing2 produser
select
	produser.nm_produser,
	count(film.nm_film)
from film
right join produser
	on film.produser = produser.kd_produser
group by produser.nm_produser;

--28 tampilkan jumlah nominasi dari masing2 produser
	select
		p.nm_produser as "Produser", sum(f.nominasi) as "Jumlah Nominasi"
		from produser p
		left join film f
			on p.kd_produser = f.produser
		group by p.nm_produser;
		
--coalesce -> mengubah tampilan yang tadinya null jadi yg kita tentukan
--tipe datanya harus sama
select coalesce(null,3);
select coalesce(null,'abc'); 

select
		p.nm_produser as "Produser", 
		coalesce(sum(f.nominasi),0) as "Jumlah Nominasi"
		from produser p
		left join film f
			on p.kd_produser = f.produser
		group by p.nm_produser;
		
		
--29 tampilkan jumlah pendapatan produser marvel secara keseluruhan
select produser.nm_produser as "Produser",
		sum(film.pendapatan) as "Pendapatan"
from produser
full outer join film on kd_produser=produser
group by nm_produser
having  produser.nm_produser ilike 'marvel';

--30 tampilkan jumlah pendapatan produser yg skalanya tidak international
select
	nm_produser as "Nama Produser",
	coalesce(sum(pendapatan),0) as "Jumlah Pendapatan"
from film
right join produser
	on film.produser = produser.kd_produser
where international ilike '%tidak%'
group by nm_produser

--31 tampilkan produser yg tidak punya film
select
		nm_film,
		nm_produser
from film f
right join produser p
	on f.produser = p.kd_produser
where nm_film is null

--32 tampilkan produser film yg memilik artis termahal
select 
	nm_produser as "Nama Produser",
	max(bayaran)
from produser p
left join film f
on p.kd_produser = f.produser
left join artis a
on a.kd_artis = f.artis
group by nm_produser
having max(bayaran) = (select max(bayaran) from artis)

--33 tampilkan produser yg memiliki artis paling banyak
with f as(
	select 
		nm_produser,
		count(artis)
	from produser 
	left join film
		on produser.kd_produser = film.produser
	group by nm_produser
), f_max as(
	select max(count) from f
) select * from f where count = (select * from f_max);

--34 tampilkan produser yg memiliki artis paling sedikit
WITH f AS (
	select 
		p.nm_produser,
		count(f.artis) as jml_artis
	from produser p
	left join film f
		on p.kd_produser = f.produser
	group by nm_produser
), f_min AS(
	select min(jml_artis) from f
) select * from f where jml_artis = (select * from f_min);









