package day1.latihan;

import java.util.Scanner;

public class Soal11 {

    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bilangan a: ");
        a = scanner.nextInt();

        System.out.print("Bilangan b: ");
        b = scanner.nextInt();
        scanner.close();

        double nilaiPangkat = Math.pow(a, b);

        System.out.println("Nilai a:" + a + " pangkat b:" + b + " adalah " + (int) nilaiPangkat);
    }
}
