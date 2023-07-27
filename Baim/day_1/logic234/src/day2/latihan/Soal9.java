package day2.latihan;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan keranjang 1: ");
        int keranjang1 = scanner.nextInt();

        System.out.print("Masukkan keranjang 2: ");
        int keranjang2 = scanner.nextInt();

        System.out.print("Masukkan keranjang 3: ");
        int keranjang3 = scanner.nextInt();

        System.out.print("Input keranjang yang akan dibawa: ");
        int keranjangPasar = scanner.nextInt();

        if (keranjangPasar == 1) {
            int jumlahBuah = keranjang2 + keranjang3;
            System.out.println("Jumlah buah yang ada adalah: " + jumlahBuah + " buah");
        } else if (keranjangPasar == 2) {
            int jumlahBuah = keranjang1 + keranjang3;
            System.out.println("Jumlah buah yang ada adalah: " + jumlahBuah + " buah");
        } else if (keranjangPasar == 3) {
            int jumlahBuah = keranjang1 + keranjang3;
            System.out.println("Jumlah buah yang ada adalah: " + jumlahBuah + " buah");
        } else {
            System.out.println("Masukkan hanya 1 dan 3");
        }

        scanner.close();
    }
}
