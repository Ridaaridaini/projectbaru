package day3.latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang deret bilangan ganjil: ");
        int deret = scanner.nextInt();

        scanner.close();

        int a = 1;

        for (int i = 0; i < deret; i++) {
            System.out.print(a + " ");
            a += 2;
        }

    }
}
