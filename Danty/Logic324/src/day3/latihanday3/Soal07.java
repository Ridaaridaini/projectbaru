package day3.latihanday3;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        int a = 2;
        for (int i = 0; i < n; i++) {

            System.out.print(a + " ");
            a = a*2;

        }
    }
}
