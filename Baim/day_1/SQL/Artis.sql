-- tampilkan nama artis, film & genre yang bermain film dengan genre horror
SELECT a.nm_artis as "Artis",
    f.nm_film as "Film",
    g.nm_genre as "Genre"
FROM film f
    JOIN genre g ON g.kd_genre = f.genre
    JOIN artis a ON a.kd_artis = f.artis
WHERE g.kd_genre = 'G001';
-- tampilkan nama film & artis yang dibintangi oleh artis yang huruf depannya 'J'
SELECT f.nm_film AS "Film",
    a.nm_artis AS "Artis"
FROM film f
    JOIN artis a ON a.kd_artis = f.artis
WHERE a.nm_artis ILIKE 'J%';
-- tampilkan nama artis yang paling banyak bermain film
SELECT COUNT(f.artis) AS "Jumlah Film",
    a.nm_artis
FROM film f
    JOIN artis a ON a.kd_artis = f.artis
GROUP BY a.nm_artis
ORDER BY "Jumlah Film" DESC;
--STEP 2
SELECT sub."Jumlah Film",
    sub.nm_artis AS "Artis"
FROM(
        SELECT COUNT(f.artis) AS "Jumlah Film",
            a.nm_artis
        FROM film f
            JOIN artis a ON a.kd_artis = f.artis
        GROUP BY a.nm_artis
        ORDER BY "Jumlah Film" DESC
    ) AS sub
WHERE "Jumlah Film" = (
        SELECT MAX(sub."Jumlah Film")
        FROM(
                SELECT COUNT(f.artis) AS "Jumlah Film",
                    a.nm_artis
                FROM film f
                    JOIN artis a ON a.kd_artis = f.artis
                GROUP BY a.nm_artis
                ORDER BY "Jumlah Film" DESC
            ) sub
    );
WITH sub AS (
    SELECT COUNT(f.artis) AS "Jumlah Film",
        a.nm_artis
    FROM film f
        JOIN artis a ON a.kd_artis = f.artis
    GROUP BY a.nm_artis
)
SELECT sub."Jumlah Film",
    sub.nm_artis AS "Artis"
FROM sub
WHERE sub."Jumlah Film" = (
        SELECT MAX("Jumlah Film")
        FROM sub
    )
ORDER BY sub."Jumlah Film" DESC;
-- tampilkan negara mana yang paling banyak filmnya
SELECT n.nm_negara AS "Negara",
    COUNT(f.nm_film)
FROM film f
    JOIN artis a on f.artis = a.kd_artis
    JOIN negara n on a.negara = n.kd_negara
GROUP BY n.nm_negara;
-- tampilkan data ngeara dengan jumlah filmnya
SELECT n.nm_negara AS "Negara",
    COUNT(f.nm_film)
FROM film f
    JOIN artis a on f.artis = a.kd_artis
    RIGHT JOIN negara n on a.negara = n.kd_negara
GROUP BY n.nm_negara;
-- tampilkan nama produser yang skalanya international
SELECT nm_produser AS "Produser"
FROM produser
WHERE international = 'YA';
-- tampilkan jumlah film dari produser
-- STEP 1
SELECT f.nm_film AS "Film",
    p.nm_produser AS "Produser"
FROM film f
    JOIN produser p ON p.kd_produser = f.produser;
-- STEP 2
SELECT p.nm_produser AS "Produser",
    COUNT(p.nm_produser) AS "Jumlah"
FROM film f
    JOIN produser p ON p.kd_produser = f.produser
GROUP BY p.nm_produser
ORDER BY "Jumlah" DESC;
-- Tampilkan jumlah nominasi dari masing masing produser
SELECT *
FROM film;
SELECT *
FROM produser;
SELECT p.nm_produser AS "Produser",
    SUM(f.nominasi) AS "Jumlah Nominasi"
FROM film f
    JOIN produser p ON p.kd_produser = f.produser
GROUP BY p.nm_produser
ORDER BY "Jumlah Nominasi" DESC;
-- tampilkan jumlah pendapatan produser marvel secara keseluruhan
SELECT p.nm_produser AS "Produser",
    SUM(f.pendapatan) AS "Jumlah Pendapatan"
FROM film f
    JOIN produser p ON p.kd_produser = f.produser
WHERE p.nm_produser = 'MARVEL'
GROUP BY p.nm_produser;
-- tampilkan jumlah pendapatan produser yg skalanya tidak international
WITH p AS (
    SELECT *
    FROM produser
    WHERE international = 'TIDAK'
)
SELECT p.nm_produser AS "Produser",
    SUM(f.pendapatan)
FROM film f
    RIGHT JOIN p ON p.kd_produser = f.produser
GROUP BY p.nm_produser;
-- tampilkan produser yg tidak punya film
SELECT p.nm_produser
FROM produser p
    LEFT JOIN film f ON p.kd_produser = f.produser
WHERE f.produser IS NULL;

-- tampilkan produser film yg memilik artis termahal
WITH f AS (
    SELECT a.nm_artis,
        p.nm_produser,
        MAX(a.bayaran)
    FROM film f
        JOIN artis a ON a.kd_artis = f.artis
        JOIN produser p ON f.produser = p.kd_produser
    GROUP BY a.nm_artis,
        p.nm_produser,
        a.bayaran
    ORDER BY a.bayaran DESC
), f_max AS(
    SELECT MAX(max)
    FROM f
)

SELECT *
FROM f WHERE f.max = (SELECT*FROM f_max);

-- tampilkan produser yg memiliki artis paling banyak

WITH f AS(
    SELECT p.nm_produser, COUNT(a.nm_artis) AS "Jumlah"
    FROM film f
        JOIN artis a ON a.kd_artis = f.artis
        JOIN produser p ON f.produser = p.kd_produser
        GROUP BY nm_produser
), f_max AS (
    SELECT MAX("Jumlah") FROM f
)

SELECT * FROM f WHERE f."Jumlah" = (SELECT * FROM f_max);

-- tampilkan produser yg memiliki artis paling banyak\

WITH f AS(
    SELECT p.nm_produser, COUNT(a.nm_artis) AS "Jumlah"
    FROM film f
        JOIN artis a ON a.kd_artis = f.artis
        JOIN produser p ON f.produser = p.kd_produser
        GROUP BY nm_produser
), f_min AS (
    SELECT MIN("Jumlah") FROM f
)

SELECT * FROM f WHERE f."Jumlah" = (SELECT * FROM f_min);