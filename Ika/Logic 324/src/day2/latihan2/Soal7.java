package day2.latihan2;

import java.util.Scanner;

public class Soal7 {
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
        System.out.print("lama pinjam buku pelajaran: ");
        int pelajaran = scan.nextInt();
        System.out.print("jumlah buku pelajaran: ");
        int jumlahBp = scan.nextInt();
        Math.abs(jumlahBp);

        System.out.print("lama pinjam buku novel: ");
        int novel = scan.nextInt();
        System.out.print("jumlah buku novel: ");
        int jumlahN = scan.nextInt();

        System.out.print("lama pinjam buku skripsi: ");
        int skripsi = scan.nextInt();
        System.out.print("jumlah pijam buku skripsi: ");
        int jumlahS = scan.nextInt();
        int dendaBukuPelajaran = 2000;
        int dendaBukuNovel = 5000;
        int dendaBukuSkripsi = 10000;

        int bayarDendaPelajaran = (pelajaran - 10) * jumlahBp * dendaBukuPelajaran;
        int bayarDendaNovel = (novel - 10) * jumlahN * dendaBukuNovel;
        int bayarDendaSkripsi = (skripsi - 10) * jumlahS * dendaBukuSkripsi;
        int bayarDendatotal = bayarDendaPelajaran + bayarDendaNovel + bayarDendaSkripsi;

        scan.close();
        if (pelajaran < 10 && novel < 10 && skripsi < 10) {
            System.out.println("Gratis");
        } else {

        }
        if (pelajaran > 10 && novel > 10 && skripsi > 10) {
            System.out.println("bayar denda " + bayarDendatotal);

        } else if (pelajaran > 10 && novel > 10) {
            int bayarDendaPelajaranNovel = bayarDendaPelajaran + bayarDendaNovel;
            System.out.println(bayarDendaPelajaranNovel);

        } else if (pelajaran > 10 && skripsi > 10) {
            int bayarDendaPelajaranNovel = bayarDendaPelajaran + bayarDendaSkripsi;
            System.out.println("bayar denda " + bayarDendaPelajaranNovel);

        } else if (novel > 10 && skripsi > 10) {
            int bayarDendaNovelSkripsi = bayarDendaNovel + bayarDendaSkripsi;
            System.out.println("bayar denda " + bayarDendaNovelSkripsi);

        } else if (pelajaran > 10) {
            System.out.println("bayar denda buku " + bayarDendaPelajaran);

        } else if (novel > 10) {
            System.out.println("bayar denda buku " + bayarDendaNovel);

        } else if (skripsi > 10) {
            System.out.println("bayar denda buku " + bayarDendaSkripsi);
        }

    }
}
