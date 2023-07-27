package day3.latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang deret bilangan: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < bilangan; i++) {
            for (int j = 0; j < bilangan; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
