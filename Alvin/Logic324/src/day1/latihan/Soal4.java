package day1.latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan panjang persegi: ");
        x = scanner.nextInt();

        System.out.print("Masukan lebar persegi: ");
        y = scanner.nextInt();
        scanner.close();

        int z = x * y;

        System.out.println("Luas persegi panjang dangan panjang " + x +" dan lebar "+ y + " adalah "+ z);
    }
}
