package latihanFT;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diketPekerja = 5;
        double diketHari = 3;
        int diketJam = 8;
        double diketTotal = diketPekerja * diketHari * diketJam;
        int hari = 0;

        System.out.print("Masukkan jumlah pekerja: ");
        double pekerja = (diketTotal/scanner.nextInt())/diketJam;

        System.out.println("Hari yang dibutuhkan adalah: " + pekerja + " Hari");



    }
}
