package day5.latihanday5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] arrA = new int[5];

        for (int i = 0; i < arrA.length; i++) {
            System.out.print("Input indeks ke " + i + " : ");
            arrA[i] = input.nextInt();
        }
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");


        }
        System.out.println();
        Arrays.sort(arrA); //ini perintah untuk mengurutkan yaaa


        System.out.println();
        }







    }

