--DDL
--create database
CREATE DATABASE batch324_2;
--drop database
DROP DATABASE batch324_2;
--create table
CREATE TABLE pegawai(
    id_pegawai INTEGER PRIMARY KEY,
    umur INTEGER,
    nama_pegawai TEXT
);
--drop table
DROP TABLE pegawai;
--insert data
INSERT INTO pegawai(nama_pegawai, umur)
VALUES('Budi', 20);
INSERT INTO pegawai(nama_pegawai, umur)
VALUES('Andi', 21);
INSERT INTO pegawai(nama_pegawai, umur)
VALUES('Caca', 22);
INSERT INTO pegawai(nama_pegawai, umur)
VALUES('Dedi', 23);
INSERT INTO pegawai(nama_pegawai, umur)
VALUES('Euis', 24);
INSERT INTO pegawai(nama_pegawai, umur)
VALUES('Fafa', 25);
INSERT INTO pegawai(nama_pegawai, umur)
VALUES('Gigi', 26);
--create tabel ktp
CREATE TABLE ktp(
    id_ktp INTEGER PRIMARY KEY,
    nama TEXT,
    ttl TEXT,
    jenis_kelamin TEXT,
    alamat TEXT
);
--alter tabel
ALTER TABLE ktp
    RENAME COLUMN ttl to tempat_tgl_lahir;
-- ALTER TABLE ktp
DROP COLUMN tempat_tgl_lahir;
-- ALTER TABLE ktp
ADD COLUMN tgl_lahir DATE;
--DML
SELECT *
FROM pegawai;
-- INSERT
INSERT INTO pegawai(nama_pegawai, umur)
VALUES('Rida', 27);
INSERT INTO pegawai(id_pegawai, nama_pegawai, umur)
VALUES(2, 'Dianti', 27);
-- INSERT MULTIPLE
INSERT INTO pegawai(id_pegawai, nama_pegawai, umur)
VALUES(3, 'Riswan', 27),
    (4, 'Friska', 27);
--UPDATE PEGAWAI
UPDATE pegawai
SET umur = 21
WHERE id_pegawai = 1;
--UPDATE MULTIPLE PEGAWAI
UPDATE pegawai
SET umur = 23,
    nama_pegawai = 'Budi Santoso'
WHERE id_pegawai = 2;
--DELETE PEGAWAI
DELETE FROM pegawai
WHERE id_pegawai = 3;
--UPDATE PEGAWAI WHERE NULL
UPDATE pegawai
SET umur = 23
WHERE umur IS NULL;
--SELECT SEMUA COLOM
SELECT *
FROM pegawai;
--SELECT COLOM TERTENTU
SELECT nama_pegawai
FROM pegawai;
--Alias kolom yang ditampilkan
SELECT nama_pegawai AS nama
FROM pegawai;
--Alias kolom dengan spasi
SELECT nama_pegawai AS "nama pegawai"
FROM pegawai;
-- Order by (mengurutkan data baik asc dan desc)
SELECT *
FROM pegawai
ORDER BY id_pegawai ASC;
SELECT *
FROM pegawai
ORDER BY id_pegawai DESC;
-- Distinct (menampilkan data yang unik)
SELECT DISTINCT umur
FROM pegawai
ORDER BY umur DESC;
-- Where (menampilkan data dengan kondisi tertentu)
SELECT *
FROM pegawai
WHERE umur = 23;
-- Tampilkan pegawai yang umurnya 20 dan namanya budi
SELECT *
FROM pegawai
WHERE umur = 23
    AND nama_pegawai = 'Budi Santoso';
-- where in
SELECT *
FROM pegawai
WHERE umur IN (23, 24);
-- where or
SELECT *
FROM pegawai
WHERE umur = 23
    OR umur = 24;
