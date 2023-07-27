package day3;

import java.util.Scanner;

public class BilanganTangga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = scanner.nextInt();

        cetakBilanganTangga(jumlahBaris);
    }

    public static void cetakBilanganTangga(int jumlahBaris) {
//        int bilangan = 1;
        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( " * ");

            }
            System.out.println();
        }
    }
}
