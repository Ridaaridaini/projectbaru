package latihanFT;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang bilangan: ");
        int panjang = scanner.nextInt();
        int[] deretKel3 = new int[panjang];
        int[] deretKel4 = new int[panjang];

        int bil1 = 0;
        int bil2 = 0;

        for (int i = 0; i < panjang; i++) {
            deretKel3[i] = bil1;
            deretKel4[i] = bil2;

            bil1 += 3 - 1;
            bil2 += 4 / 2;
        }

        System.out.print("Deret Bilangan kelipatan 3 - 1: ");
        for (int i = 0; i < deretKel3.length; i++) {
            System.out.print(deretKel3[i] + ", ");
        }

        System.out.println();

        System.out.print("Deret Bilangan kelipatan 4 / 2: ");
        for (int i = 0; i < deretKel3.length; i++) {
            System.out.print(deretKel3[i] + ", ");
        }

        System.out.println();
        for (int i = 0; i < deretKel4.length; i++) {
            if (i % 2 == 0) {
                System.out.print(deretKel3[i] + " + " + deretKel4[i] + "; ");
            } else {
                System.out.print(deretKel3[i] + " + " + deretKel4[i] + "; ");
            }
        }

        System.out.println();
        for (int i = 0; i < deretKel4.length; i++) {
            if (i % 2 == 0) {
                System.out.print(deretKel3[i] + deretKel4[i] + ", ");
            } else {
                System.out.print(deretKel3[i] + deretKel4[i] + ", ");
            }
        }
    }
}
