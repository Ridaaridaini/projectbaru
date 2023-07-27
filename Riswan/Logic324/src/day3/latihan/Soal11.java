package day3.latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input nilai n : ");
        int n = input.nextInt();
        int angka = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("@");
            }
            System.out.println();

        }
    }
}
