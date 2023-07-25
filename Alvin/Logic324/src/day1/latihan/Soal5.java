package day1.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("X Mod Y");
        System.out.print("Masukan nilai x: ");
        x = scanner.nextInt();

        System.out.print("Masukan nilai y: ");
        y = scanner.nextInt();

        scanner.close();

        System.out.print("Hasil sisa bagi: " + x % y);
    }
}
