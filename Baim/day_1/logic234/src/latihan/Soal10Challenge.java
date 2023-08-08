package latihan;

import java.util.Scanner;

public class Soal10Challenge {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang deret: ");
        int panjang = scanner.nextInt();
        int[] deretFibonanci = new int[panjang];
        int[] deretPrima = new int[panjang];

        int bil1 = 1;
        int bil2 = 1;
        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        for (int i = 0; i < deretFibonanci.length; i++) {

            deretFibonanci[i] = bil1;

            int nextStep = bil1 + bil2;
            bil1 = bil2;
            bil2 = nextStep;
        }

        int i = 0;
        int bilPrima = 2;
        while (i < panjang) {
            int cek = 0;
            for (int j = 2; j <= bilPrima; j++) {
                if (bilPrima % j == 0) {
                    cek++;
                }
            }
            if (cek == 1) {
                deretPrima[i] = bilPrima;
                i++;
            }
            bilPrima++;
        }

        System.out.print("Deret Fibonanci: ");
        for (int j = 0; j < panjang; j++) {
            System.out.print(deretFibonanci[j] + " ");
        }

        System.out.println("");
        System.out.print("Deret Prima: ");
        for (int j = 0; j < panjang; j++) {
            System.out.print(deretPrima[j] + " ");
        }

        System.out.println("");
        for (int j = 0; j < panjang; j++) {
            if (j % 2 == 0) {
                System.out.print(deretFibonanci[j] + " + " + deretPrima[j] + "; ");
            } else {
                System.out.print(deretFibonanci[j] + " - " + deretPrima[j] + "; ");
            }
        }

        System.out.println("");
        for (int j = 0; j < panjang; j++) {
            if (j % 2 == 0) {
                System.out.print((deretFibonanci[j] + deretPrima[j]) + " ");
            } else {
                System.out.print(Math.abs((deretFibonanci[j] + deretPrima[j])) + " ");
            }
        }
        // indeks genap 0, 2, 4, 6, 8 ditambah
        // indeks ganjil 1, 3, 5, 7, 8 selisih
    }
}
