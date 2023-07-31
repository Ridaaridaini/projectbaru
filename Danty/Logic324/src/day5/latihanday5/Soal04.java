package day5.latihanday5;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Panjang Array : ");
        int p = input.nextInt();

        int[] arrA = new int[p];

        int a = 1;
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = a;
            System.out.print(arrA[i] + " ");
            a = a+2;
        }

    }
}
