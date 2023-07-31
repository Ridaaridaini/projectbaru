package day4;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) { // kelipatan 3 = 3,6,9,12
        int a = 3; // a = 1

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka =");
        int x = input.nextInt(); //n=4

        for (int i = 0; i < x; i++) { // i = 0 1 2 3
            if (a % 2 == 0 && a < x) {
                System.out.print(a + " ");
            }

            a = a + 3;
        }

    }
}

