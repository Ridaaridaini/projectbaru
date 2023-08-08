package latihanFT1;

import java.util.Scanner;

public class Soal11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" n = ");
        int n = input.nextInt();


        int[] arrGanjil = new int[n];

        int c = arrGanjil.length - 1;

        int a = 1;
        int d = 0;

        for (int i = 0; i < arrGanjil.length; i = i+2) {

            d = d + arrGanjil[c];

            System.out.print(arrGanjil[c] + " ");


        }


        System.out.println();

        int b = 2;

        for (int i = 1; i < n; i = i + 2) {

            System.out.print(b + " ");
            b = b+2;

        }

    }
}
