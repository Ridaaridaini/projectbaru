package day3.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan number: ");
        int number = scan.nextInt();

        int bil = 2;
        for (int i = 1; i <= number; i++) {
            System.out.print(" "+bil+" ");
            bil = bil * 2;


        }
    }

}
