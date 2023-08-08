package day5.latihanday5;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrA = {2,4,6,8,10};


        for (int i = 0; i < arrA.length; i++) { // i = 0
            if (i == arrA.length - 1) { //menghilangkan koma dibelakang
                System.out.print(" dan " + arrA[i]);
            } else {
                System.out.print(arrA[i] + ",");
            }

        }
    }
}