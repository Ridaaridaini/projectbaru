package day5.latihan5;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka: ");
        int angka = input.nextInt();


        int[] array = new int[angka];

        int bil = 1;
        for (int i = 0; i < angka; i++) {
            array[i] = bil;
            bil = bil + 2;
            System.out.print(array[i] + " ");
        }


//            for (int i = 0; i < array.length; i++) {
//
//                System.out.print(array[i]+ " ");

    }
}

