package day2.latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        int dendaBukuPelajaran = 2000, dendaBukuNovel = 5000, dendaBukuSkripsi = 10000;
        int jumlahPinjamPelajaran, jumlahPinjamNovel, jumlahPinjamSkripsi, lamaPinjam;
        long totalDenda;

        Scanner scanner = new Scanner(System.in);

        System.out.print("jumlah pinjam buku pelajaran: ");
        jumlahPinjamPelajaran = scanner.nextInt();

        System.out.print("jumlah pinjam buku novel: ");
        jumlahPinjamNovel = scanner.nextInt();

        System.out.print("jumlah pinjam buku skripsi: ");
        jumlahPinjamSkripsi = scanner.nextInt();

        System.out.print("lama pinjam: ");
        lamaPinjam = scanner.nextInt();

        scanner.close();

        if (lamaPinjam>10){
            int hariDenda = lamaPinjam - 10;

            dendaBukuPelajaran = hariDenda*(dendaBukuPelajaran*jumlahPinjamPelajaran);
            dendaBukuNovel = hariDenda*(dendaBukuNovel*jumlahPinjamNovel);
            dendaBukuSkripsi = hariDenda*(dendaBukuSkripsi*jumlahPinjamSkripsi);

            totalDenda = dendaBukuPelajaran + dendaBukuNovel + dendaBukuSkripsi;

            System.out.println("Denda anda " + totalDenda + " karena anda terlambat mengembalikan selama "
                    + hariDenda + " hari");

        }else{
            System.out.println("tidak ada denda");
        }

    }
}
