package latihanFT1;

import java.util.Scanner;

public class Soal11Challenge {

    public static void main(String[] args) {

        //SOAL CHALLENGE : MENAMPILKAN DARI URUTAN BELAKANG

        Scanner input = new Scanner(System.in);

        System.out.print(" n = ");
        int n = input.nextInt();

        int[] arrA = new int[n];

        int a = arrA.length-1;
        int b = 1;

        for (int i = 0; i < n; i++) {

            arrA[i] = b;
            System.out.print(arrA[a] + " ");
            a = a-1;
            b = b + 2;

        }


        System.out.println();

        for (int i = 2; i <= arrA.length; i = i + 2) {

            System.out.print(arrA[i] + " ");
        }
    }
}
