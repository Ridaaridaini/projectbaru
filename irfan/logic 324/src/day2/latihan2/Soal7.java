package day2.latihan2;

import day1.Input;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {

        int dendaBukuPelajaran = 2000;
        int dendaBukuNovel = 5000;
        int dendaBukuSkripsi = 10000;
        int lamaPeminjaman;

        Scanner x = new Scanner(System.in);

        System.out.print("jumlah buku pelajaran =");
        int bukuPelajaran = x.nextInt();
        System.out.print("jumlah pinjaman buku novel =");
        int bukuNovel = x.nextInt();
        System.out.print("jumlah pinjam buku skripsi =");
        int bukuSkripsi = x.nextInt();
        System.out.print("lama pinjam = ");
        lamaPeminjaman = x.nextInt();

        if( lamaPeminjaman <= 10 && lamaPeminjaman >= 0){
            System.out.println("tidak terkena denda");
        }else if( lamaPeminjaman > 10){
            int lamaHariDenda = lamaPeminjaman - 10 ;
            int totalDendaBukuPelajran = lamaHariDenda * bukuPelajaran * dendaBukuPelajaran ;
            int totalDendaBukuNovel = lamaHariDenda * bukuNovel * dendaBukuNovel;
            int totalDendaBukuSkripsi = lamaHariDenda * bukuSkripsi * dendaBukuSkripsi;
            int totalDenda = totalDendaBukuPelajran + totalDendaBukuNovel + totalDendaBukuSkripsi;
            System.out.println(" total denda = "+ totalDenda);
        }else{
            System.out.println("error");
        }

    }
}
