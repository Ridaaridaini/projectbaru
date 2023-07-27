package day3.latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = scanner.nextInt();

        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= jumlahBaris; j++) {
                System.out.print(" @ ");
            }
            System.out.println();
        }
    }
}
