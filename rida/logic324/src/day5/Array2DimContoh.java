package day5;

import java.util.Scanner;

public class Array2DimContoh {
    public static void main(String[] args) {
        //ngisi baris dan kolom
        Scanner scanner = new Scanner(System.in);
        int[][] arrA = new int[2][3];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.println("input baris "+i+", kolom " +j+ ":");
                arrA[i][j] =scanner.nextInt();
            }
        }
        //cetak baris dan kolom
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j]+ " ");
            }
            System.out.println();

    }
}
}
