package latihanA;

import java.util.Scanner;

public class Soal7Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jumlah buah keranjang 1: ");
        int keranjang1 = input.nextInt();

        System.out.println("Masukan jumlah buah keranjang 2: ");
        int keranjang2 = input.nextInt();

        System.out.println("Masukan jumlah buah keranjang 3: ");
        int keranjang3 = input.nextInt();

        System.out.println("Pilih keranjang yang mau di bawa: ");
        int pilihan = input.nextInt();

        int total = 0;

        if (pilihan == 1) {
            total = keranjang2 + keranjang3;
            System.out.println("Sisa buah tersisaa adalah: " + total);
        } else if (pilihan == 2) {
            total = keranjang1 + keranjang3;
            System.out.println("Sisa buah tersisa adalah: "+ total);
        } else if (pilihan == 3) {
            total = keranjang1 + keranjang2;
            System.out.println("Sisa buah tersisa adalah: "+ total);
        } else {
            total = keranjang1 + keranjang2 + keranjang3;
            System.out.println(total);
        }
    }
}
