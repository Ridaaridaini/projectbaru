package day1.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bilangan a: ");
        a = scanner.nextInt();

        System.out.print("Bilangan b: ");
        b = scanner.nextInt();
        scanner.close();

        int nilaiTerbesar = Math.max(a, b);

        System.out.println("Nilai terbesar dari a:" + a + " & b:" + b + " adalah " + nilaiTerbesar);
    }
}
