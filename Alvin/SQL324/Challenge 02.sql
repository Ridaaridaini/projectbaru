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
	age(now(), to_date('22-10-1997', 'dd-mm-yyyy')),
	age(now(), to_date('16-08-1998', 'dd-mm-yyyy')),
	age(to_date('16-08-1998', 'dd-mm-yyyy'), to_date('22-10-1997', 'dd-mm-yyyy')),
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

-- 6. urutkan nama2 karyawan dan statusnya, diurutkan dari yang paling tua ke yang paling muda
	select
		concat(b.first_name, ' ', b.last_name) as fullname,
		e.status,
		date_part('year', age(now(), to_date(b.dob, 'yyyy-mm-dd'))) || ' ' as age
		from biodata b
			inner join employee e
				on b.id = e.biodata_id
		order by age desc;

-- 7. tampilkan last name dengan huruf kapital, dimana last namenya diawali dengan huruf M
	select
		upper(last_name) as last_name
		from biodata
	where last_name ilike 'm%';

-- 8. tamilkan employee id, fullname, salary_lama dan salary_baru
-- dimana salary baru itu sebesar 10% lebih besar dari salary lama
-- dan ditampilkan dengan kolom alias Gaji Baru
	select
		e.id as employee_id,
		concat(b.first_name, ' ', b.last_name) as fullname,
		e.salary as salary_lama,
		round((e.salary + (e.salary*0.1))) as "Gaji Baru"
		from biodata b
			inner join employee e
				on b.id = e.biodata_id;

-- 9. tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas
-- dan total pengeluaran selama dinas tsb
	select
		concat(b.first_name, ' ', b.last_name) as fullname,
		tt.name as travel_type,
		tr.start_date as tgl_perjalanan,
		travel_fee + sum(ts.item_cost) as total_costs
		from biodata b
			inner join employee e
				on b.id = e.biodata_id
			inner join travel_request tr
				on e.id = tr.employee_id
			inner join travel_type tt
				on tr.travel_type_id = tt.id
			left join travel_settlement ts
				on tr.id = ts.travel_request_id
		group by fullname, travel_type, tgl_perjalanan, travel_fee;

-- 10. buatan query untuk menampilkan data karyawan yang belum pernah melakukan perjalanan dinas

	select 
		concat(first_name, ' ', last_name) as fullname
		from biodata b
			inner join employee e
				on b.id = e.biodata_id
			left join travel_request tr
				on e.id = tr.employee_id
			where tr.id is null;
			
-- 11. tampilkan nama lengkap karyawan, jenis cuti, alasan cuti, durasi cuti
-- dan nomor telepon yang bisa dihubungi untuk masing2 karyawan yang mengajukan cuti
	select
		concat(b.first_name, ' ', b.last_name) as fullname,
		l.type as jenis_cuti,
		lr.reason as alasan_cuti,
		date_part('day', age(lr.end_date, lr.start_date)) || ' hari' as durasi_cuti,
		cp.contact
		from employee e
			inner join biodata b
				on e.biodata_id = b.id
			inner join leave_request lr
				on e.id = lr.employee_id
			inner join leave l
				on lr.leave_id = l.id
			inner join contact_person cp
				on b.id = cp.biodata_id
		where cp.type ilike 'phone';

-- 12. tampilkan alasan cuti yang paling sering diajukan karyawan

	WITH table1 AS(
		select
		lr.reason as alasan,
		count(lr.reason) as jmlh_alsn
		from biodata b
			inner join employee e
				on b.id = e.biodata_id
			inner join leave_request lr
				on e.id = lr.employee_id
		group by alasan
	) select * from table1 where jmlh_alsn = (select max(jmlh_alsn) from table1);
		

-- 13. tampilkan last name, salary, bonus
-- dan salary_plus_bonus untuk karyawan yang namanya mengandung minimal
-- salah satu dari huruf vokal, dimana bonus itu sebesar 20% dari salary

	select 
		 b.last_name as last_name,
		 e.salary as salary,
		 round(e.salary*0.2) as bonus,
		 e.salary + round(e.salary*0.2) as salary_plus_bonus
		 from biodata b
		 	inner join employee e
				on b.id = e.biodata_id
		where last_name ilike '%a%'
			or last_name ilike '%i%'
			or last_name ilike '%u%'
			or last_name ilike '%e%'
			or last_name ilike '%o%';
				

