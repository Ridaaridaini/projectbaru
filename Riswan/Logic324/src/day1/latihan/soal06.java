package day1.latihan;

import java.util.Scanner;

public class soal06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sisi Persegi : ");
        int sisiP = input.nextInt();
        System.out.print("Sisi segitiga : ");
        int sisiS = input.nextInt();
        int Persegi = sisiP *sisiP;
        int segitiga = (sisiS * sisiS)/2;
        System.out.println("luas persegi    : "+ Persegi);
        System.out.println("luas segitiga   : "+ segitiga);
        System.out.println(Persegi == segitiga);
    }
}
