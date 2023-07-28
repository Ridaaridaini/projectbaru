package day4;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" n = ");
        int n = input.nextInt();


//        int a = 1;
//
//        for (int i = 0; i < n; i++) {
//            if(a%2==1){
//                System.out.print(a + " ");
//
//            } a = a+1;
//
//        }
//        System.out.println();
//        int b = 2;
//
//        for (int i = 0; i < n; i++) {
//            if(b%2 == 0){
//                System.out.print(b + " ");
//            }b = b+1;
//        }

        for (int i = 1; i <= n; i = i + 2) {

            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 2; i <= n; i = i + 2) {

            System.out.print(i + " ");


        }


    }
}


