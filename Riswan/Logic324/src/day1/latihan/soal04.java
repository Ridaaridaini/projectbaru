package day1.latihan;

import java.util.Scanner;

public class soal04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai X : ");
        int X = input.nextInt();
        System.out.print("Nilai Y : ");
        int Y = input.nextInt();
        int Z = X*Y;
        System.out.print("Luas persegi panjang : " + Z);
    }
}
