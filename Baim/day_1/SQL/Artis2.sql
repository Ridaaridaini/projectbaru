-- Tampilkan nama film dan artisnya
SELECT f.nm_film as "Nama Film",
    a.nm_artis AS "Nama Artis"
FROM film f
    INNER JOIN artis a ON a.kd_artis = f.artis;

-- Tampilkan film yang artisnya berasal dari negara hongkong
SELECT f.nm_film AS "Nama Film",
    a.nm_artis AS "Nama Artis",
    a.negara
FROM film f
    INNER JOIN artis a ON a.kd_artis = f.artis
WHERE a.negara = 'HK';

-- Tampilkan nama film, nama artis, nama negara
SELECT f.nm_film AS "Nama Film",
    a.nm_artis AS "Nama Artis",
    n.nm_negara AS "Negara"
FROM film f
    INNER JOIN artis a ON a.kd_artis = f.artis
    INNER JOIN negara n ON a.negara = n.kd_negara;

-- tampilkan nama film, nama artis, awardnya yang terbanyak
SELECT f.nm_film AS "Nama Film",
    a.nm_artis AS "Nama Artis",
    a.award AS "Award"
FROM film f
    INNER JOIN artis a ON a.kd_artis = f.artis
WHERE a.award = (
        SELECT MAX(award)
        FROM artis
    );

-- tampilkan nama film, nama artis, bayaran yang terendah
SELECT f.nm_film AS "Nama Film",
    a.nm_artis AS "Nama Artis",
    a.bayaran AS "Bayaran"
FROM film f
    INNER JOIN artis a ON a.kd_artis = f.artis
WHERE a.bayaran = (
        SELECT MIN(bayaran)
        FROM artis
    );

-- tampilkan nama artis yang tidak pernah bermain film
SELECT a.nm_artis AS "Nama Artis"
FROM film f
    RIGHT JOIN artis a ON a.kd_artis = f.artis
WHERE f.nm_film IS NULL;

-- tampilkan nama artis, film dan genre yang bermain film dengan genre drama
SELECT a.nm_artis AS "Nama Artis",
    f.nm_film as "Nama Film",
    g.nm_genre as "Genre"
FROM film f
    INNER JOIN genre g ON g.kd_genre = f.genre
    INNER JOIN artis a ON a.kd_artis = f.artis
WHERE g.kd_genre = 'G004';
