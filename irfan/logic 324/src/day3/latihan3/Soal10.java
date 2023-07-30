package day3.latihan3;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        int i, n;
        int a = 3;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        n = inputan.nextInt();

        for (i = 0; i < n; i++) {
            if (n % 2 == 1) {
                if (i == n / 2) {
                    System.out.print("XXX ");
                } else {
                    System.out.print(a + "  ");
                }
                a = a * 3;
            } else {
                if (i == n / 2 || i == (n / 2) - 1) {
                    System.out.print("XXX ");
                } else {
                    System.out.print(a + "  ");

                }
                a = a * 3;
            }
        }
    }
}


