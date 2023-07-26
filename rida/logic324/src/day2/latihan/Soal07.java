package day2.latihan;

import java.util.Scanner;

public class Soal07 {
    /*Soal 07
Perpustakaan Rizal meminjamkan beberapa jenis buku yaitu buku pelajaran, buku novel dan buku skripsi.
biaya denda untuk tiap jenis buku adalah sebagai berikut
buku pelajaran 2.000 per hari
buku novel 5.000 per hari
buku skripsi 10.000 per hari
semua peminjaman jenis buku gratis selama peminjaman tidak lebih dari 10 hari.
Buatlah pemprograman untuk menghitung biaya denda dengan inputan
jumlah pinjam buku pelajaran, jumlah pinjam buku novel, jumlah pinjam buku skripsi, lama pinjam (dalam hari).*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil;
        System.out.print("Masukkan jumlah buku pelajaran= ");
        Integer x= input.nextInt();
        System.out.print("Masukkan jumlah buku novel= ");
        Integer y= input.nextInt();
        System.out.print("Masukkan jumlah buku skripsi= ");
        Integer z= input.nextInt();
        System.out.print("Masukkan jumlah hari peminjaman= ");
        Integer hari= input.nextInt();
        if (hari>10){
            hari = hari-10;
            x= x* hari* 2000;
            y= y* hari* 5000;
            z= z* hari* 10000;
            hasil = x+y+z;
            System.out.println("Total denda RP" +hasil);
        }



    }
}
