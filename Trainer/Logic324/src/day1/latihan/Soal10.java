package day1.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("nilai a = ");
        int a = input.nextInt(); //5

        System.out.print("nilai b = ");
        int b = input.nextInt(); //7

        int hasil = Math.max(a, b);
        System.out.println(hasil); //7
    }
}
