package day1.latihan;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a : ");
        String a = input.nextLine();
        System.out.print("b : ");
        String b = input.nextLine();
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        System.out.println("Hasil " + (intA % intB));
    }
}
