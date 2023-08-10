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
select



--24. tampilkan negara mana yang paling banyak filmnya


--25 tampilkan nama negara dengan jumlah filmnya
