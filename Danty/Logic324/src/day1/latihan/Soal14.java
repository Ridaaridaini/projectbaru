package day1.latihan;

import java.util.Scanner;

public class Soal14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        int total = a+b+c;

        System.out.println(total);
    }
}
