package day2.Latihan2;

import javax.sound.midi.Soundbank;
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
        int pelajaran= scan.nextInt();
        System.out.println("jumlah buku pelajaran: ");
        int jumlahBp= scan.nextInt();

        System.out.print("lama pinjam buku novel: ");
        int novel = scan.nextInt();
        System.out.println("jumlah buku novel: ");
        int jumlahN = scan.nextInt();

        System.out.print("lama pinjam buku skripsi: ");
        int skripsi = scan.nextInt();
        System.out.println("jumlah pijam buku skripsi");
        int jumlahS = scan.nextInt();


        scan.close();
        if(pelajaran<10 && novel<10 && skripsi<10){
            System.out.println("Gratis");
        }else {
        } if (pelajaran>10 && novel>10 && skripsi>10) {
            int bayarDendaTotal = (((pelajaran - 10) * 2000) * jumlahBp) + (((novel - 10) * 5000)*jumlahN) + (((skripsi - 10) * 10000)* jumlahS);
            System.out.println("bayar denda " + bayarDendaTotal);
        } else if (pelajaran>10 && novel>10) {
            int bayarDendaPelajaranNovel = (((pelajaran-10)*2000)*jumlahBp) +((novel-10)*5000)*jumlahN;
            System.out.println(bayarDendaPelajaranNovel);
        }else if(pelajaran>10 && skripsi>10){
            int bayarDendaPelajaranNovel = (((pelajaran - 10) * 2000) * jumlahN) + ((skripsi - 10) * 10000)* jumlahS;
            System.out.println("bayar denda " + bayarDendaPelajaranNovel);
        } else if (novel>10 && skripsi>10) {
            int bayarDendaNovelSkripsi = (((novel - 10) * 5000)*jumlahN) + ((skripsi - 10) * 10000)* jumlahS;
            System.out.println("bayar denda " + bayarDendaNovelSkripsi);
        } else if (pelajaran>10) {
            int bayarDendaBukuPelajaran = (((pelajaran - 10) * 2000) * jumlahN);
            System.out.println("bayar denda buku " + bayarDendaBukuPelajaran);
        } else if (novel>10) {
            int bayarDendaBukuNovel = (((novel - 10) * 5000)*jumlahN);
            System.out.println("bayar denda buku " + bayarDendaBukuNovel);
        } else if (skripsi>10) {
            int bayarDendaBukuSkripsi = (((skripsi - 10) * 10000)* jumlahS);
            System.out.println("bayar denda buku " + bayarDendaBukuSkripsi);
        }

    }
}
