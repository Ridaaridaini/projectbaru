package day1.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sisi Persegi: ");
        int x = input.nextInt();

        System.out.print("Masukkan Sisi Segitiga Sama Sisi: ");
        int y = input.nextInt();
        input.close();

        int hasilPersegi = x * x;
        int hasilSegitigaSisi = 3 * y;
        boolean bool = hasilPersegi > hasilSegitigaSisi;

        System.out.println("==================");
        System.out.println("Segitiga sama sisi dan persegi memiliki keliling yang sama? " + bool);
        System.out.println("==================");

    }
}
