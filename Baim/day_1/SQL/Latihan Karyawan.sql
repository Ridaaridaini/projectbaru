SELECT first_name,
    last_name,
    concat(first_name, ' ', last_name)
FROM biodata;

--fungsi date
SELECT to_date('10-08-2023', 'DD-MM-YYYY'),
    date_part('year', to_date('10-08-2023', 'DD-MM-YYYY')),
    EXTRACT(
        YEAR
        FROM to_date('10-08-2023', 'DD-MM-YYYY')
    );

SELECT to_date(dob, 'YYYY-MM-DD') AS "DATE",
    to_char(to_date(dob, 'YYYY-MM-DD'), 'YYYY-MM-DD')
FROM biodata;

-- Fungsi Age() - untuk menghitung selisih dari 2 date
SELECT '27-05-2000',
age(now(), to_date('27-05-2000', 'dd-mm-yyyy')),
date_part('year', age(now(), to_date('27-05-2000', 'dd-mm-yyyy'))) || ' Tahun'

-- Fungsi case when

SELECT pob,
    CASE
        WHEN pob = 'Jakarta' THEN 'Jakarta'
        WHEN pob = 'Bandung' THEN 'Jawa Barat'
        ELSE 'Luar Jawa'
    END AS "Provinsi"
FROM biodata;

