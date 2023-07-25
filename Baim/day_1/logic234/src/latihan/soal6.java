package latihan;

import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sisi Persegi: ");
        int x = input.nextInt();

        System.out.print("Masukkan Sisi Segitiga Siku Siku Sama Kaki: ");
        int y = input.nextInt();

        input.close();

        int hasilPersegi = x*x;
        int hasilSegitigaSiku = 1/2 * y * y;
        boolean bool = hasilPersegi == hasilSegitigaSiku;

        System.out.println("==================");
        System.out.println("Segitiga siku siku sama kaki dan persegi memiliki luas yang sama? " + bool);
        System.out.println("==================");

    }
}
