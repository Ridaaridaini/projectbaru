package day1.latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai bilangan a: ");
        int nilaiA = input.nextInt();

        System.out.println("Masukkan nilai bilangan b:");
        int nilaiB = input.nextInt();

        System.out.println((int)Math.pow(nilaiA,nilaiB));
    }
}
