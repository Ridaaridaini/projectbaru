# Day 2

### Conditional

#### Switch Statement

Switch statement digunakan untuk memeriksa nilai dari sebuah ekspresi dan menjalankan kode berdasarkan nilai ekspresi tersebut. Berikut adalah contoh penggunaan switch statement dalam kode yang Anda berikan:

```java
int a = 3;

switch (a - 2) {
    case 1:
        System.out.println("a = 1");
        break;
    case 2:
        System.out.println("a = 2");
        break;
    case 3:
        System.out.println("a = 3");
        break;
    default:
        System.out.println("a tidak terdaftar");
        break;
}

```

Dalam contoh ini, nilai ekspresi yang dievaluasi adalah `a - 2`, yaitu 1 (3 - 2). Pada blok switch, kita memiliki beberapa case yang mewakili kemungkinan nilai dari ekspresi tersebut.

- Case 1: Jika ekspresi sama dengan 1, maka akan dicetak "a = 1".
- Case 2: Jika ekspresi sama dengan 2, maka akan dicetak "a = 2".
- Case 3: Jika ekspresi sama dengan 3, maka akan dicetak "a = 3".
- Default: Jika ekspresi tidak cocok dengan nilai pada semua case di atas, maka akan dicetak "a tidak terdaftar".

Setiap case diakhiri dengan pernyataan `break`, yang digunakan untuk keluar dari blok switch setelah satu case terpenuhi. Jika `break` tidak digunakan, maka eksekusi akan dilanjutkan ke case berikutnya tanpa memeriksa ekspresinya.

#### If - Else
Struktur pengkondisian if-else digunakan untuk memeriksa suatu kondisi dan menjalankan blok kode tertentu berdasarkan hasil evaluasi kondisi tersebut. Berikut adalah contoh penggunaan struktur if-else dalam kode yang Anda berikan:

```java
int a = 7;

if (a <= 5) {
    System.out.println("a bilangan kecil");
} else if (a >= 10) {
    System.out.println("a bilangan besar");
} else if (a == 7) {
    System.out.println("a bilangan beruntung");
} else {
    System.out.println("a bilangan biasa");
}

```
Dalam contoh ini, kita memeriksa nilai dari variabel `a` menggunakan beberapa kondisi:

- Jika `a` kurang dari atau sama dengan 5, maka blok pertama akan dijalankan dan akan mencetak "a bilangan kecil".
- Jika `a` lebih dari atau sama dengan 10, maka blok kedua akan dijalankan dan akan mencetak "a bilangan besar".
- Jika `a` sama dengan 7, maka blok ketiga akan dijalankan dan akan mencetak "a bilangan beruntung".
- Jika tidak ada kondisi di atas yang terpenuhi, maka blok terakhir (`else`) akan dijalankan dan akan mencetak "a bilangan biasa".

Dalam kondisi-kondisi tersebut, hanya satu blok yang akan dieksekusi, yaitu blok yang pertama kali memenuhi kondisi. Setelah salah satu blok dieksekusi, program akan keluar dari struktur if-else dan melanjutkan ke pernyataan setelah struktur if-else.

Dengan menggunakan struktur pengkondisian if-else, Anda dapat membuat program berperilaku berbeda berdasarkan kondisi yang diberikan.

#### Perbandingan String

```java
String string1 = "Riswan";
String string2 = "Riswan";
String string3 = "riswan";

boolean cek1 = string1.equals(string2); // true
boolean cek2 = string1.equals(string3); // false

```

Pada contoh ini, `string1` dan `string2` memiliki nilai yang sama, sehingga `cek1` menghasilkan `true`. Namun, `string1` dan `string3` memiliki perbedaan kapitalisasi, sehingga `cek2` menghasilkan `false`.

#### Membandingkan String tanpa Melihat Huruf Kapital
```java
boolean cek3 = string1.equalsIgnoreCase(string3); // true

```

Dengan menggunakan `equalsIgnoreCase()`, kita dapat membandingkan string tanpa memperhatikan huruf kapital atau tidak. Dalam contoh ini, meskipun ada perbedaan huruf kapital, `cek3` tetap menghasilkan `true`.

#### Negasi Perbandingan String
```java
boolean cek4 = !string1.equals(string2); // false

```

Dalam contoh ini, kita menggunakan negasi (`!`) untuk membalikkan hasil perbandingan, namun karena `string1` dan `string2` sama, hasilnya tetap `false`.

#### Formating Angka

```java
long uang = 1_000_000_000;

DecimalFormat df = new DecimalFormat("#,###.##");
String cetak = df.format(uang);

System.out.println(cetak);

```

Dalam kode ini, kita menggunakan `DecimalFormat` untuk memformat angka `uang` agar dicetak dalam format yang lebih mudah dibaca, seperti pemisah ribuan menggunakan koma.

#### Memaksa program berhenti

```java
System.exit(0);
System.out.println("ini tidak muncul");

```

Fungsi `System.exit(0)` digunakan untuk menghentikan program secara paksa. Setelah baris ini dieksekusi, program akan langsung berhenti dan baris kode selanjutnya (seperti `System.out.println("ini tidak muncul");`) tidak akan dijalankan.