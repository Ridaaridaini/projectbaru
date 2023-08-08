package latihanekstra;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang deret: ");
        int panjang = scanner.nextInt();

        int[] bil3 = new int[panjang];
        int[] bil2 = new int[panjang];

        int bil = 0;
        for (int i = 0; i < panjang; i++) {
            bil3[i] = (bil * 3) - 1;
            bil2[i] = (bil * -2) * 1;
            bil++;
        }

        System.out.print("Bilangan kelipatan 3 dikurangi 1 = ");
        for (int i = 0; i < panjang; i++) {
            System.out.print(bil3[i] + " ");
        }

        System.out.println();
        System.out.print("Bilangan kelipatan -2 x 1 = ");
        for (int i = 0; i < panjang; i++) {
            System.out.print(bil2[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < bil2.length; i++) {
            if (i % 2 == 0) {
                System.out.print(bil3[i] + " + " + bil2[i] + "; ");
            } else {
                System.out.print(bil3[i] + " + " + bil2[i] + "; ");
            }
        }

        System.out.println();
        System.out.print("hasil = ");
        for (int i = 0; i < bil2.length; i++) {
            if (i % 2 == 0) {
                System.out.print((bil3[i]+bil2[i]) + ", ");
            } else {
                System.out.print((bil3[i]+bil2[i]) + ", ");
            }
        }

        scanner.close();
    }
}
