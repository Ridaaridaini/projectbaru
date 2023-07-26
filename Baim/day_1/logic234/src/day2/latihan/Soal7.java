package day2.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan masukkan jenis buku yang kamu pinjam (pelajaran, skripsi, novel): ");
        String jenis = scanner.nextLine();

        System.out.print("Masukkan jumlah hari peminjaman: ");
        int hari = scanner.nextInt();

        scanner.close();

        if (jenis.equalsIgnoreCase("pelajaran") && hari > 10) {
            int telatHari = hari - 10;
            int dendaPelajaran = telatHari * 2000;
            System.out.println("Anda terlambat mengembalikan buku selama " + hari
                    + " dan denda yang harus dibayar adalah sebesar Rp." + dendaPelajaran);
        } else if (jenis.equalsIgnoreCase("novel") && hari > 10) {
            int telatHari = hari - 10;
            int dendaNovel = telatHari * 5000;
            System.out.println("Anda terlambat mengembalikan buku selama " + hari
                    + " dan denda yang harus dibayar adalah sebesar Rp." + dendaNovel);
        } else if (jenis.equalsIgnoreCase("skripsi") && hari > 10) {
            int telatHari = hari - 10;
            int dendaSkripsi = telatHari * 10000;
            System.out.println("Anda terlambat mengembalikan buku selama " + hari
                    + " dan denda yang harus dibayar adalah sebesar Rp." + dendaSkripsi);
        }
    }
}
