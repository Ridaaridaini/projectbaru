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

--14. tampilkan nama film dan artisnya
select 
	film.nm_film as "Nama Film",
	artis.nm_artis as "Nama artis"
from film join artis on
	film.artis = artis.kd_artis;

--15. tampilkan film yang artisnya berasal dari hongkong
select 
	film.nm_film as "Nama Film"
from film join artis on
	film.artis = artis.kd_artis
where artis.negara = 'HK';


--16. tampilkan nama film, nama artis dan nama negara
select 
	film.nm_film as "Nama Film",
	artis.nm_artis as "Nama Artis",
	negara.nm_negara as "Nama Negara"
from film join artis on
	film.artis = artis.kd_artis
join negara on
	artis.negara = negara.kd_negara;


--17. tampilkan nama film, artis dan award nya yang awrd terbanyak
select 
	film.nm_film as "Nama Film",
	artis.nm_artis as "Nama Artis",
	artis.award
from film join artis on
	film.artis = artis.kd_artis
where award = (select max(artis.award) from artis);


--18. tampilkan nama film , nama artis dan bayaran dengan bayaran artis yang terendah
select 
	film.nm_film as "Nama Film",
	artis.nm_artis as "Nama Artis",
	artis.bayaran
from film join artis on
	film.artis = artis.kd_artis
where artis.bayaran = (select min(artis.bayaran) from artis);


--19. tampilkan nama artis yang tidak pernah bermain film
select 
	artis.nm_artis as "Nama Artis"
from artis left join film on
	artis.kd_artis = film.artis
where film.nm_film is null;


--20. tampilkan nama artis, film dan genre yang genrenya drama
select 
	artis.nm_artis as "Nama Artis",
	film.nm_film as "Nama Film",
	genre.nm_genre
from artis join film on
	artis.kd_artis = film.artis
join genre on
	film.genre = genre.kd_genre
where genre.nm_genre = 'DRAMA';

--21 . tampilkan nama artis, film dan genre yang bermain film dengan genre horor
select 
	artis.nm_artis as "Nama Artis",
	film.nm_film as "Nama Film",
	genre.nm_genre as "gendre"
from artis join film on
	artis.kd_artis = film.artis
join genre on
	film.genre = genre.kd_genre
where genre.nm_genre = 'ACTION';

--22.tampilkan nama film & artis yang dibintangi oleh artis yang huruf depannya 'j'
SELECT
	film.nm_film as "Nama Film",
	artis.nm_artis as "Nama Artis"
from film join artis on
	film.artis = artis.kd_artis
where artis.nm_artis ilike 'j%';

--23. tampilkan nama artis yang paling banyak bermain film
--step 1 : join tabel 1 dulu aja
select 
	a.nm_artis,
	count(f.nm_film)
from film f join artis a
	on f.artis = a.kd_artis
group by a.nm_artis
order by count(f.nm_film) desc;

--step 2
select max(count) from (select 
	a.nm_artis,
	count(f.nm_film)
from film f join artis a
	on f.artis = a.kd_artis
group by a.nm_artis
order by count(f.nm_film) desc)as tabel1;

--step 3

select * 
	from(select
		a.nm_artis,
		count(f.nm_film)
		from film f join artis a on
		f.artis = a.kd_artis
		GROUP BY nm_artis
		order by count desc) tabel1
where tabel1.count = (select max(count) from (select a.nm_artis,
											count(f.nm_film) from film f join artis a on f.artis=a.kd_artis
											GROUP BY nm_artis
											order BY count desc) tabel2);


--24. tampilkan negara mana yang paling banyak filmnya
--step 1 menentukan negara dan jumlah negaranya
select 
	n.nm_negara,
	count(f.nm_film) as jml_film
from negara n join artis a on
	n.kd_negara = a.negara
join film f on
	a.kd_artis = f.artis
group by n.nm_negara
order by count(f.nm_film) desc;

--step 2
select max(jml_film) from(select 
		n.nm_negara,
		count(f.nm_film) as jml_film
		from negara n join artis a on
			n.kd_negara = a.negara
		join film f on
			a.kd_artis = f.artis
		group by n.nm_negara
		order by count(f.nm_film) desc) as tabel1;


---cara 1
--step 3 jawaban final fixx
select nm_negara 
from ( select n.nm_negara,
	  count(f.nm_film)
		from negara n join artis a on
			n.kd_negara = a.negara
		join film f on
			a.kd_artis = f.artis
		GROUP BY n.nm_negara
		order by count(f.nm_film) desc) as tabel1
