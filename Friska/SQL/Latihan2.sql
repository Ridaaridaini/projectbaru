-- 14. Tampilkan nama film dan artisnya
select 
	artis.nm_artis, 
	film.nm_film
from artis
inner join film
	on  artis.kd_artis = film.artis;

-- 15. Tampilkan film yang berasal dari negara HONGKONG

select 
	film.nm_film as "Nama Film"
	
from film inner join artis on 
	artis.kd_artis = film.artis
where artis.negara = 'HK';


-- 16. Tampilkan nama film, nama artis & nama negara
select
	film.nm_film,
	artis.nm_artis,
	negara.nm_negara
	
from film inner join artis
on film.artis = artis.kd_artis
inner join negara 	
on artis.negara = negara.kd_negara;
	
-- 17. Tampilkan nama film, artis, & awardnya memiliki award terbanyak

select
	film.nm_film,
	artis.nm_artis,
	artis.award

from film inner join artis
on film.artis = artis.kd_artis
where artis.award = (select max(artis.award)from artis);

-- 18. Tampilkan nama film, nama artis & bayaran dengan artis bayaran terendah
select
	film.nm_film,
	artis.nm_artis,
	artis.bayaran
from film inner join artis
on film.artis = artis.kd_artis
where artis.bayaran= (select min(artis.bayaran) from artis);
	
-- 19. Tampilkan nama artis yang tidak pernah bermain film
select

	artis.nm_artis 
	
 from artis left join film
 on artis.kd_artis = film.artis
 where nm_film is null;
 
-- 20. Tampilkan nama artis, film & gendre yang bermain film dengan gendre drama
select
	artis.nm_artis,
	film.genrej
from artis inner join film
on artis.kd_artis = film.artisy
where film.genre = 'G004';

-- 21. Tampilkan nama artis, film & genre yang bermain film dengan genre horror

select
	artis.nm_artis,
	film.nm_film,
	film.genre
	
from artis inner join film
on artis.kd_artis = film.artis
inner join genre
on film.genre = genre.kd_genre
where genre.nm_genre = 'ACTION';

-- 22. Tampilkan nama film & artis yang dibintangi oleh artis yang huruf depannya "J"
select 
	film.nm_film,
	artis.nm_artis
	
from film inner join artis
on film.artis = artis.kd_artis
where artis.nm_artis ilike 'J%';


-- 23. Tampilkan nama artis yang paling banyak bermain film
--join tabel- tabel dulu sesuai yang diminta
select
	artis.nm_artis,
	count (film.nm_film) -- karna yg dihitung jum film yg diperankan
from artis inner join film
on artis.artis = film_kd.artis
group nm_artis
order by count desc; -- desc1

--tentukan nilai max nya
select max (count) from (select artis.nm_artis,)

-- 24. Tampilkan negara mana yang paling banyak filmnya
--asumsi
-- hubungkan artisnya dengan film hitung artis dan film, hubungkan dengan negara
-- artis dan negara
--step 
select 
	negara.nm_negara,
	count(film.nm_film) as jml_film
	
from film inner join artis
on film.artis = artis.kd_artis
inner join negara
on artis.negara = negara.kd_negara
group by nm_negara



---23,24,25 belum---










-- 25. Tampilkan nama negara dengan jumlah film nya

-- 26. Tampilkan nama produser yang skalanya international
Select 
	produser.nm_produser as "Nama Produser Internasional"

from produser where produser.international ='YA';
	

-- 27. Tampilkan jumlah film dari masing-masing produser
Select

	produser.nm_produser as "Nama Produser",
	count(film.nm_film) as "Jumlah Film"

from film right join produser
	on film.produser = produser.kd_produser
group by nm_produser;

-- 28. Tampilkan jumlah nominasi dari masing-masing produser 
select
	produser.nm_produser as "Nama Produser",
	coalesce(sum(film.nominasi),0) as "Jumlah Nominasi"
	
	
from film right join produser
	on film.produser = produser.kd_produser
group by nm_produser;

--coalesce -> mengubah tampilan yang tadinya null jadi yang kita tentukan
--tipe datanya harus sama

coalesce

-- 29. Tampilkan jumlah pendapatkan produser marvel secara keseluruhan
select

	produser.nm_produser as "Nama Produser",
	sum(film.pendapatan) as "Pendapatan"
	
	
from film inner join produser
	on film.produser = produser.kd_produser
where nm_produser = 'MARVEL'
group by nm_produser;


-- 30. Tampilkan jumlah pendapatan produser yang sekalanya nya tidak internasional
select
	produser.nm_produser as "Nama Produser",
	sum(film.pendapatan) as "Pendapatan"
	
from film right join produser
on film.produser = produser.kd_produser
where international = 'TIDAK'

group by nm_produser;

-- 31. Tampilkan produser yang tidak punya film
select
	produser.nm_produser as "Nama Produser",
	film.nm_film as "Nama Film"
from film right join produser
on film.produser = produser.kd_produser
where nm_film is null;

-- 32. Tampilkan produser film yang memiliki artis termahal
select  

	produser.nm_produser,
	max(artis.bayaran) as "Bayaran"

from artis inner join film
on artis.kd_artis = film.artis
inner join produser 
on film.produser = produser.kd_produser
group by nm_produser;

-------------------------------------------------

select max("Bayaran")
from(select  

	produser.nm_produser,
	max(artis.bayaran)

from artis inner join film
on artis.kd_artis = film.artis
inner join produser 
on film.produser = produser.kd_produser
group by nm_produser)langsung;

---------------------------------
select * from(select  

	produser.nm_produser,
	max(artis.bayaran)

from artis inner join film
on artis.kd_artis = film.artis
inner join produser 
on film.produser = produser.kd_produser
group by nm_produser)langsung
where langsung.max = (select max(max)
from(select  

	produser.nm_produser,
	max(artis.bayaran)

from artis inner join film
on artis.kd_artis = film.artis
inner join produser 
on film.produser = produser.kd_produser
group by nm_produser)langsung3);


-- 33. Tampilkan produser yang memiliki artis paling banyak
select 
	produser.nm_produser,
	count(artis.nm_artis)
	
from artis inner join film
on artis.kd_artis = film.artis
inner join produser
on film.produser = produser.kd_produser
group by nm_produser;
-------------------------------
select max(count) from(select 
	produser.nm_produser,
	count(artis.nm_artis)
	
from artis inner join film
on artis.kd_artis = film.artis
inner join produser
on film.produser = produser.kd_produser
group by nm_produser) friska

-----------------------------
select * from (select 
	produser.nm_produser,
	count(artis.nm_artis)
	
from artis inner join film
on artis.kd_artis = film.artis
inner join produser
on film.produser = produser.kd_produser
group by nm_produser) friska
where friska.count=(select max(count) from(select 
	produser.nm_produser,
	count(artis.nm_artis)
	
from artis inner join film
on artis.kd_artis = film.artis
inner join produser
on film.produser = produser.kd_produser
group by nm_produser) prasetyo)


-- 34. Tampilkan produser yang memilki arti paling sedikit

WITH f AS(
	select
		p.nm_produser,
		count(f.artis) as jml_artis
	from produser p
	left join film f
		on p.kd_produser = f.produser
	group by nm_produser
), f_min AS(
	select min (jml_artis) from f
) select * from f where jml_artis = (select* from f_min);



