package day3.latihan;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan number: ");
        int number = scan.nextInt();

        int bil = 1;
        for (int i = 0; i < number; i++) {
            if (i % 3==2) {
                System.out.print(" * ");

            } else {
                System.out.print(bil + " ");

            }
            bil = bil + 4;
        }
    }
}
