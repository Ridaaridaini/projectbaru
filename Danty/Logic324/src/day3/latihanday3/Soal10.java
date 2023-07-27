package day3.latihanday3;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt(); //misal input 8

        int a = 3; //a = 3 9 27 81
        for (int i = 0; i < n; i++) { //i = 0 1 2 3

            if (i == n/2) {

                System.out.print("XXX ");
                a = a*3;

            } else {
                System.out.print(a + " ");
                a = a*3;

                //output = 3 9 27 81
            }

        }
    }
}
