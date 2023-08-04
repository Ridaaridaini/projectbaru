package day6.latihan6;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata: ");
        String kata = scanner.nextLine();
        scanner.close();

        if (isPalindrom(kata)) {
            System.out.println("Kata \"" + kata + "\" adalah kata palindrom");
        } else {
            System.out.println("Kata \"" + kata + "\" bukan kata palindrom");
        }
    }

   public static boolean isPalindrom(String kata) {
        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