where tabel1.count = (select max(count) from(select n.nm_negara,
						count(f.nm_film)
						from negara n join artis a on
							n.kd_negara = a.negara 
						join film f on
							a.kd_artis = f.artis
						GROUP BY n.nm_negara
						order by count(f.nm_film) desc) as tabel2);

-------cara 2
--membuat temporary table(dg catatan harus teliti untuk ;)
drop view if exists view2;
drop view if exists view1;
CREATE or replace view view1 AS
select 
	n.nm_negara,
	count(f.nm_film) as jml_film
from film f join artis a on
	f.artis = a.kd_artis
join negara n on
	a.negara = n.kd_negara
GROUP BY n.nm_negara;

select * from view1;

drop view if exists view2;
CREATE or replace view view2 AS
select max(jml_film) from view1;

select * from view2;

select
	nm_negara
from view1
where jml_film = (select * from view2);


---cara 3
WITH  f as(select 
		n.nm_negara as negara,
		count(f.nm_film) as jml_film
	from negara n join artis a on
		n.kd_negara = a.negara
	join film f on
		f.artis = a.kd_artis
	GROUP BY n.nm_negara),
	f_max as(select max(jml_film) from f)
select negara from f where jml_film = (select * from f_max);


--25 tampilkan nama negara dengan jumlah filmnya
select 
	n.nm_negara,
	count(f.nm_film)
from negara n join artis a on
	n.kd_negara = a.negara
join film f on
	a.kd_artis = f.artis
GROUP BY n.nm_negara
order by count(f.nm_film) desc;

--step 2
select max(count) from(select n.nm_negara,
						count(f.nm_film)
						from negara n join artis a on
							n.kd_negara = a.negara 
						join film f on
							a.kd_artis = f.artis
						GROUP BY n.nm_negara
						order by count(f.nm_film) desc) as tabel1;


select * 
	from (select n.nm_negara,
		 		count(f.nm_film) as jml_film
		 from negara n join artis a on
		 	n.kd_negara = a.negara
		 join film f on
		 a.kd_artis = f.artis
		 group by n.nm_negara
		 order by count(f.nm_film) desc) as tabel1
where tabel1.jml_film = (select max(jml_film) from (SELECT n.nm_negara,
											 count(f.nm_film) as jml_film
											 from negara n join artis a on
											 	n.kd_negara = a.negara
											 join film f on
											 a.kd_artis = f.artis
											 group by n.nm_negara
											 order by count(f.nm_film) desc) as tabel2);


SELECT
	n.nm_negara as "Nama Negara",
	count(f.nm_film) as "Jumlah Film"
from negara n left join artis a on
	n.kd_negara = a.negara
left join film f on
	a.kd_artis = f.artis
GROUP BY 1
order by 2 desc;
											 

------------------------------day 12 (day2 sql)-------------------------------------
--26. tampilkan nama produser yang skalanya internasional
select nm_produser from produser
where international = 'YA';

--27. tampilkan jumlah film dari masing-masing  produser

select 
		p.nm_produser,
		count(f.nm_film) as jml_film
from produser p left join film f on
	p.kd_produser = f.produser
GROUP BY p.nm_produser
order by 2 desc;

--28. tampilkan jumlah nominasi dari masing-masing produser
select 
	p.nm_produser,
	coalesce(sum(f.nominasi),0)
from produser p left join film f on
	p.kd_produser = f.produser
GROUP BY 1
order by 2 desc;

--fungsi coalasce --> mengubah tampilan yang tadinya null jadi yang kita tentukan
--> tipe datanya harus sam
select coalesce(null,3);

--29. tampilkan jumlah pendapatan produser marvel secara keseluruhan
select 
		p.nm_produser,
		sum(f.pendapatan) as pendapatan
from produser p join film f on
	p.kd_produser = f.produser
where p.nm_produser = 'MARVEL'
GROUP BY 1
order by 2;

--30. tampilkan nama produser jumlah pendapatan produser yang skalanya tidak internasional

SELECT 
	p.nm_produser,
	sum(f.pendapatan) as pendapatan
from produser p left join film f on
	p.kd_produser = f.produser
where p.international = 'TIDAK'
GROUP BY p.nm_produser
order by sum(f.pendapatan) desc;


--31. TAMPILKAN PRODUSER YANG TIDAK PUNYA FILM
select
	p.nm_produser
from produser p left join film f on
	p.kd_produser = f.produser
where f.nm_film is null;


