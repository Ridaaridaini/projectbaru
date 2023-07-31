package day5;

import java.util.Scanner;

public class Array2DimContoh {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] arrA = new int[2][3];
        //[3,5,10]
        //[7,12,6]

        //Input Array 2dim menggunakan loop
        for (int i = 0; i < arrA.length; i++) {//i sebagai baris //i = 0, 1, 2
            for (int j = 0; j < arrA[i].length; j++) {//j sebagai kolom //j = 0, 1, 2, 3
                System.out.print("Input baris " + i + ", kolom " + j + " : ");
                arrA[i][j] = scanner.nextInt();
            }
        }

        //Cetak array 2dim menggunakan loop
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }







    }

}
