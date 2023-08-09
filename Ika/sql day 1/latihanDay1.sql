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

select * from film;

--soal latihan film
--1 tampilkan nama film dan nominasi dari nominasi terbesar
select nm_film as "nama film" , nominasi from film
order by nominasi Desc;

-- 2 tampilkan nama film dan pendapatan dari yang terkecil
select nm_film as "nama film ", pendapatan from film
order by pendapatan asc;

--3. tampilkan nama film dan nominasi yang tidak dapat nominasi
select nm_film as "nama film", nominasi from film
where nominasi < 1;

--4. tampilkan nama film dan nominasi yang paling banyak mendapatkan nominasi
--step 1
select
	max(nominasi) from film;
--step 2
select 
	nm_film as "nama film",
	nominasi
from film
where nominasi= 5;

--step 3
select 
	nm_film as "nama film",
	nominasi
from film
where nominasi= (select
	max(nominasi) from film);
	
	
--5. tampilkan nama film dan pendapatan yang terbesar
select 
	nm_film as "Nama Film",
	pendapatan
from film
where pendapatan = (select max(pendapatan) from film);


--6. tampilkan nama film dan pendapatan yang terkecil
select
	nm_film as "Nama Film",
	pendapatan
from film
where pendapatan = (select min(pendapatan) from film);


--7. tampilkan rata-rata pendapatan film keseluruhan
select avg(pendapatan) as "rata-rata pendapatan" from film;

--8. tampilkan rata-rata nominasi keseluruhan
select round(avg(nominasi),2) as "rata-rata nominasi" from film;

--floor(buletin ke bawah)
select floor(2.5);
--ceil (buletin ketas)
select ceil (2.5);
--round(buletin ke yang terdekat)
select round(2.5);
--round dengan parameter
select round(2.55554, 2);-- 2 angka dibelakang koma

--9. tampilkan nama film yang huruf depannya 'p' (not case sensitive)
select nm_film as "Nama Film" from film
where nm_film ilike 'p%';

select nm_film as "Nama Film" from film
where UPPER(nm_film) like UPPER('p%');

select nm_film as "Nama Film" from film
where LOWER(nm_film) like LOWER('p%');

--lower (mengubah semua jadi lower case)
select lower('Rida');

--upper (mengubah semua menjadi upper case)
select upper('bagus');

--10. tampilkan nama film yang huruf akhirnya 's' (not case sensitive)
select nm_film as "Nama Film" from film
where lower(nm_film) like lower('%s');

--11. tampilkan nama film yang mengandung huruf d
select nm_film as "Nama Film" from film
where nm_film ilike '%d%';

--12. tampilkan nama film dengan pendapatan terkecil yang mengandung huruf 'h'
select nm_film as "Nama Film" from film
where nm_film ilike '%h%'
order by pendapatan asc
limit 1;

--cara lain
select nm_film as "Nama Film" from film
where nm_film ilike '%h%' and
pendapatan = (select min(pendapatan) from film where nm_film ilike '%h%');


--13. tampilkan nama film dengan pendapatan terbesar yang mengandung huruf 'd'

select nm_film as "Nama Film" from film
where nm_film ilike '%d%'
order by pendapatan desc
limit 1;

--cara lain
select nm_film as "Nama Film" from film
where nm_film ilike '%d%' and 
	pendapatan = (select max(pendapatan) from film where nm_film ilike '%d%');








