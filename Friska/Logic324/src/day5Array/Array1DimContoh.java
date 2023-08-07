package day5Array;

import java.util.Scanner;

public class Array1DimContoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Deklarasi array

        int [] arrA = new int [3];

        //Kombinasi input menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {// i = 0,1,2
            System.out.println("input index ke -"+i+" : ");
            arrA[i] = input.nextInt();
        }
        //Kobinasi output menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < arrA.length; i++) {
            if (i == arrA.length-1){
                System.out.print(arrA[i]);
            }else {
                System.out.println(arrA[i] + ",");

            }


        }

    }
}
