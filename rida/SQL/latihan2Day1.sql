drop TABLE film;

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

--14
select
	f.nm_film as "Nama film",
	a. nm_artis as "Nama artis"
from film f
join artis a
	on f.artis= a.kd_artis;
--15
select
	f.nm_film as "Nama film"
from film f
join artis a
	on f.artis= a.kd_artis
	where a.negara='HK';
 
--16
select 
	f.nm_film as 	"Nama Film",
	a. nm_artis as "Nama artis",
	n.nm_negara as "Nama negara"
from film f
join artis a 
	on f.artis= a.kd_artis
join negara n
	on a.negara=n.kd_negara;

--17
select 
	f.nm_film as "Nama film",
	a.nm_artis as "Nama Artis"
from film f
join artis a 
	on f.artis=a.kd_artis
where award=(select max (award) from artis );

--18
select 
	f.nm_film as "Nama film",
	a.nm_artis as "Nama Artis",
	a.bayaran as "Bayaran"
from film f
join artis a 
	on f.artis=a.kd_artis
	where bayaran=(select min(bayaran)from artis);
--19
SELECT 
	a.nm_artis as "Nama Artis",
	f.nm_film as "Nama film"
from artis a
left join film f
	on f.artis=a.kd_artis
	where f.nm_film is null;
	
--20
select 
	a.nm_artis as "Nama Artis",
	f.nm_film as  "Nama Film",
	g.nm_genre as "Genre"
from film f
join artis a 
	on f.artis= a.kd_artis
join genre g
	on f.genre= g.kd_genre
	where g.nm_genre='DRAMA';
	
--21
select 
	a.nm_artis as "Nama Artis",
	f.nm_film as "Nama Film",
	g.nm_genre as "genre"
from artis a
join film f
	on f.artis= a.kd_artis
join genre g
	on f.genre= g.kd_genre
	where g.kd_genre='G001';
--22
select
	f.nm_film as "Nama film",
	a.nm_artis as "Nama Artis"
from film f
join artis a
	on f.artis=a.kd_artis
	where nm_artis ilike ('j%');
--23
select
	a.nm_artis as "Nama artis"
	count(f.nm_film)
from artis a
join film f
	on a.kd_artis=f.artis
--24 tampilkan negara mana yang paling banyak filmnya
select

from film f
--26 tampilkan nama produser yang skalanya international
select
	p.nm_produser as "Nama produser"
from produser p
	where p.international='YA';

--27 tampilkan jumlah film dari masing-masing produser
select 
	count(f.nm_film),
	p.nm_produser
from film f
right join produser p
	on f.produser=p.kd_produser
group by p.nm_produser

--28 tampilkan jumlah nominasi dari masing-masing produser
select
	coalesce (sum(f.nominasi),0) as "Jumlah nominasi",
	p.nm_produser
from film f
right join produser p
	on f.produser= p.kd_produser
group by p.nm_produser;	

--29 tampilkan jumlah pendapatan produser marvel secara keseluruhan
select 
	sum(f.pendapatan) as "pendapatan Marvel"
from film f
join produser p
	on f.produser =p.kd_produser
	where kd_produser='PD01';

--30 tampilkan jumlah pendapatan produser yang sekalanya tidak international
select 
	p.nm_produser as "Nama produser",
	sum (f.pendapatan) as "Jumlah Pendapatan" 
from film f
full outer join produser p
	on f.produser = p.kd_produser
	where p.international='TIDAK'
group by p.nm_produser;

--31 tampilkan produser yang tidak punya film
select 
 	f.nm_film,
 	p.nm_produser
from film f
right join produser p
 on f.produser = p.kd_produser
 where f.nm_film is null;
--coalesce -> mengubah tampilan yang tadinya null jadi yang kita tentukan 
--tipe datanya harus samaa
select coalesce (null,3);
--32 tampilkan produser film yang memiliki artis termahal
select
	p.nm_produser,
	max(a.bayaran)
from produser p
join film f
	on f.produser =p.kd_produser
join artis a
	on f.artis= a.kd_artis
group by p.nm_produser;

select max(max) from (select
	p.nm_produser,
	max(a.bayaran)
from produser p
join film f
	on f.produser =p.kd_produser
join artis a
	on f.artis= a.kd_artis
group by p.nm_produser
)tabel1

select * from (select
	p.nm_produser,
	max(a.bayaran)
from produser p
join film f
	on f.produser =p.kd_produser
join artis a
	on f.artis= a.kd_artis
group by p.nm_produser
)tabel2
where tabel2.max= (select max(max) from (select
	p.nm_produser,
	max(a.bayaran)
from produser p
join film f
	on f.produser =p.kd_produser
join artis a
	on f.artis= a.kd_artis
group by p.nm_produser
)tabel1)

--33 tampilkan produser yang memiliki artis paling banyak
select
	p.nm_produser,
	count(f.artis)
from produser p
join film f
	on f.produser= p.kd_produser
group by p.nm_produser;
select max(count) from (select
	p.nm_produser,
	count(f.artis)
from produser p
join film f
	on f.produser= p.kd_produser
group by p.nm_produser)tabel1
select* from (select
	p.nm_produser,
	count(f.artis)
from produser p
join film f
	on f.produser= p.kd_produser
group by p.nm_produser)tabel2
where tabel2.count=(select max(count) from (select
	p.nm_produser,
	count(f.artis)
from produser p
join film f
	on f.produser= p.kd_produser
group by p.nm_produser)tabel1)
 --34 tampilkan produser yang memiliki artis paling sedikit
 select
 	p.nm_produser,
	count(f.artis)
 from produser p
 left join film f
 		on f.produser=p.kd_produser
group by p.nm_produser;
select min(count) from (select
 	p.nm_produser,
	count(f.artis)
 from produser p
 left join film f
 		on f.produser=p.kd_produser
group by p.nm_produser)tabel1;
select*from( select
 	p.nm_produser,
	count(f.artis)
 from produser p
 left join film f
 		on f.produser=p.kd_produser
group by p.nm_produser)tabel2
where tabel2.count=(select min(count) from (select
 	p.nm_produser,
	count(f.artis)
 from produser p
 left join film f
 		on f.produser=p.kd_produser
group by p.nm_produser)tabel1)