-- where between
SELECT *
FROM pegawai
WHERE umur BETWEEN 21 AND 23;
-- SELECT WHERE LIKE / CONTAINS / MENGANDUNG
-- Cari nama pegawai yang awalannya huruf b
-- not case sensitif
SELECT *
FROM pegawai
WHERE nama_pegawai ILIKE 'b%';
-- case sensitif
SELECT *
FROM pegawai
WHERE nama_pegawai LIKE 'B%';
-- Cari nama pegawai yang akhirannya huruf a
SELECT *
FROM pegawai
WHERE nama_pegawai LIKE '%a';
-- Agregat
-- AVG, MAX, MIN, SUM, COUNT
-- AVG
SELECT AVG(umur)
FROM pegawai;
-- MAX
SELECT MAX(umur)
FROM pegawai;
-- MIN
SELECT MIN(umur)
FROM pegawai;
-- SUM
SELECT SUM(umur)
FROM pegawai;
-- COUNT
SELECT COUNT(umur)
FROM pegawai;
SELECT AVG(umur) as "Rata-rata Umur Pegawai",
    MAX(umur) as "Maximal Umur Pegawai",
    MIN(umur) as "Minimal Umur Pegawai",
    SUM(umur) as "Total Umur Pegawai",
    COUNT(umur) as "Jumlah Pegawai"
FROM pegawai;
-- Group By
SELECT umur,
    COUNT(umur)
FROM pegawai
GROUP BY(umur);
-- Having
SELECT umur,
    COUNT(umur) as "Jumlah Pegawai"
FROM pegawai
GROUP BY(umur)
HAVING COUNT(umur) >= 1;
--Limit
SELECT umur,
    COUNT(umur) as "Jumlah Pegawai"
FROM pegawai
GROUP BY(umur)
HAVING COUNT(umur) >= 1
LIMIT 2;
-- database film
CREATE TABLE film(
    kd_film TEXT PRIMARY KEY,
    nm_film TEXT,
    pendapatan INTEGER,
    nominasi INTEGER
);
--INSERT DATA
INSERT INTO film
VALUES ('F001', 'IRON MAN', 2000000000, 3),
    ('F002', 'IRON MAN 2', 1800000000, 2),
    ('F003', 'IRON MAN 3', 1200000000, 0),
    ('F004', 'AVENGER:CIVIL WAR', 2000000000, 1),
    ('F005', 'SPIDERMAN HOME COMING', 1300000000, 0),
    ('F006', 'THE RAID', 800000000, 5),
    ('F007', 'FAST & FURIOUS', 830000000, 2),
    ('F008', 'HABIBI DAN AINUN', 670000000, 4),
    ('F009', 'POLICE STORY', 700000000, 3),
    ('F010', 'POLICE STORY 2', 710000000, 1),
    ('F011', 'POLICE STORY 3', 615000000, 0),
    ('F012', 'RUSH HOUR', 695000000, 2),
    ('F013', 'KUNGFU PANDA', 923000000, 5);
--SELECT
SELECT *
FROM film;
-- SOAL
-- Tampilkan nama film dan nominasi dari nominasi yang terbesar ke terkecil
SELECT nm_film AS "Nama Film",
    nominasi AS "Nominasi"
FROM film
ORDER BY nominasi DESC;
-- Tampilkan nama film dan pendapatan dari yang terkecil
SELECT nm_film AS "Nama Film",
    pendapatan AS "Pendapatan Film"
FROM film
ORDER BY pendapatan ASC;
-- Tampilkan nama film dan nominasi yang tidak dapat nominasi
SELECT nm_film AS "Nama Film",
    nominasi AS "Nominasi Film"
FROM film
WHERE nominasi = 0;
-- Tampilkan nama film dan nominasi yang paling banyak mendapat nominasi
SELECT nm_film AS "Nama Film",
    nominasi AS "Nominasi Film"
FROM film
WHERE nominasi = (
        SELECT MAX(nominasi)
        FROM film
    );
-- Tampilkan nama film dan pendapatan yang terbesar
SELECT nm_film AS "Nama Film",
    pendapatan AS "Pendapatan Film"
FROM film
WHERE pendapatan = (
        SELECT MAX(pendapatan)
        FROM film
    );
