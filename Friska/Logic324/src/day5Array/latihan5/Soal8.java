package day5Array.latihan5;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang deret");
        int panjang = input.nextInt();
        int a = 1;
        int b = 0;

        int [] arrA = new int [panjang];
        System.out.print("Deret Genap: ");
        for (int i = 0; i < panjang; i++) {
            System.out.print( b + " ");
            arrA[i] = b;
            b = b + 2;

        }System.out.println();

        System.out.print("Deret Ganjil: ");
        for (int i = 0; i < panjang; i++) {
            System.out.print( a + " " );
            arrA[i] = a;
            a = a + 2 ;

        }
        System.out.println();

        for (int i = 0; i < panjang; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(arrA[i] + "+");
                b = b + 2;

            }

        }
    }

}







