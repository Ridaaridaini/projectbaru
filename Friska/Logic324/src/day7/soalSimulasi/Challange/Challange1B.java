package day7.soalSimulasi;

import java.util.Scanner;

public class Challange1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }


        } System.out.println();

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}


