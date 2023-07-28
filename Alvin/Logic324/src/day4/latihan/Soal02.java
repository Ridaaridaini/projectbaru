package day4.latihan;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        int p, s;

        Scanner scanner = new Scanner(System.in);

        System.out.print("P: ");
        p = scanner.nextInt();
        System.out.print("S: ");
        s = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < p; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println();
        for (int i = 0; i < p; i++) {
            System.out.print(i+s + " ");
        }

    }

}
