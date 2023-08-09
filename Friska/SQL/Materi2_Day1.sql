create table kota(
	id integer primary key,
	nama text,
	id_propinsi integer
);

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
(4, 'Sulawesi Selatan');

insert into propinsi
values
(5, 'Jawa Timur');

select * from kota;
select * from propinsi;

--inner join / join
select
	*
from kota
inner join propinsi
	on kota.id_propinsi = propinsi.id;
	
-- menampilkan nama proponsi dan kota saja --

select
	kota.nama as "Nama kota",
	propinsi.nama as "Nama Proponsi"
from kota
inner join propinsi
	on kota.id_propinsi = propinsi.id;
	
-- nama tabel dialiaskan--

select
	k.nama,
	p.nama
from kota k
inner join propinsi p
	on k.id_propinsi = p.id;
	
-- left join
select
	k.nama, 
	p.nama
from kota k
left join propinsi p
	on k.id_propinsi = p.id;

-- right join
select  
	k.nama,
	p.nama
from kota k
right join propinsi p
	on k.id_propinsi = p.id;
	

-- full outer join
select
	k.nama,
	p.nama
from kota k
full outer join propinsi p
	on k.id_propinsi = p.id;