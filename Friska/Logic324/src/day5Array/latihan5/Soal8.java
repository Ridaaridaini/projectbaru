package day5Array.latihan5;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang deret");
        int panjang = input.nextInt();
        int a = 1;
        int b = 0;

        int [] arrGenap = new int [panjang];
        int [] arrGanjil = new int [panjang];

        int jumGanjilGenap = 0;

        System.out.print("Deret Genap: ");
        for (int i = 0; i < panjang; i++) {
            System.out.print( b + " ");
            arrGenap[i] = b;
            b = b + 2;

        }System.out.println();

        System.out.print("Deret Ganjil: ");
        for (int i = 0; i < panjang; i++) {
            System.out.print( a + " " );
            arrGanjil[i] = a;
            a = a + 2 ;

        }
        System.out.println();

        for (int i = 0; i < arrGanjil.length; i++) {
            jumGanjilGenap = arrGanjil[i]+ arrGenap[i];
            System.out.print(jumGanjilGenap+" ");


        }



    }

}







