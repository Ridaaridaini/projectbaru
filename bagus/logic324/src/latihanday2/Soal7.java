package latihanday2;

import java.util.Scanner;

public class Soal7 {

    public static void main(String[] args) {

        int dendaBukuPelajaran = 2000;
        int dendaBukuNovel = 5000;
        int dendaBukuSkripsi = 10000;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku pelajaran yang dipinjam: ");
        int jumlahBukuPelajaran = scanner.nextInt();
        System.out.print("Masukkan jumlah buku novel yang dipinjam: ");
        int jumlahBukuNovel = scanner.nextInt();
        System.out.print("Masukkan jumlah buku skripsi yang dipinjam: ");
        int jumlahBukuSkripsi = scanner.nextInt();
        System.out.print("Masukkan lama peminjaman (dalam hari): ");
        int lamaPeminjaman = scanner.nextInt();

        if (lamaPeminjaman == 10 || lamaPeminjaman <=10){
            System.out.println("tidak terkena denda");
        } else if (lamaPeminjaman >= 10) {
            int totalDendaBukuPelajaran = (lamaPeminjaman - 10) * dendaBukuPelajaran * jumlahBukuPelajaran;
            int totalDendaBukuNovel = (lamaPeminjaman - 10) * dendaBukuNovel * jumlahBukuNovel;
            int totalDendaBukuSkripsi =(lamaPeminjaman - 10) * dendaBukuSkripsi * jumlahBukuSkripsi;
            int totalDenda = totalDendaBukuPelajaran + totalDendaBukuNovel + totalDendaBukuSkripsi;
            System.out.println("Total biaya denda: " + totalDenda + " rupiah");
        }


    }
}



