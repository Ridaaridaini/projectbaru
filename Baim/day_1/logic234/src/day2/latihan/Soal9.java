package day2.latihan;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Terdapat 3 keranjang: ");
        System.out.println("Keranjang 1");
        System.out.println("Keranjang 2");
        System.out.println("Keranjang 3");
        System.out.print("Pilih keranjang yang akan dibawa (1-3): ");
        int keranjangPasar = scanner.nextInt();

        if (keranjangPasar == 1) {
            System.out.print("Masukkan jumlah buah pada keranjang 2: ");
            int keranjang2 = scanner.nextInt();

            System.out.print("Masukkan jumlah buah pada keranjang 3: ");
            int keranjang3 = scanner.nextInt();

            int jumlahBuah = keranjang2 + keranjang3;
            System.out.println("Jumlah buah yang ada adalah: " + jumlahBuah + " buah");

        } else if (keranjangPasar == 2) {
            System.out.print("Masukkan jumlah buah pada keranjang 1: ");
            int keranjang1 = scanner.nextInt();

            System.out.print("Masukkan jumlah buah pada keranjang 3: ");
            int keranjang3 = scanner.nextInt();

            int jumlahBuah = keranjang1 + keranjang3;
            System.out.println("Jumlah buah yang ada adalah: " + jumlahBuah + " buah");
        } else if (keranjangPasar == 3) {
            System.out.print("Masukkan jumlah buah pada keranjang 1: ");
            int keranjang1 = scanner.nextInt();

            System.out.print("Masukkan jumlah buah pada keranjang 2: ");
            int keranjang3 = scanner.nextInt();

            int jumlahBuah = keranjang1 + keranjang3;
            System.out.println("Jumlah buah yang ada adalah: " + jumlahBuah + " buah");
        } else {
            System.out.println("Masukkan hanya 1 dan 3");
        }

        scanner.close();
    }
}
