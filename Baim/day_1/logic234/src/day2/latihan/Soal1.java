package day2.latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sembarang bilangan 1 <= x <= 999: ");
        int bilangan = scanner.nextInt();

        scanner.close();

        System.out.println("==========================");

        if (bilangan < 10) {
            System.out.println("Bilangan " + bilangan + " adalah satuan");
        } else if (bilangan < 100) {
            System.out.println("Bilangan " + bilangan + " adalah puluhan");
        } else if (bilangan < 1000) {
            System.out.println("Bilangan " + bilangan + " adalah ratusan");
        } else {
            System.out.println("bilangan diatas ratusan");
        }

    }
}
