create table kota(
	id integer primary key,
	nama text,
	id_propinsi integer
);

drop table kota;

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

--inner join
select * from kota inner join propinsi
on kota.id_propinsi = propinsi.id;

select 
	kota.nama as "Nama Kota",
	propinsi.nama as "Nama provinsi"
from kota inner join propinsi 
	on kota.id_propinsi = propinsi.id;
	

select
	k.nama as "Nama Kota",
	p.nama as "Nama Provinsi"
from kota k inner join propinsi p on
	k.id_propinsi = p.id;

--left join
select
	k.nama as "Nama Kota",
	p.nama as "Nama Provinsi"
from kota k left join propinsi p on
	k.id_propinsi = p.id;

--right join
select
	k.nama as "Nama Kota",
	p.nama as "Nama Propinsi"
from kota k right join propinsi p on
	k.id_propinsi = p.id;

--full outer join
select
	k.nama as "Nama Kota",
	p.nama as "Nama Propinsi"
from kota k full outer Join propinsi p on
	k.id_propinsi = p.id;







