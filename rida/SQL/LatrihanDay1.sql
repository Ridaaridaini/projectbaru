--Soal Latihan film
select nm_film, nominasi from film
order by nominasi desc;

select nm_film ,pendapatan from film
order by pendapatan asc;

select nm_film, nominasi from film 
where nominasi=0;

--subQuery
-- step1 
select max(nominasi) from film;
--step2
select
	nm_film as "nama film",
	nominasi
from film
where nominasi=5;
--Step3
select
	nm_film as "nama film",
	nominasi
from film
where nominasi=(select max(nominasi) from film);

select
	nm_film as "nama film",
	pendapatan
from film
where pendapatan=(select max(pendapatan) from film);

select
	nm_film as "nama film",
	pendapatan
from film
where pendapatan=(select min(pendapatan) from film);

select round (avg(pendapatan),2) as"rata-rata pendapatan film" from film;

select round (avg(nominasi)) "Rata-rata nominasi" from film;

select 
	nm_film as "Nama film "
from film
where nm_film ilike 'p%';

--lower (mengubah semua jadi lower case)
select lower ('RIDA');
--upper (mengubah semua jadi upper case)
select upper('bagus');

select nm_film as "Nma Film" from film where Upper(nm_film) like upper('p%');
select nm_film as "Nma Film" from film where lower(nm_film) like lower('p%');

select nm_film as "Nama film" from film where lower(nm_film) like lower ('%s')
select nm_film as "Nama film" from film where (nm_film) ilike ('%d%');
select 
	nm_film as "Nama film" 
from film
where (nm_film) ilike ('%h%')
order by pendapatan asc
limit 1;
select 
	nm_film as "Nama film" 
from film
where (nm_film) ilike ('%d%')
order by pendapatan desc
limit 1;