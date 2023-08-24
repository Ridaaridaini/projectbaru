package simulasiFT1;

import java.util.Scanner;

public class Soal09 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Panjang Deret : ");
        int n = input.nextInt();

        int[] arrBil3 = new int[n];
        int[] arrBil4 = new int[n];

        int a = 3;

        for (int i = 0; i < arrBil3.length; i++) {

            arrBil3[i] = a - 1;

            System.out.print(arrBil3[i] + " ");
            a = a + 3;

        }

        System.out.println();

        int b = 4;

        for (int i = 0; i < arrBil4.length; i++) {

            arrBil4[i] = b / 2;

            System.out.print(arrBil4[i] + " ");
            b = b + 4;
        }


        System.out.println();

        for (int i = 0; i < n; i++) {

            int jumlah = arrBil3[i] + arrBil4[i];

            System.out.print(jumlah + " ");


        }

    }
}
