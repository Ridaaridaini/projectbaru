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
	
-- 21. tampilkan nama artis, film dan genre yang bermain film dengan genre horor
select artis.nm_artis as "Nama Artis", film.nm_film as "Nama Film", genre.nm_genre as "Genre"
	from artis
	join film
		on artis.kd_artis = film.artis
	join genre
		on film.genre = genre.kd_genre
	where genre.nm_genre ilike 'action';

-- 22. tampilkan nama film dan artis yang dibintangi oleh artis yang huruf depnya 'J'
select film.nm_film as "Nama Film", artis.nm_artis as "Nama Film"
	from film
	join artis
		on film.artis = artis.kd_artis
	where artis.nm_artis ilike 'j%';

-- 23. tampilkan nama artis yang paling banyak bermain film
--cara baru :
WITH table1 AS(
	select
		a.nm_artis as nm_artis, count(f.nm_film) as jmlh_film
		from artis a
		left join film f
			on a.kd_artis = f.artis
		group by a.nm_artis
) select nm_artis as "Nama Artis", jmlh_film as "Nama Film"
	from table1
	where jmlh_film = (select max(jmlh_film) from table1);

-- langkah 1 :
	select
		a.nm_artis, count(f.nm_film)
		from artis a
		inner join film f
		on a.kd_artis = f.artis
		group by a.nm_artis;
		
-- langkah 2 :
	select 
		max(table2.count)
		from (
			select
				a.nm_artis, count(f.nm_film)
				from artis a
				inner join film f
				on a.kd_artis = f.artis
				group by a.nm_artis
		) as table2;

-- langkah 3 :
	select 
		*
		from (
			select
				a.nm_artis, count(f.nm_film)
				from artis a
				inner join film f
				on a.kd_artis = f.artis
				group by a.nm_artis
		) as table1
		where table1.count = (
			select 
				max(table2.count)
				from (
					select
						a.nm_artis, count(f.nm_film)
						from artis a
						inner join film f
						on a.kd_artis = f.artis
						group by a.nm_artis
				) as table2
		);
-- 24. tampilkan negara mana yang paling banyak filmnya
--cara baru :
WITH table1 AS(
	select
		n.nm_negara as negara, count(f.nm_film) as jmlh_film
		from film f
		right join artis a
			on f.artis = a.kd_artis
		right join negara n
			on a.negara = n.kd_negara
		group by n.nm_negara
) select negara as "Negara", jmlh_film as "Jumlah Film"
	from table1
	where jmlh_film = (select max(jmlh_film) from table1);

-- langkah 1 : buat tabel 1 untuk menampilkan nama negara dan jumlah filmnya
select n.nm_negara, count(f.nm_film)
	from film f
	join artis a
		on f.artis = a.kd_artis
	join negara n
		on a.negara = n.kd_negara
	group by n.nm_negara;

-- langkah 2: buat table 2 untuk mencari jumlah negara terbanyak yang bermain film
select max(table2.jmlh_film)
	from (select n.nm_negara as nm_negara, count(f.nm_film) as jmlh_film
			from film f
			join artis a
				on f.artis = a.kd_artis
			join negara n
				on a.negara = n.kd_negara
			group by n.nm_negara) table2;

-- langkah 3: table 1 digunakan untuk mengambil nama negara dan jumlah negara
select *
	from(
		select n.nm_negara as nm_negara, count(f.nm_film) as jmlh_film -- <== ini
			from film f
			join artis a
				on f.artis = a.kd_artis
			join negara n
				on a.negara = n.kd_negara
			group by n.nm_negara
	) table1
-- table 2 untuk mengambil jumlah negara terbanyak yang bermain film
	where table1.jmlh_film = ( -- <== ini
		select max(table2.jmlh_film)
	from (select n.nm_negara as nm_negara, count(f.nm_film) as jmlh_film
			from film f
			join artis a
				on f.artis = a.kd_artis
			join negara n
				on a.negara = n.kd_negara
			group by n.nm_negara) table2
	);
	
-- 25. tampilkan data negara dengan jumlah filmnya
	select 
		n.nm_negara as "Negara", count(f.nm_film) as "Jumlah Film"
		from film f
		inner join artis a
			on f.artis = a.kd_artis
		inner join negara n
			on a.negara = n.kd_negara
		group by n.nm_negara;

-- 26. tampilkan nama produser yg skalanya international
	select
		nm_produser
		from produser
		where international ilike 'ya';

-- 27. tampilkan jumlah film dr masing2 produser
	select 
		p.nm_produser as "Produser", count(f.nm_film) as "Jumlah Film"
		from film f
		right join produser p
			on f.produser = p.kd_produser
		group by p.nm_produser;

-- 28. tampilkan jumlah nominasi dari masing2 produser
	select
		p.nm_produser as "Produser", sum(nominasi) as "Jumlah Nominasi"
		from film f
		right join produser p
			on f.produser = p.kd_produser
		group by p.nm_produser;
		
		--coalesce --> fungsi untuk mengubah value null menjadi yang kita inginkan (dengan syarat tipe data harus sama)
		select coalesce(null, 3);
		select coalesce(null, 'abc');
		-- contoh
		
		select
		p.nm_produser as "Produser", coalesce(sum(nominasi), 0) as "Jumlah Nominasi"
		from film f
		right join produser p
			on f.produser = p.kd_produser
		group by p.nm_produser;
	
