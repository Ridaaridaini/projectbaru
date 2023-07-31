package day5;

import java.util.Scanner;

public class Array2DimContoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arrA = new int[3][2];

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j <arrA[i].length ; j++) {
                System.out.print("baris ke " + (i+1) + " data ke "+(j+1)+ " ");
                arrA[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.println("baris ke " + (i+1) + " data ke "+(j+1)+ " nilainya : "+arrA[i][j]);
            }

        }
    }
}
