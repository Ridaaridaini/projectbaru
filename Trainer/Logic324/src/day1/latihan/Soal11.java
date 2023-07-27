package day1.latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner input = new Scanner(System.in);

        System.out.print(" Nilai A =");
        a = input.nextInt(); // 2

        System.out.print(" Nilai B=");
        b = input.nextInt();// 4

         double hasil = Math.pow(a, b);

        System.out.println(" Hasil = " + hasil); //16
    }
}
