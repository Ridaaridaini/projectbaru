--latihan film

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
-- 1. tampilkan nama film dan nominasi dari nominasi yang yang terbesar

select 
	nm_film, nominasi 
from film 
order by nominasi desc;


-- 2. tampilkan nama film dan pendapatan dari yang terkecil

select 
	nm_film, nominasi 
from film 
order by nominasi asc;

-- 3. tampilkan nama film dan nominasi yang tidak dapat nominasi

select 
	nm_film, nominasi
from film
where nominasi = 0;

--4. tampilkan nama film dan nominasi yang paling banyak mendapatkan nominasi
select 
 	nm_film as "Nama film", 
	nominasi 
from film
where nominasi = (select max (nominasi ) from film);


--5. tampilkan nama film dan pendapatkan yang terbesar

select 
 	nm_film as "Nama film",
	pendapatan
from film
where pendapatan = (select max (pendapatan) from film);


--6. tampilkan nama film dan pendapatkan yang terkecil
select
	nm_film as "Nama film",
	pendapatan

from film
where pendapatan = (select min(pendapatan) from film);

--7. Tampilkan rata rata pendapatan keseluruhan
select 
	round (avg (pendapatan),2) as "Pendapatan Keseluruhan"
from film;

--8. Tampilkan rata-rata nominasi keseluruhan
select	
	round (avg (nominasi),2) as "Rata- rata nominasi"
from film;


-- 9.Tampilkan nama film yang huruf depannya 'p' (not case sensitive)
select nm_film as "Nama Film" from film
	where nm_film ilike 'p%';
	
-- kalo lupa ilike

select nm_film as "Nama film" from film
	where UPPER(nm_film) like UPPER ('p%');
	
-- 10. Tampilkan nama film yang huruf terakhirnya 's' (not case sensitive)
select nm_film as "Nama Film" from film
	where nm_film ilike '%s';

-- 11. tampilkan nama film yang mengandung huruf yang mengandung huruf d

select nm_film as "Nama film" from film
	where UPPER (nama_film) like UPPER ('%d%');

-- 12. Tampilkan nama film dengan pendapatan terkecil yang mengandung huruf 'd'

select nm_film as "Nama Film", pendapatan from film

	where pendapatan = (select min(pendapatan) from film where nm_film ilike '%d%' );
	
-- 13. Tampilkan nama film dengan pendapatan terbesar yang mengandung huruf 'h'

select nm_film as "Nama Film", pendapatan from film
	
	where pendapatan = (select max(pendapatan)from film where nm_film ilike '%h%');
	
--14. 