--32. tampilkan produser yang memiliki artis termahal
--menentukan nama produser dan artis dan bayaran artis
select 
		p.nm_produser,
		a.nm_artis,
		a.bayaran as bayaran
from produser p join film f on
	p.kd_produser = f.produser
join artis a on
	a.kd_artis = f.artis;

--menentukan bayaran artis termahal
select max(bayaran) from (select 
		p.nm_produser,
		a.nm_artis,
		a.bayaran as bayaran
from produser p join film f on
	p.kd_produser = f.produser
join artis a on
	a.kd_artis = f.artis) as tabel1;

--fixx
select 
		distinct(nm_produser)
 from (select 
		p.nm_produser,
		a.nm_artis,
		a.bayaran as bayaran
	from produser p join film f on
		p.kd_produser = f.produser
	join artis a on
		a.kd_artis = f.artis) as tabel1
where tabel1.bayaran = (select max(bayaran) from (select 
				p.nm_produser,
					a.nm_artis,
					a.bayaran as bayaran
			from produser p join film f on
				p.kd_produser = f.produser
			join artis a on
				a.kd_artis = f.artis) as tabel2);


---cara 2

WITH f as (select 
	distinct(p.nm_produser),
	a.bayaran as bayaran
	from produser p join film f on
		p.kd_produser = f.produser
	join artis a on
	f.artis = a.kd_artis),
 f_max as (select max(bayaran) from f)
 select nm_produser from f where bayaran = (SELECT*from f_max);


--33. tampilkan produser yang memiliki artis paling banyak
--menampilkan nama produser dan banyaknya artis
select
		p.nm_produser,
		count(a.nm_artis) as artis
from produser p join film f on
	p.kd_produser = f.produser
join artis a on
	f.artis = a.kd_artis
GROUP BY p.nm_produser;


--menampilan max artis
select max(artis) from (select
		p.nm_produser,
		count(a.nm_artis) as artis
from produser p join film f on
	p.kd_produser = f.produser
join artis a on
	f.artis = a.kd_artis
GROUP BY p.nm_produser) as tabel_artis1;

--gabungkan -----cara1
select
	nm_produser
from(select
		p.nm_produser,
		count(a.nm_artis) as artis
	from produser p join film f on
		p.kd_produser = f.produser
	join artis a on
		f.artis = a.kd_artis
	GROUP BY p.nm_produser) as tabel_artis
where tabel_artis.artis = (select max(artis) from (select
		p.nm_produser,
		count(a.nm_artis) as artis
	from produser p join film f on
		p.kd_produser = f.produser
	join artis a on
		f.artis = a.kd_artis
	GROUP BY p.nm_produser) as tabel_artis1);


--cara 2
with f as(
select
	p.nm_produser as nama_produser,
	count(f.artis) as jml_artis
from produser p join film f on
	p.kd_produser = f.produser
GROUP BY p.nm_produser),
	f_max as(select max(jml_artis) from f)
select nama_produser from f where jml_artis = (select * from f_max);	


--34 tampilkan produser yang memiliki artis paling sedikit
--menampilkan produser dan jumlah artisnya
SELECT
	p.nm_produser,
	count(a.nm_artis) as jum_artis
from produser p left join film f on
	p.kd_produser = f.produser
left join artis a on
	f.artis = a.kd_artis
GROUP BY p.nm_produser;

--menampilkan artis yang paling minimum
select min(jum_artis) from(SELECT
		p.nm_produser,
		count(a.nm_artis) as jum_artis
	from produser p left join film f on
		p.kd_produser = f.produser
	left join artis a on
		f.artis = a.kd_artis
	GROUP BY p.nm_produser) as min_artis;

--gabungan fix -------cara 1-----------
select 
	nm_produser 
from (SELECT
		p.nm_produser,
		count(a.nm_artis) as jum_artis
	from produser p left join film f on
		p.kd_produser = f.produser
	left join artis a on
		f.artis = a.kd_artis
	GROUP BY p.nm_produser) as tabel_artis
where tabel_artis.jum_artis = (select min(jum_artis) from(SELECT
		p.nm_produser,
		count(a.nm_artis) as jum_artis
	from produser p left join film f on
		p.kd_produser = f.produser
	left join artis a on
		f.artis = a.kd_artis
	GROUP BY p.nm_produser) as min_artis);

---- cara 2
WITH f as(
	select p.nm_produser,
	count(f.artis) as jml_artis
	from produser p left join film f on
		p.kd_produser = f.produser
	GROUP BY p.nm_produser
), f_min as(
		select min(jml_artis) from f)
select * from f where jml_artis= (select * from f_min);

