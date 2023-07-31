package day5;

import java.util.Scanner;

public class ArrayDim2Contoh {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int[][] arrA = new int[2][3];
        //[0,0,0]
        //[0,0,0]


        //Input Array 2D menggunakan loop
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print("Input baris "+ i + ", kolom "+j+" : ");
                arrA[i][j] = input.nextInt();

            }

        }
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j]+" ");

            }
            System.out.println();

        }

    }
}
