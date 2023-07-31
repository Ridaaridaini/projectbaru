package day5;

import java.util.Scanner;

public class Array2DimContoh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arrA = new int[2][3];

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print("Input baris " + i + ", kolom " + j + ": ");
                arrA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j]);
            }
            System.out.println();
        }
    }
}
