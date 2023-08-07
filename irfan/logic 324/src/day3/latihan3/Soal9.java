package day3.latihan3;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        int i, n;
        int a = 4;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        n = inputan.nextInt();

        for (i = 0; i < n; i++) {
            if (i % 3 == 2) {
                System.out.print("* ");
            } else {
                System.out.print(a + "  ");
                a = a * 4;
            }
//            a = a * 4;
        }
    }
}
