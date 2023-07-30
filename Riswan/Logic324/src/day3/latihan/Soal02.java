package day3.latihan;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input nilai n : ");
        int n = input.nextInt();
        int angka = 2;
        for (int i = 1; i <= n ; i++) {
            System.out.print(angka + " ");
            angka = angka + 2;
    }
}
}
