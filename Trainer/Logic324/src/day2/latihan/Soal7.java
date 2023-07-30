package day2.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        int dendaBukuPelajaran = 2000;
        int dendaBukuNovel = 5000;
        int dendaBukuSkripsi = 10000;
        int lamaPeminjaman;

        Scanner x = new Scanner(System.in);

        System.out.print("jumlah buku pelajaran =");
        int bukuPelajaran = x.nextInt(); //2
        System.out.print("jumlah pinjaman buku novel =");
        int bukuNovel = x.nextInt(); //1
        System.out.print("jumlah pinjam buku skripsi =");
        int bukuSkripsi = x.nextInt(); //2
        System.out.print("lama pinjam = ");
        lamaPeminjaman = x.nextInt(); //12

        if( lamaPeminjaman <= 10 && lamaPeminjaman >= 0){ //false & true = false
            System.out.println("tidak terkena denda");
        }else if( lamaPeminjaman > 10){ //12 = true
            int lamaHariDenda = lamaPeminjaman - 10 ; //2
            int totalDendaBukuPelajran = lamaHariDenda  * bukuPelajaran * dendaBukuPelajaran ; // 2 * 2 * 2000 = 8000
            int totalDendaBukuNovel = lamaHariDenda * bukuNovel * dendaBukuNovel;// 2 * 1 * 5000 = 10000
            int totalDendaBukuSkripsi = lamaHariDenda * bukuSkripsi * dendaBukuSkripsi; // 2 * 2 * 10000 = 40000
            int totalDenda = totalDendaBukuPelajran + totalDendaBukuNovel + totalDendaBukuSkripsi; //8000 + 10000 + 40000
            System.out.println(" total denda = "+ totalDenda); // 58.000
        }else{
            System.out.println("error");
        }

    }
    }

