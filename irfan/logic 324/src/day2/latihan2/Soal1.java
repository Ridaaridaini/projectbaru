package day2.latihan2;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        int x;

        Scanner input = new Scanner(System.in);

        System.out.print("inputan X =");
        x = input.nextInt();

        if (x >= 1 && x <= 999) {
            if (x >= 100) {
                System.out.println("x adalah ratusan");
            } else if (x >= 10) {
                System.out.println("x adalah puluhan");

            } else {
                System.out.println("x adalah satuan");

            }

        }
    }
}
