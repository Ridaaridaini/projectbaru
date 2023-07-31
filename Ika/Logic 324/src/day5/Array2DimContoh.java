package day5;

import java.util.Scanner;

public class Array2DimContoh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrA = new int[2][3];
        //[3,4,5]
        //[6,7,8]


        //input array menggunakan loop
        for (int i = 0; i < arrA.length; i++) { //i sebagai baris // i=0,1,2,3
            for (int j = 0; j < arrA[i].length ; j++) {//sebagai kolom // i =0,1,2,3
                System.out.print("input baris ke " +i + ", kolom " + j+ " : ");
                arrA[i][j] = scanner.nextInt();
            }
        }

        //mencetak array 2 dim menggunakan loop
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();

        }



    }
}
