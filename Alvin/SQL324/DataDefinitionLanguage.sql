--DDL Data Definition Language

--<<create database
create database batch324_2

--<<delete database
drop database batch324_2

--<<create table
create table pegawai(
	id_pegawai integer primary key,
	umur integer,
	nama_pegawai text
);

--<<delete table
drop table pegawai

--<<table ktp
create table ktp(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text
);

--<<select table
select * from ktp;

--<<rename
alter table ktp
rename column ttl to tempat_tanggal_lahir;

--<<ganti tipe data kolom jenis kelamin
alter table ktp
alter column jenis_kelamin type boolean USING jenis_kelamin::boolean;


--<<describe table
SELECT 
   table_name, 
   column_name, 
   data_type 
FROM 
   information_schema.columns
WHERE 
   table_name = 'ktp';
   
--<<hapus tempat tanggal lahir
alter table ktp
drop column tempat_tanggal_lahir;

--<<tambah column
alter table ktp
add column tanggal_lahir date;

--<<DML Data Manipulation Language
select * from pegawai order by id_pegawai asc;

--<<insert data
--<<cara 1 dapat diisi sesuai dengan nama kolom yang didefinisikan
insert into pegawai (nama_pegawai, id_pegawai) --pendefinisian nama kolom
values ('Dr. Radjiman',1); --isi kolom berdasarkan nama kolom

--<<cara 2 harus diisi semua dan harus urut
insert into pegawai values (3, 35, 'Tjokro');

--<<multiple insert = mengisi kolom dengan banyak value
insert into pegawai (nama_pegawai, id_pegawai)
values
('Soemitro', 3),
('Kartosoewirjo', 4),
('Tan Malaka', 5);

--<<update kolom tabel = mengubah value pada kolom
update pegawai
set umur = 35
where id_pegawai = 1;

--<<update kolom table multiple
update pegawai
set nama_pegawai = 'Soepomo', umur = 30
where id_pegawai = 5;

--<<delete baris pada table pegawai
delete from pegawai
where id_pegawai = 3;

--<<update data kolom yang ber-value null
update pegawai
set umur = 21
where umur is null;

--<<select semua kolom pada tabel
select * from pegawai;

--<<select kolom tertentu
select nama_pegawai, umur from pegawai;

--<<alias kolom
select nama_pegawai as nama from pegawai;

