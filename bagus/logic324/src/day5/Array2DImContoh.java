package day5;

import java.util.Scanner;

public class Array2DImContoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arrA = new int[2][3];

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length ; j++) {
                System.out.println("input baris ke - " + i + "kolom ke - " +j);
            }
        }

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length ; j++) {
                System.out.print(arrA[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
