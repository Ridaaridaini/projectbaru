package day1BasicJava.latihan;

import java.util.Scanner;

public class Soal10FungsiMathMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai bilangan a: ");
        int nilaiA = input.nextInt();

        System.out.println("Masukkan nilai bilangan b:");
        int nilaiB = input.nextInt();

        System.out.println(Math.max(nilaiA,nilaiB));
    }
}
