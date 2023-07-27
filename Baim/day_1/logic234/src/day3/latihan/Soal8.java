package day3.latihan;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang deret bilangan: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        int a = 3;
        for (int i = 0; i < bilangan; i++) {
            System.out.print(a + " ");
            a *= 3;
        }
    }
}
