# Day 1

### Pengenalan Java

#### Deklarasi tipe data variabel

cara mendeklarasikan suatu variabel dengan tipe data tertentu

```java
byte bilByte;
short bilShort;
int bilInt;
long bilLong;
```

cara mendeklarasikan suatu variabel dengan nilai tertentu /assignment variabel

```java
bilByte = 1;
bilShort = 1 + 3 + 6;
bilInt = 1;
bilLong = 1000000000000000l;
```

menggunakan tipe data desimal, yaitu `double` dan `float`

```java
float bilFloat = 1.5f; //f adalah float
double bilDouble = 2.5;
```

Tipe data boolean adalah suatu tipe data yang hanya bernilai `true` dan `false`

```java
boolean boTrue = true;
boolean boFalse = false;
```

untuk tipe data char, jika kita mengassign dengan nilai `int` maka akan diubah kedalam bentuk `ascii`

```java
char mChar = 'A';
char mChar2 = 65; //Menganut tabel ASCII
System.out.println(mChar);
```

#### Random Generator

Random generator adalah suatu kelas yang berfungsi untuk mengacak bilangan tertentu. pertama perlu dilakukan instansiasi.

```java
Random randomGenerator = new Random();
```

lalu objek yang sudah dideklarasikan makan dapat digunakan untuk menghasilkan suatu nilai integer secara acak sebagai berikut

```java
int intA = randomGenerator.nextInt();
System.out.println(intA);
```

bagaimana cara menggenerate suatu bilangan dengan batas nilai tertentu?

```java
//akan menggenerate nilai acak dari 0-10
int intB = randomGenerator.nextInt(10);
System.out.println(intB);
```

bagaimana jika ingin menggenerate nilai dari 1-100? begini caranya:

```java
int intC = randomGenerator.nextInt(100) + 1;
System.out.println(intC);
```

### Operasi Matematika pada bilangan desimal dan bilangan bulat

#### Bilangan Bulat (+ - \* / %)

```java
int a = 13 + 2 - 5 * 9 / 2;
System.out.println(a);
```

Dalam kode ini, kita melakukan operasi matematika pada bilangan bulat. Operasi yang dilakukan adalah penjumlahan (+), pengurangan (-), perkalian (\*), dan pembagian (/). Hasil dari ekspresi ini akan dihitung sesuai dengan aturan prioritas operator.

#### Operasi Sisa Pembagian (%)

```java
int hasil1 = 3 % 2; // hasilnya 1
int hasil2 = 15 % 6; // hasilnya 3
```

Operator `modulo` (%) digunakan untuk mendapatkan sisa pembagian dari suatu operasi pembagian. Pada contoh di atas, `hasil1` akan menghasilkan 1 (karena 3 dibagi 2 menghasilkan sisa 1), dan `hasil2` akan menghasilkan 3 (karena 15 dibagi 6 menghasilkan sisa 3).

#### Bilangan Desimal (+ - \* / %)

```java
double b = 1.1 + 3.2 * 1 / 3.1;
System.out.println(b);
```

Dalam kode ini, kita melakukan operasi matematika pada bilangan desimal. Operasi yang dilakukan adalah penjumlahan (+), perkalian (\*), dan pembagian (/). Hasil dari ekspresi ini akan dihitung sesuai dengan aturan prioritas operator.

#### Membulatkan Desimal

```java
System.out.printf("%.3f", b);
System.out.println();
```

Kode ini mencetak nilai desimal b dengan format yang telah dibulatkan menjadi 3 angka di belakang koma menggunakan printf.

#### Operasi Boolean (&& || !)

```java
boolean bolA = true || false; // true
boolean bolB = true && false || true; // true
boolean bolC = !(true || false && false); // false
boolean bolD = !((true || false) && false); // true
System.out.println(bolA + " " + bolB);
```

