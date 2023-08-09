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

-- 24. Tampilkan negara mana yang paling banyak filmnya

-- 25. Tampilkan nama negara dengan jumlah film nya

