package day3.latihan;

import java.util.Scanner;

public class Soal11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("@");
            for (int j = 0; j < n-1; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

    }

}
