package day2.latihanday2;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt();

        if (1 <= x && x <= 9) {
            System.out.println("satuan");

        } else if (10 <= x && x <= 99) {
            System.out.println("puluhan");

        } else if (100 <= x && x <= 999) {
            System.out.println("ratusan");

        } else {
            System.out.println("input tidak valid");
        }

    }
}
