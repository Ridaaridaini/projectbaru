# Day 5

### Array

#### Array 1D
##### Deklarasi Array
```java
int a; // Deklarasi variabel biasa
int[] arrA = new int[5]; // Deklarasi array dengan panjang 5, semua elemen akan diinisialisasi dengan nilai default
String[] arrStrA = new String[5]; // Deklarasi array String dengan panjang 5, semua elemen akan diinisialisasi dengan null

```

Dalam contoh ini, kita mendeklarasikan beberapa array dengan berbagai tipe data dan panjang. Variabel `arrA` dan `arrStrA` adalah contoh array kosong, di mana elemen-elemennya memiliki nilai default (0 untuk tipe data `int` dan `null` untuk tipe data `String`).

##### Inisiasi Array
```java
int[] arrB = {0, 2, 3, 4, 5}; // Inisialisasi array dengan nilai-nilai tertentu
String[] arrStrB = {"A", "A", "S"}; // Inisialisasi array String dengan nilai-nilai tertentu
```

Dalam contoh ini, kita mendeklarasikan dan menginisialisasi array `arrB` dan `arrStrB` dengan nilai-nilai yang telah ditentukan.

##### Mengisi Array
````java
System.out.println(arrB[1]); // Mengambil nilai elemen ke-1 dari array arrB (nilai: 2)
int b = arrB[3]; // Mengambil nilai elemen ke-3 dari array arrB dan menyimpannya dalam variabel b (nilai: 4)
System.out.println(b);```
````

Kita dapat menggunakan indeks untuk mengambil nilai dari elemen-elemen dalam array. Dalam contoh ini, kita mengambil nilai elemen ke-1 dari array `arrB`, yang merupakan nilai 2, dan menyimpan nilai elemen ke-3 dari array `arrB` dalam variabel `b`.

```java
System.out.println(arrB[0]); // Sebelum diganti (nilai: 0)
arrB[0] = 1; // Mengganti nilai elemen ke-0 dari array arrB menjadi 1
System.out.println(arrB[0]); // Sesudah diganti (nilai: 1)
```

Kita juga dapat mengubah atau mengisi nilai dalam elemen-elemen array dengan menggunakan indeks. Dalam contoh ini, kita mengganti nilai elemen ke-0 dari array `arrB` dari 0 menjadi 1.

```java
System.out.println(arrB.length); // Menampilkan panjang array arrB (jumlah elemen dalam array)

```

Kita dapat menggunakan properti length untuk mengetahui panjang atau jumlah elemen dalam array. Dalam contoh ini, kita mencetak panjang array `arrB`.

#### Array 2D