Kode ini menggunakan operasi logika boolean, yaitu `||` (or), `&&` (and), dan `!` (negasi). Variabel-variabel boolean bolA, bolB, bolC, dan bolD menunjukkan hasil dari ekspresi logika yang diberikan.

#### Operasi String

```java
System.out.println("Aku " + "karo " + "koe");
```

kode ini menggabungkan tiga string menjadi satu dengan menggunakan operator `+`.

##### Catatan Tambahan

Beberapa catatan tambahan mengenai operasi-operasi tertentu:

- Operasi int / int akan menghasilkan nilai bulat, sehingga 5 / 2 = 2.
- Untuk mendapatkan hasil desimal, salah satu operand harus bertipe double atau float, misalnya 5.0 / 2 atau 5 / 2.0.

### Operasi Matematika Lanjutan

#### Perpangkatan

```java
System.out.println((int)Math.pow(2, 8)); // 256
```

Dalam kode ini, `Math.pow(2, 8)` menghitung hasil perpangkatan 2 pangkat 8 (2^8), dan `Math.pow` mengembalikan nilai `double`. Kita menggunakan `(int)` untuk mengubah hasil menjadi integer sehingga hasilnya menjadi 256.

#### Nilai Absolute

```java
System.out.println(Math.abs(-15)); // 15
```

Fungsi `Math.abs()` digunakan untuk mendapatkan nilai absolut dari suatu bilangan. Dalam kasus ini, kita mendapatkan nilai absolut dari -15, yang hasilnya adalah 15.

#### Pembulatan

```java
System.out.println(Math.round(2.5)); // 3
System.out.println(Math.round(2.4)); // 2
```

Fungsi `Math.round()` digunakan untuk melakukan pembulatan terhadap suatu bilangan desimal ke bilangan bulat terdekat. Dalam contoh di atas, 2.5 dibulatkan menjadi 3, dan 2.4 dibulatkan menjadi 2.

#### Pembulatan ke atas

```java
System.out.println(Math.ceil(2.1)); // 3.0

```

Fungsi `Math.ceil()` digunakan untuk membulatkan suatu bilangan desimal ke atas ke bilangan bulat terdekat. Dalam contoh ini, 2.1 dibulatkan ke atas menjadi 3.0.

#### Pembulatan ke bawah

```java
System.out.println(Math.floor(2.6)); // 2.0

```

Fungsi Math.floor() digunakan untuk membulatkan suatu bilangan desimal ke bawah ke bilangan bulat terdekat. Dalam contoh ini, 2.6 dibulatkan ke bawah menjadi 2.0.

### Operasi Pembanding
#### Equals (==)
```java
System.out.println(3 == 2); // false
System.out.println(5 == 10/2); // true

```
Operator `==` digunakan untuk membandingkan apakah dua nilai memiliki nilai yang sama. Dalam contoh pertama, 3 tidak sama dengan 2, sehingga hasilnya `false`. Dalam contoh kedua, 5 sama dengan hasil dari 10 dibagi 2, yaitu 5, sehingga hasilnya `true`.

#### Not Equals (!=)
```java
System.out.println(3 != 2); // true
System.out.println(5 != 10/2); // false
```
Operator `!=` digunakan untuk membandingkan apakah dua nilai tidak sama. Dalam contoh pertama, 3 tidak sama dengan 2, sehingga hasilnya `true`. Dalam contoh kedua, 5 sama dengan hasil dari 10 dibagi 2, yaitu 5, sehingga hasilnya `false`.

#### Lebih dari (>)
```java
System.out.println(3 > 3); // false

```
Operator `>` digunakan untuk membandingkan apakah suatu nilai lebih besar dari nilai lain. Dalam contoh ini, 3 tidak lebih besar dari 3, sehingga hasilnya `false`.

#### kurang dari (<)
```java
System.out.println(5 < 3); // false

```
Operator `<` digunakan untuk membandingkan apakah suatu nilai lebih kecil dari nilai lain. Dalam contoh ini, 5 tidak lebih kecil dari 3, sehingga hasilnya `false`.

