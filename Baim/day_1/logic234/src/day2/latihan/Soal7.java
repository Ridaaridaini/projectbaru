package day2.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan masukkan jumlah buku pelajaran: ");
        int pelajaran = scanner.nextInt();

        System.out.print("Silahkan masukkan jumlah buku skripsi: ");
        int skripsi = scanner.nextInt();

        System.out.print("Silahkan masukkan jumlah buku novel: ");
        int novel = scanner.nextInt();

        System.out.print("Silahkan masukkan jumlah hari peminjaman: ");
        int hari = scanner.nextInt();

        scanner.close();

        if(hari > 10){
            int telatHari = hari - 10;
            int dendaPelajaran = pelajaran * telatHari * 2000;
            int dendaSkripsi =skripsi * telatHari * 10000;
            int dendaNovel = novel * telatHari * 5000;

            int jumlahDenda = dendaPelajaran + dendaNovel + dendaSkripsi;

            System.out.println("Jumlah denda yang harus dibayarkan adalah: " + jumlahDenda);

        }
    }
}
