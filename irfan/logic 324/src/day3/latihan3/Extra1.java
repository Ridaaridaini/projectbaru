package day3.latihan3;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {

        int n;
        int a = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            a = a+2;

            System.out.print(a+ " ");
        }
    }
}
