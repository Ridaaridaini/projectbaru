--JOIN TABLE

create table kota(
	id integer primary key,
	nama text,
	in_propinsi integer
);

alter table kota
rename column in_propinsi to id_propinsi;

create table propinsi(
	id integer primary key,
	nama text
);

insert into kota
values
(1, 'Jakarta', '1'),
(2, 'Bandung', '2'),
(3, 'Sumedang', '2'),
(4, 'Makasar', '4'),
(5, 'Surabaya', '5'),
(6, 'Medan', '6');

insert into propinsi
values
(1, 'DKI Jakarta'),
(2, 'Jawa Barat'),
(3, 'Papua Barat'),
(4, 'Sulawesi Selatan'),
(5, 'Jawa Timur');

select * from kota;

select * from propinsi;


--INNER JOIN/JOIN
select * from kota inner join propinsi on kota.id_propinsi = propinsi.id;

select kota.nama as "Nama Kota", propinsi.nama as "Nama Propinsi" from kota inner join propinsi on kota.id_propinsi = propinsi.id;


--Memperpendek nama tabel
select 
k.nama as "Nama Kota", 
p.nama as "Nama Propinsi" 
from kota k
inner join propinsi p 
on k.id_propinsi = p.id;

--LEFT JOIN
select * from kota left join propinsi on kota.id_propinsi = propinsi.id;

--RIGHT JOIN
select * from kota right join propinsi on kota.id_propinsi = propinsi.id;


--FULL OUTER JOIN
select * from kota full outer join propinsi on kota.id_propinsi = propinsi.id;