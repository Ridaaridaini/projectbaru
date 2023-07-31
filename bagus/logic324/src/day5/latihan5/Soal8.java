package day5.latihan5;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka: ");
        int angka = input.nextInt();


        int[] arrayGenap = new int[angka];
        int[] arrayGanjil = new int[angka];

        int genap = 0;
        int ganjil = 1;

        int total;


        for (int i = 0; i < angka; i++) {
            arrayGenap[i] = genap;
            arrayGanjil[i] = ganjil;

            genap = genap + 2;
            ganjil = ganjil + 2;

        }
        
        for (int i = 0; i < angka; i++) {

            System.out.print(arrayGenap[i] + "+" + arrayGanjil[i]+ " , ");

        }

        System.out.println();


        for (int i = 0; i < angka; i++) {

            total = arrayGenap[i] + arrayGanjil[i];

            System.out.print(total+ " ");


        }
    }


}


