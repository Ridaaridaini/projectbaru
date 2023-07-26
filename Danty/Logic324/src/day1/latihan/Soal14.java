package day1.latihan;

import java.util.Scanner;

public class Soal14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("banyak uang pecahan sepuluh ribu = ");
        int sepuluh = input.nextInt();

        System.out.print("banyak uang pecahan lima ribu = ");
        int lima = input.nextInt();

        System.out.print("banyak uang pecahan dua puluh ribu= ");
        int duapuluh = input.nextInt();

        int jumlahPecahanSepuluhRibu = sepuluh*10000;
        int jumlahPecahanLimaRibu = lima*5000;
        int jumlahPecahanDiuapuluhRibu = duapuluh*20000;

        int totalUang = jumlahPecahanSepuluhRibu + jumlahPecahanLimaRibu + jumlahPecahanDiuapuluhRibu;

        System.out.println("total uang mbah jambrong = " + totalUang);
    }

    //inget penentuan data harus disesuaikan dengan soal
}
