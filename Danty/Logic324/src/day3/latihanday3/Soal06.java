package day3.latihanday3;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        int a = 1; //a = 1 5 9
        for (int i = 0; i < n; i++) { //i = 0 1 2 3

            if (i % 3 == 2) {
                System.out.print("* ");
                a = a+4;

            } else {

                System.out.print(a + " ");
                a = a + 4;

                //output : 1 5 * 9
            }

        }
    }
}

