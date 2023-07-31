package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Array1DimContoh {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Deklarasi Array
        Integer[] arrA = new Integer[3];//[3,4,5] //arrLength = 3

        //Kombinasi input menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {//i =0,1,2,3
            System.out.print("input indeks ke-" + i + "  : " );
            arrA[i] = scanner.nextInt(); //
        }

        //Kombinasi ouput menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }

        System.out.println();

        //Cetak array dengan pemisah koma (,)
        for (int i = 0; i < arrA.length; i++) {
            if (i == arrA.length-1){//indeks terakhir
                System.out.print(arrA[i]);
            } else {
                System.out.print(arrA[i] + ",");
            }
        }

    }
}
