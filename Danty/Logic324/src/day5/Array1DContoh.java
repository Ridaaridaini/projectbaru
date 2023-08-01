package day5;

import java.util.Scanner;

public class Array1DContoh {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Deklarasi Array
        int[] arrA = new int[3];

        //Kombinasi input menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {
            System.out.print("Input Indeks ke " + i + " : ");
            arrA[i] = input.nextInt();
        }
        System.out.println("Hai");

        //Kombinasi output menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");

        }
        System.out.println();

        //Cetak Array dengan koma
        for (int i = 0; i < arrA.length; i++) {
            if( i == arrA.length-1){ //menghilangkan koma dibelakang
                System.out.print(arrA[i]);
            }
            else {
                System.out.print(arrA[i] + ",");
            }


        }


    }
}
