package day4.latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("p? ");
        int p = scan.nextInt();

        System.out.println("s? ");
        int s = scan.nextInt();

        int pBil = 1;
        int sBil = s;

        for (int i = 0; i < p; i++) {
            System.out.print(pBil + " ");
            pBil = pBil + 1;
        }

        System.out.println();

        for (int j = 0; j < p; j++) {
            System.out.print(sBil + " ");
            sBil = sBil + 1;
        }


    }
}
