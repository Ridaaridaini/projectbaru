-- menggabungan dua kolom pada table
-- bisa menggunakan fungsi concat(table a, table b) atau tanda '||'

select first_name as "First Name", last_name as "Last Name", concat(first_name, ' ', last_name) as "Full Name"
	from biodata;
select first_name || ' ' || last_name as "Full Name" from biodata;

--DATE

-- fungsi now() -> untuk mengambil waktu realtime
select now();

-- fungsi date_part() -> mengambil bagian dari waktu
select date_part('year', now()), date_part('month', now()), date_part('hour', now());

-- fungsi to_date() --> konversi dari string ke date

select to_date('22-10-1997', 'DD-MM-YYYY');

select date_part('year', to_date('22-10-1997', 'DD-MM-YYYY'));
select extract(YEAR from to_date('22-10-1997', 'DD-MM-YYYY'));

--latihan
-- tampilkan dob (text), dob (date), tahun lahir seluruh biodata
select * from biodata;
select 
	dob as "TL String",
	to_date(dob, 'YYYY-MM-DD') as "TL date",
	date_part('year', to_date(dob, 'YYYY-MM-DD')) as "Tahun Date",
	to_char(now(), 'DD-MM-YYYY')
	from biodata;
	
-- fungsi to_char --> mengubah format date ke format string

-- fungsi age() --> untuk menghitung selisih dari 2 date

select 
	'22-10-1997',
	to_date('22-10-1997', 'dd-mm-yyyy'),
	age(now(), to_date('16-08-1998', 'dd-mm-yyyy')),
	date_part('year', age(now(), to_date('16-08-1998', 'dd-mm-yyyy')))
	
-- case when end --> kondisi percabangandi sql

select pob as "Kota",
	case
		when pob ilike 'jakarta' then 'Jakardah'
		when pob ilike 'bali' then 'Bali uyee'
		else 'Kota lain'
	end as "Kata Ganti"
from biodata

-- latihan

-- 1. tampilkan fullname, jabatan, usia, dan jumlah anak dari masing2 karyawan
 select 
 	concat(first_name, ' ',last_name) as full_name,
	p.name as "Jabatan",
	date_part('year', age(now(), to_date(dob, 'yyyy-mm-dd'))) || ' tahun'  as usia,
	sum(CASE
			WHEN f.status ilike 'anak' THEN 1
			else 0
		END) as "Anak"
	from biodata b
		inner join employee e
			on e.biodata_id = b.id
		inner join employee_position ep
			on e.id = ep.employee_id
		inner join position p
			on ep.position_id = p.id
		left join family f
			on b.id = f.biodata_id
	group by full_name, p.name, usia
	order by full_name desc;
	
-- 2. hitung berapa hari cuti yang sudah di ambil masing2 karyawan
	select 
		concat(b.first_name, ' ', b.last_name) as fullname,
		sum(coalesce(date_part('day', age(lr.end_date, lr.start_date)), 0)) || ' hari' as cuti
		from biodata b
			inner join employee e
				on b.id = e.biodata_id
			left join leave_request lr
				on e.id = lr.employee_id
			group by fullname;

-- 3. tampilkan fullname dan jabatan 3 karyawan paling tua
	select
		b.first_name || ' ' || b.last_name as fullname,
		p.name as position,
		date_part('year', age(now(), to_date(b.dob, 'yyyy-mm-dd'))) as age
		from biodata b
		inner join employee e
			on b.id = e.biodata_id
		inner join employee_position ep
			on e.id = ep.employee_id
		inner join position p
			on p.id = ep.position_id
		order by age DESC limit 3;

-- 4. tampilkan nama2 pelamar yang tidak diterima karyawan
	select
		concat(b.first_name, ' ', b.last_name) as "Name"
		from biodata b
		left join employee e
			on b.id = e.biodata_id
		where e.nip is null;
		
-- 5. hitung berapa rata2 gaji karyawan dengan level staff
	select
		round(avg(e.salary), 2) as "Rata2 Gaji Staff"
		from biodata b
			inner join employee e
				on b.id = e.biodata_id
			inner join employee_position ep
				on e.id = ep.employee_id
			inner join position p
				on ep.position_id = p.id
		where p.name ilike 'staff';
