package day2.Latihan2;

import java.util.Scanner;

public class Soal7A {
    public static void main(String[] args) {
        //Perpustakaan Rizal meminjamkan beberapa jenis buku yaitu buku pelajaran, buku novel dan buku skripsi.
        //biaya denda untuk tiap jenis buku adalah sebagai berikut
        //buku pelajaran 2.000 per hari
        //buku novel 5.000 per hari
        //buku skripsi 10.000 per hari
        //semua peminjaman jenis buku gratis selama peminjaman tidak lebih dari 10 hari.
        //Buatlah pemprograman untuk menghitung biaya denda dengan inputan
        //jumlah pinjam buku pelajaran, jumlah pinjam buku novel, jumlah pinjam buku skripsi, lama pinjam (dalam hari).

        Scanner scan = new Scanner(System.in);
        System.out.print("jumlah pinjam buku pelajaran: ");
        int pelajaran = scan.nextInt();

        System.out.print("jumlah pinjam buku Novel: ");
        int novel = scan.nextInt();

        System.out.print("jumlah pinjam buku Skripsi: ");
        int skripsi = scan.nextInt();

        System.out.print("jumlah hari pinjam: ");
        int hari = scan.nextInt();

        scan.close();

        if(hari>10){
            int pelajaran1= ((hari-10)*2000)*pelajaran;
            int novel1= ((hari-10)*5000)*novel;
            int skripsi1 = ((hari-10)*10000)*skripsi;
            int jumlah = pelajaran1+novel1+skripsi1;
            System.out.println("jumlah tagihan Rp" + jumlah);
        } else{
            System.out.println("Gratis");
        }

    }
}