#### Lebih dari Sama dengan (>=)
```java
System.out.println(4 >= 4); // true

```
Operator `>=` digunakan untuk membandingkan apakah suatu nilai lebih besar atau sama dengan nilai lain. Dalam contoh ini, 4 sama dengan 4, sehingga hasilnya `true`.

#### Kurang dari Sama dengan (<=)
```java
System.out.println(3 <= 10/2); // true

```

Operator `<=` digunakan untuk membandingkan apakah suatu nilai lebih kecil atau sama dengan nilai lain. Dalam contoh ini, 3 lebih kecil dari atau sama dengan hasil dari 10 dibagi 2, yaitu 5, sehingga hasilnya `true`.

### Input Menggunakan Scanner
#### Instansiasi Scanner
```java
Scanner input = new Scanner(System.in);

```
Kita menginstansiasi objek `Scanner` dengan nama `input`. Objek ini digunakan untuk membaca input dari pengguna.

#### Mengambil Input Nama (String)
```java
System.out.print("Nama : ");
String nama = input.nextLine();

```
Pada bagian ini, kita meminta pengguna untuk memasukkan nama. Metode `nextLine()` digunakan untuk membaca input string dari pengguna dan menyimpannya dalam variabel `nama`.

#### Mengambil Input Umur (int)
```java
System.out.print("Umur : ");
int umur = input.nextInt();

```

Kita meminta pengguna untuk memasukkan umur. Metode `nextInt()` digunakan untuk membaca input integer dari pengguna dan menyimpannya ke dalam variabel `umur`.

#### kasus khusus
```java
input.nextLine();
```
Ketika kita menggunakan `nextInt()` untuk membaca input integer, newline character (`\n`) masih tertinggal dalam input buffer. Oleh karena itu, kita perlu memanggil `input.nextLine()` untuk membersihkan newline character tersebut sebelum membaca input berikutnya dengan `nextLine()`.

#### Menutup Scanner
```java
input.close();

```
Setelah selesai menggunakan objek `Scanner`, kita perlu menutupnya menggunakan metode `close()`.

### Casting dan Parsing
#### Casting

Casting adalah proses mengubah tipe data dari satu tipe ke tipe yang lain, terutama saat konversi tipe data numerik. Pada kode berikut, kita melakukan casting dari `double` ke `int` dan `double` ke `long`:
```java
double a = 12.5;
int b = (int) a;
long c = (long) a;
```

Pada contoh pertama, kita melakukan casting `double a` menjadi `int b`. Bilangan desimal akan dipangkas menjadi bilangan bulat, sehingga nilai b menjadi 12. Pada contoh kedua, kita melakukan casting `double a` menjadi `long c`. Bilangan desimal dipangkas dan diubah menjadi tipe `long`.

#### Parsing
Parsing adalah proses mengubah tipe data string menjadi tipe data numerik atau lainnya. Pada kode berikut, kita melakukan parsing dari string ke tipe data numerik:

```java
String strA = "120";
String strB = "100";

int intA = Integer.parseInt(strA);
int intB = Integer.parseInt(strB);

long longA = Long.parseLong(strA);

```
Pada contoh ini, kita mengubah string `strA` dan `strB` menjadi tipe data `int` menggunakan `Integer.parseInt()`. Selanjutnya, kita juga mengubah string `strA` menjadi tipe data `long` menggunakan `Long.parseLong()`.

#### Konversi Tipe Data ke String
```java
String strAB = intA + "";
String strBA = String.valueOf(intA);

```

Dalam contoh pertama, kita menggunakan operasi penambahan (`+`) dengan string kosong untuk mengubah `intA` menjadi string `strAB`. Dalam contoh kedua, kita menggunakan `String.valueOf()` untuk mengubah `intA` menjadi string `strBA`.