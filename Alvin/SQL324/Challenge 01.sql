-- 14. tampilkan nama film dan artisnya
select film.nm_film, artis.nm_artis
	from film
	inner join artis
	on film.artis = artis.kd_artis;

-- 15. tampilkan film yang artisnya berasal dari negara hongkong
select film.nm_film
	from film
	inner join artis
	on film.artis = artis.kd_artis
	where artis.negara = 'HK';
	
-- 16. tampilkan nama film, nama artis dan nama negara
select film.nm_film, artis.nm_artis, negara.nm_negara
	from film
	inner join artis
	on film.artis = artis.kd_artis
	inner join negara
	on artis.negara = negara.kd_negara;

-- 17. tampilkan nama film, artis dan awardnya yang memiliki award terbanyak
select film.nm_film, artis.nm_artis, artis.award
	from film
	inner join artis
	on film.artis = artis.kd_artis
	where artis.award = (select max(award) from artis);

-- 18. tampilkan nama film, nama artis dan bayaran, dengan artis bayaran terendah
select film.nm_film, artis.nm_artis, artis.bayaran
	from film
	inner join artis
	on film.artis = artis.kd_artis
	where artis.bayaran = (select min(bayaran) from artis);

-- 19. tampilkan nama artis, yang tidak pernah bermain film
select artis.nm_artis as "Nama Artis Tidak Main Film"
	from artis
	left join film
	on artis.kd_artis = film.artis
	where film.nm_film is null;

-- 20. tampilkan nama artis, film dan genre, yang bermain film dengan genre drama
select artis.nm_artis as "Actor", film.nm_film as "Film", genre.nm_genre as "Genre"
	from artis
	inner join film
	on artis.kd_artis = film.artis
	inner join genre
	on film.genre = genre.kd_genre
	where genre.nm_genre ilike 'drama';







