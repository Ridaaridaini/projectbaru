package day1.latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sisi Persegi : ");
        int sisiP = input.nextInt();
        System.out.print("Sisi segitiga : ");
        int sisiS = input.nextInt();
        int Persegi = sisiP * 4;
        int segitiga = sisiS * 3;
        System.out.println("keliling persegi    : "+ Persegi);
        System.out.println("keliling segitiga   : "+ segitiga);
        System.out.println(Persegi > segitiga);
    }
}
