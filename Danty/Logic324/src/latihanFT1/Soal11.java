package latihanFT1;

import java.util.Scanner;

public class Soal11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" n = ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i = i + 2) {

            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 2; i <= n; i = i + 2) {

            System.out.print(i + " ");

        }

    }
}
