package day3.latihanday3;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt(); //misal input 8

        int a = 3; //a = 3 9 27 81
        for (int i = 0; i < n; i++) {

            if (n % 2 == 0) {//ini buat genap

                if (i == n / 2) {

                    System.out.print("XXX ");
                    a = a * 3;

                } else if (i == (n / 2) - 1) {
                    System.out.print("XXX ");
                    a = a * 3;

                } else {
                    System.out.print(a + " ");
                    a = a * 3;

                }

            } else { //ini buat ganjil

                if (i == n / 2) {

                    System.out.print("XXX ");
                    a = a * 3;

                } else {
                    System.out.print(a + " ");
                    a = a * 3;

                }

            }


        }
    }
}
