package day6.latihan;

import java.util.Scanner;


public class Soal6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String[] inputString = scanner.nextLine().split("");

        String balik = "";
        String normal = "";
        for (int i = 0; i < inputString.length; i++) {

            balik += inputString[(inputString.length - i)-1];
            normal += inputString[i];
        }

        if(normal.equalsIgnoreCase(balik)){
            System.out.println("Kata adalah palindrom");
        } else {
            System.out.println("Kata bukan palindrome");
        }

        scanner.close();
    }
}