select nama_pegawai as "Nama Pegawai" from pegawai; --petik dua (") digunakan untuk membuat alias nama tabel

--<<mengurutkan data berdasarkan asc/desc
select * from pegawai order by id_pegawai asc;
select * from pegawai order by umur desc;

--<<distinct digunakna untuk menampilkan value yang unik
select distinct umur from pegawai;

--<<select where
--<< menampilkan pegawai yang umurnya 35
select * from pegawai where umur = 35;

--<< menampilkan pegawai yang umurnya 35 atau 18
select * from pegawai where umur = 35 or umur =18;

--<< menampilkan pegawai yang umurnya 18 dan namanya Semaun
select * from pegawai where umur = 18 and nama_pegawai='Semaun';

--<< where in = merupakan alternatif dari 'or'
select * from pegawai where umur in (35, 18);

--<< where between = mencari data diantara
select * from pegawai where umur between 17 and 30;

--<< contains/ mengandung
--cari nama pegawai yang awalanya S // like = sensitive case, ilike = insensitive case
select * from pegawai where nama_pegawai like 'S%';

select * from pegawai where nama_pegawai ilike 's%';

--<<cari nama pegawai yang akhiranya N
select * from pegawai where nama_pegawai ilike '%n';

--<<cari nama pegawai yang mengandung huruf M
select * from pegawai where nama_pegawai like '%m%';

--<< AGREGATE (average, sum, min, max, count)
select
	avg(umur) as "Rata Rata Umur",
	max(umur) as "si Paling Tua",
	min(umur) as "si Paling Muda",
	sum(umur) as "Jumlah Umur Pegawai",
	count(umur) as "Jumlah data umur"
from pegawai;

--<< group by = pengelompokan berdasarkan kolom
--menampilkan data umur dan jumlah pegawai yang memiliki umur sama
select
	umur as "Umur", count(umur) as "Jumlah Pegawai"
from pegawai
group by umur;

--<< having = menggantikan where ketika menggunakan GROUP BY
select
	umur as "Umur", count(umur) as "Jumlah Pegawai"
from pegawai
group by umur having umur = 35;

--<< limit = batas data yang ditampilkan
select
	umur as "Umur", count(umur) as "Jumlah Pegawai"
	from pegawai
	group by umur
	having umur in (35, 18)
	limit 2;
	
--<< floor() (buletin kebawah)
select floor(2.1232434)
--<< ceil() (buletin ke atas)
select ceil(2.1232434)
--<< round() (buletin ke terdekat)
select round(2.1232434);
select round(2.1232434, 2);

--<< latihan film
create table film(
	kd_film text primary key,
	nm_film text,
	pendapatan integer,
	nominasi integer
);

insert into film values
('F001','IRON MAN',2000000000,3),
('F002','IRON MAN 2',1800000000,2),
('F003','IRON MAN 3',1200000000,0),
('F004','AVENGER:CIVIL WAR',2000000000,1),
('F005','SPIDERMAN HOME COMING',1300000000,0),
('F006','THE RAID',800000000,5),
('F007','FAST & FURIOUS',830000000,2),
('F008','HABIBI DAN AINUN',670000000,4),
('F009','POLICE STORY',700000000,3),
('F010','POLICE STORY 2',710000000,1),
('F011','POLICE STORY 3',615000000,0),
('F012','RUSH HOUR',695000000,2),
('F013','KUNGFU PANDA',923000000,5);

select * from film;

--soal latihan
-- 1. tampilkan nama film dan nominasi dari nominasi yang terbesar
-- 2. tampilkan nama film dan pendapatan dari yang terkecil
-- 3. tampilkan nama film dan nominasi yang tidak dapat nominasi

--nomor 1
select nm_film as "Nama Film", nominasi as "Jumlah Nominasi"
	from film
	order by nominasi DESC;
	
--nomor 2
select nm_film as "Nama Film", pendapatan as "Pendapatan"
	from film
	order by pendapatan ASC;
	
--nomor 3
select nm_film as "Nama Film", nominasi as "Jumlah Nominasi"
	from film
	where nominasi = 0;
	
-- 4. tampilkan nama film dan nominais yang paling banyak mendapatkan nominasi
-- 5. tampilkan nama film dan pendapatan yang terbesar
-- 6. tampilkan nama film dan pendapatan yang terkecil

--nomor 4
select nm_film as "Nama Film", nominasi as "Jumlah Nominasi"
	from film
	where nominasi = (select max(nominasi) from film);
	
--nomor 5
select nm_film as "Nama Film", pendapatan
	from film
	where pendapatan = (select max(pendapatan) from film);
	
--nomor 6
select nm_film as "Nama Film", pendapatan
	from film
	where pendapatan = (select min(pendapatan) from film);
	
-- 7. tampilkan rata2 pendapatan film keseluruhan
-- 8. tampilkan rata2 nominasi film keseluruhan
-- 9. tampilkan nama film yang huruf depanya p (insensitive case)

--nomor 7
select round(avg(pendapatan)) as "Rata2 Pendapatan Film Keseluruhan"
	from film;
	
--nomor 8
select round(avg(nominasi), 2) as "Rata2 Nominasi"
	from film;
	
--nomor 9
select nm_film as "Nama Film dengan awalan P"
	from film
	where nm_film ilike 'p%';
	
--<< fungsi lower() = mengubah case menjadi kecil semua
--<< fungsi upper() = mengubah case menjadi besar semua

select lower('bAgUS');
select upper('bAgUS');

-- 10. tampilkan nama file yang huruf terakhirnya 's' (not case sensitive)
-- 11. tampilkan nama file yang mengandung huruf 'd'
-- 12. tampilkan nama file dengan pendapatan terkecil yang mengandung huruf 'h'
-- 13. tampilkan nama file dengan pendapatan terbesar yang mengandung huruf 'd'

--nomor 10
select nm_film as "Nama Film"
	from film
	where nm_film ilike '%s'
	
--nomor 11
select nm_film as "Nama Film"
	from film
	where nm_film ilike '%d%';
	
--nomor 12
select nm_film as "Nama Film"
	from film
	where pendapatan = (select min(pendapatan) from film where nm_film ilike '%h%');
	
--nomor 13
select nm_film as "Nama Film"
	from film
	where pendapatan = (select max(pendapatan) from film where nm_film ilike '%d%');
	
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

select * from propinsi;

-- MAIN JONI JONIAN

-- INNER JOIN ==> hanya menampilkan data yang saling memiliki relasi antara table kiri dan kanan
select *
	from kota --table sebelah kiri
	inner join propinsi --table sebelah kanan
	on kota.id_propinsi = propinsi.id;
	
select kota.nama as "Nama Kota", propinsi.nama as "Nama Provinsi"
	from kota --table sebelah kiri
	inner join propinsi --table sebelah kanan
	on kota.id_propinsi = propinsi.id;
	
--LEFT JOIN => semua data yang diminta pada table sebelah kiri akan ditampilkan,
--walaupun tidak memiliki relasi data table sebelah kanan

select x.nama as "Nama Kota", y.nama as "Nama Provinsi"
	from kota x --table sebelah kiri
	left join propinsi y --table sebelah kanan
	on x.id_propinsi = y.id;
	
-- RIGHT JOIN => semua data pada table sebelah kanan akan ditampilkan dan tabel sebelah kiri mengikuti (kebalikan left join)

select kota.nama as "Nama Kota", propinsi.nama as "Nama Propinsi"
	from kota
	right join propinsi
	on kota.id_propinsi = propinsi.id;
	
--FULL OUTER JOIN => menampilkan semua data pada kolom yang diminta,
--walaupun datanya tidak memiliki relasi antar kedua table tersebut

select x.nama as "Nama Kota", y.nama as "Nama Provinsi"
	from kota x
	full outer join propinsi y
	on x.id_propinsi = y.id;
	
	
	
	

	
	
	
	
	
	