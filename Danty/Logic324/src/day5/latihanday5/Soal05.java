package day5.latihanday5;

import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrA = {3, 2, 1, 5, 8};

        System.out.print("Nilai yang dicari? ");
        int nilai = input.nextInt();

        int a = 0;

        for (int i = 0; i < arrA.length; i++) {

            if (nilai == arrA[i]) {


                    System.out.print("Nilai " + nilai + " ada dalam deret di posisi " + (i + 1));

            } else {

                System.out.print("Nilai " + nilai + " ada dalam deret di posisi " + (i+1));
            }
            break;


        }


    }
}