-- Tampilkan nama film dan pendapatan yang terkecil
SELECT nm_film AS "Nama Film",
    pendapatan AS "Pendapatan Film"
FROM film
WHERE pendapatan = (
        SELECT MIN(pendapatan)
        FROM film
    );
-- Tampilkan rata rata pendapatan film secara keseluruhan
SELECT ROUND(AVG(pendapatan)) as "Rata Rata Pendapatan"
FROM film;
-- tampilkan rata rata nominasi film keseluruhan
SELECT ROUND(AVG(nominasi)) as "Rata Rata Nominasi"
FROM film;
-- tampilkan nama film yang huruf depannya 'p'
SELECT nm_film as "Nama Film"
FROM film
WHERE nm_film ILIKE 'p%';
-- Upper
SELECT UPPER(nm_film) as "Nama Film"
FROM film;
-- Lower
SELECT LOWER(nm_film) as "Nama Film"
FROM film;
-- Tampilkan nama film yang huruf terakhirnya 's'
SELECT nm_film as "Nama Film"
FROM film
WHERE nm_film ILIKE '%s';
-- tampilkan nama film yang mengandung huruf 'd'
SELECT nm_film as "Nama Film"
FROM film
WHERE nm_film ILIKE '%d%';
-- tampilkan nama film dengan pendapatan terkecil yang mengandung huruf 'h'
SELECT nm_film as "Nama Film",
    pendapatan
FROM film
WHERE nm_film ILIKE '%h%'
ORDER BY pendapatan ASC
LIMIT 1;
-- another version
SELECT nm_film as "Nama Film",
    pendapatan
FROM film
WHERE nm_film ILIKE '%h%'
    and pendapatan = (
        SELECT MIN(pendapatan)
        FROM film
        WHERE nm_film ILIKE '%h%'
    );
-- tampilkan nama film dengan pendapatan terbesar yang mengandung huruf 'd'
SELECT nm_film as "Nama Film",
    pendapatan
FROM film
WHERE nm_film ILIKE '%d%'
ORDER BY pendapatan DESC
LIMIT 1;
-- another version
SELECT nm_film as "Nama Film",
    pendapatan
FROM film
WHERE nm_film ILIKE '%d%'
    AND pendapatan = (
        SELECT MAX(pendapatan)
        FROM film
        WHERE nm_film ILIKE '%d%'
    );
-- JOIN
create table kota(
    id integer primary key,
    nama text,
    id_propinsi integer
);
-- create propinsi
create table propinsi(id integer primary key, nama text);
-- insert kota
insert into kota
values (1, 'Jakarta', '1'),
    (2, 'Bandung', '2'),
    (3, 'Sumedang', '2'),
    (4, 'Makasar', '4'),
    (5, 'Surabaya', '5'),
    (6, 'Medan', '6');
-- insert propinsi
insert into propinsi
values (1, 'DKI Jakarta'),
    (2, 'Jawa Barat'),
    (3, 'Papua Barat'),
    (4, 'Sulawesi Selatan'),
    (5, 'Jawa Timur');
-- inner join
SELECT *
FROM kota
    INNER JOIN propinsi ON kota.id_propinsi = propinsi.id;

-- annother version
SELECT k.nama as "Nama Kota", p.nama as "Nama Propinsi"
FROM kota k
    INNER JOIN propinsi p ON k.id_propinsi = p.id;

-- left join
SELECT k.nama as "Nama Kota",
p.nama as "Nama Propinsi" FROM kota k LEFT JOIN propinsi p ON k.id_propinsi = p.id;

-- right join
SELECT k.nama as "Nama Kota",
p.nama as "Nama Propinsi" FROM kota k RIGHT JOIN propinsi p ON k.id_propinsi = p.id;

-- outter join
SELECT k.nama as "Nama Kota",
p.nama as "Nama Propinsi" FROM kota k FULL OUTER JOIN propinsi p ON k.id_propinsi = p.id;

coalesce 