-- 29. tampilkan jumlah pendapatan produser marvel secara keseluruhan
	select
		p.nm_produser, sum(f.pendapatan)
		from produser p
		inner join film f
			on p.kd_produser = f.produser
		where p.nm_produser ilike 'marvel'
		group by p.nm_produser;
		

-- 30. tampilkan jumlah pendapatan produser yg skalanya tidak international
	select
		p.nm_produser as "Produser", coalesce(sum(f.pendapatan), 0) as "Pendapatan"
		from produser p
		left join film f
			on p.kd_produser = f.produser
		where p.international ilike 'tidak'
		group by p.nm_produser;

--31 tampilkan produser yg tidak punya film
-- langkah 1
	select p.nm_produser, count(f.nm_film)
		from produser p
		left join film f
			on p.kd_produser = f.produser
		group by p.nm_produser;

-- langkah 2
	select
		table1.nm_produser as "Nama Produser", table1.jmlh_film as "Jumlah Film"
		from(
			select p.nm_produser as nm_produser, count(f.nm_film) as jmlh_film
				from produser p
				left join film f
					on p.kd_produser = f.produser
			group by p.nm_produser
		) as table1
		where table1.jmlh_film = 0;
		
-- langkah baru
	WITH table1 AS(
		select p.nm_produser, count(f.nm_film) as jmlh_film
		from produser p
		left join film f
			on p.kd_produser = f.produser
		group by p.nm_produser
	) select * from table1 where jmlh_film = 0;

--32 tampilkan produser film yg memilik artis termahal
-- langkah 1
	select
		p.nm_produser, a.nm_artis, a.bayaran
		from produser p
		left join film f
			on p.kd_produser = f.produser
		left join artis a
			on f.artis = a.kd_artis;

-- langkah 2
	select
	max(bayaran)
	from artis

-- langkah 3
	select
		*
		from (
			select
				p.nm_produser, max(a.bayaran) as bayaran
				from produser p
				left join film f
					on p.kd_produser = f.produser
				left join artis a
					on f.artis = a.kd_artis
				group by p.nm_produser
		) table1
		where table1.bayaran = (select max(bayaran) from artis);

--33 tampilkan produser yg memiliki artis paling banyak
--cara baru :
	WITH table1 AS(
		select
			p.nm_produser, count(a.nm_artis) as jmlh_artis
			from produser p
			left join film f
				on p.kd_produser = f.produser
			left join artis a
				on f.artis = a.kd_artis
			group by p.nm_produser
	), table2 AS(
		select max(jmlh_artis) from table1
	) select * from table1 where jmlh_artis = (select * from table2);


-- cara lama :
-- langkah 1
	select
		p.nm_produser, count(a.nm_artis)
		from produser p
		left join film f
			on p.kd_produser = f.produser
		left join artis a
			on f.artis = a.kd_artis
		group by p.nm_produser;
		
-- langkah 2
	select
	max(table1.jmlh_artis)
	from (select
		p.nm_produser, count(a.nm_artis) as jmlh_artis
		from produser p
		left join film f
			on p.kd_produser = f.produser
		left join artis a
			on f.artis = a.kd_artis
		group by p.nm_produser) table1;

-- langkah 3
	select
		table1.produser as "Produser", table1.jmlh_artis as "Jumlah Artis"
		from (
			select
				p.nm_produser as produser, count(a.nm_artis) as jmlh_artis
				from produser p
				left join film f
					on p.kd_produser = f.produser
				left join artis a
					on f.artis = a.kd_artis
				group by p.nm_produser
		) table1
		where table1.jmlh_artis = (
			select
				max(table2.jmlh_artis2)
				from (select
					p.nm_produser, count(a.nm_artis) as jmlh_artis2
					from produser p
					left join film f
						on p.kd_produser = f.produser
					left join artis a
						on f.artis = a.kd_artis
					group by p.nm_produser
					 ) table2);
--34 tampilkan produser yg memiliki artis paling sedikit
--cara baru :
WITH table1 AS (
	select
		p.nm_produser, count(a.nm_artis) as jmlh_artis
		from produser p
		left join film f
			on p.kd_produser = f.produser
		left join artis a
			on f.artis = a.kd_artis
		group by p.nm_produser
), table2 AS(
	select min(jmlh_artis) from table1
)select * from table1 where jmlh_artis = (select * from table2);

--cara lama :
--langkah 1
	select
		p.nm_produser, count(a.nm_artis)
		from produser p
		left join film f
			on p.kd_produser = f.produser
		left join artis a
			on f.artis = a.kd_artis
		group by p.nm_produser;
		
--	langkah 2
	select
		min(jmlh_artis)
		from (
			select
				p.nm_produser, count(a.nm_artis) as jmlh_artis
				from produser p
				left join film f
					on p.kd_produser = f.produser
				left join artis a
					on f.artis = a.kd_artis
				group by p.nm_produser
		) table1;
		
--	langkah 3
	select
		table1.produser as "Produser", table1.jmlh_artis as "Jumlah Artis"
		from(
			select
				p.nm_produser as produser, count(a.nm_artis) as jmlh_artis
				from produser p
				left join film f
					on p.kd_produser = f.produser
				left join artis a
					on f.artis = a.kd_artis
				group by p.nm_produser
		) table1
		where table1.jmlh_artis = (
				select
					min(table2.jmlh_artis2)
					from (
						select
							p.nm_produser, count(a.nm_artis) as jmlh_artis2
							from produser p
							left join film f
								on p.kd_produser = f.produser
							left join artis a
								on f.artis = a.kd_artis
							group by p.nm_produser
					) table2
		);