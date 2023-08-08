package day3.latihan3;

import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {

        int a = 1;
        double n;
        double pangkat;

        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan angka =");
        n = scanner.nextInt(); // 5

//        for (int i = 0; i < n; i++) { // i =0
//            pangkat= Math.pow(2,i);
//
//            System.out.print(pangkat + " ");
//
//        }
//        pangkat = Math.pow(2,1);
//        System.out.print(pangkat+ " ");
//
//        pangkat = Math.pow(2,2);
//        System.out.print(pangkat+ " ");
//
//        pangkat = Math.pow(2,3);
//        System.out.print(pangkat+ " ");
//
//        pangkat = Math.pow(2,4);
//        System.out.print(pangkat+ " ");
//
//        pangkat = Math.pow(2,5);
//        System.out.print(pangkat+ " ");

//        for (int i = 0; i < n; i++) {
//            pangkat = Math.pow(2,i);
//            System.out.print(pangkat+ " ");
//
//        }

        for (int i = a; i < n+1; i++) {
            pangkat = Math.pow(2,i);
            System.out.print(pangkat+ " ");

        }

    }
}
