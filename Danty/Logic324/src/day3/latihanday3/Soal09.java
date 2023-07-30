package day3.latihanday3;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        int a = 4;
        for (int i = 0; i < n; i++) {

            if (i % 3 == 2) {
                System.out.print("* ");
                continue;
            }
            System.out.print(a + " ");
            a = a * 4;


        }
    }
}
