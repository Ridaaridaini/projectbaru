package day3.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah n: ");
        Integer n = input.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (n % 2 == 0) {
                if (i == n / 2 - 1) {
                    System.out.print("XXX ");
                    a = a * 3;
                    continue;
                } else if (i == n / 2) {
                    System.out.print("XXX ");
                    a = a * 3;
                    continue;
                }
            } else if (i == n / 2) {
                System.out.print("XXX ");
                a = a * 3;
                continue;
            }
            a = a * 3;
            System.out.print(a + " ");
        }

    }
}
