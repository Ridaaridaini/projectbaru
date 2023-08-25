# Day 3

### Perulangan

#### While Loop

```java
int i = 0; // i = 0
while (i < 0 /* kondisi apakah looping akan dilanjutkan */) {
    // Body
    System.out.print(i);
    i++;
}
```

Dalam contoh ini, variabel `i` diinisialisasi dengan nilai 0. Kemudian, while loop akan dijalankan selama nilai `i` kurang dari 0. Namun, karena kondisi tersebut tidak terpenuhi pada awalnya (karena `i` adalah 0), blok kode di dalam loop tidak akan dijalankan Setelahnya, variabel `i` diinisialisasi kembali dengan nilai 0, dan selanjutnya akan ditampilkan baris kosong.

#### Do-While Loop
```java
i = 0; // tidak error karena masih satu scope
// i = 0
do {
    System.out.println(i);
    i++;
} while (i < 0);

```

Do-while loop hampir sama dengan while loop, hanya saja blok kode di dalam do-while loop akan dijalankan minimal satu kali, bahkan jika kondisi pada awalnya tidak terpenuhi.

Pada contoh di atas, do-while loop akan menjalankan blok kode yang mencetak nilai `i` sebanyak satu kali, meskipun kondisi `i < 0` tidak terpenuhi.

#### For Loop

```java
System.out.println("Contoh 1");
for (int i = 0; i < 3; i++) { // i = 0 1 2 3
    System.out.print(i);
}

```

Dalam contoh ini, perulangan `for` akan menjalankan blok kode sebanyak empat kali. Variabel `i` diinisialisasi dengan nilai 0 dan akan terus ditambahkan 1 pada setiap iterasi. Perulangan berlangsung selama nilai `i` kurang dari 3. Oleh karena itu, hasil outputnya adalah 012.

### Penggunaan `break` dan `continue` dalam Perulangan for

```java
int a = 1; // a = 1 2
for (; true; a++) {
    if (a % 2 == 0) {
        continue;
    }
    if (a == 11) {
        break;
    }
    System.out.print(a + " ");
}

```
Dalam contoh ini, kita menggunakan perulangan `for` dengan kondisi awal `true` sehingga perulangan akan berjalan tanpa henti, kecuali jika ada statement `break`. Di dalam loop, pertama kita memeriksa apakah `a` merupakan bilangan genap dengan `if (a % 2 == 0)`, jika ya, maka akan dijalankan statement continue yang akan melanjutkan iterasi selanjutnya tanpa mengeksekusi kode di bawahnya. Selanjutnya, kita memeriksa apakah `a` sama dengan 11 dengan `if (a == 11)`, jika ya, maka akan dijalankan statement break yang menghentikan perulangan. Jika kedua kondisi tersebut tidak terpenuhi, maka angka `a` akan dicetak.

Hasil output yang dihasilkan adalah urutan angka ganjil dari 1 hingga 11, kecuali angka 2 dan 11.

Dengan menggunakan `break` dan `continue`, Anda dapat mengendalikan aliran eksekusi dalam perulangan sesuai dengan kondisi yang diberikan.