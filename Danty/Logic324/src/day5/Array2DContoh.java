package day5;

import java.util.Scanner;

public class Array2DContoh {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] arrA = new int[2][3]; // 2 baris 3 kolom

        //input array dengan loop
        for (int i = 0; i < arrA.length; i++) { //sebagai baris
            for (int j = 0; j < arrA[i].length; j++) { //sebagai kolom
                System.out.print("Input baris " + i + ", kolom " + j + " : ");
                arrA[i][j] = input.nextInt();

            }

        }//Cetak array 2D fengan loop
        for (int i = 0; i < arrA.length; i++) { //sebagai baris
            for (int j = 0; j < arrA[i].length; j++) { //sebagai kolom
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }


    }
}
