package day5;

import java.util.Scanner;

public class Array1DimContoh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Deklarasi Array
        int[] arrA = new int[3]; // [0,0,0]

        //Kombinasi input menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) { // i = 0,1,2
            System.out.print("Input index ke " + i + " = ");
            arrA[i] = scanner.nextInt();
        }
        //kombinasi output menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrA.length; i++) {
            if (i == arrA.length - 1) {
                System.out.print(arrA[i]);
                } else {
                    System.out.print(arrA[i] + ",");

                }
            }
        }
    }
