package day5.latihanday5;

import java.util.Scanner;

public class Soal08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Panjang Deret : ");
        int p = input.nextInt();

        int [] arrA = new int [p];
        int [] arrB = new int [p];

        int a = 0;
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = a;
            System.out.print(arrA[i] + " ");
            a = a+2;

        }
        System.out.println();
        int b = 1;
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = b;
            System.out.print(arrB[i] + " ");
            b = b+2;
        }
        System.out.println();
        for (int i = 0; i < p; i++) {
            int total = arrA[i] + arrB[i];
            System.out.print(total + " ");

        }


    }
}
