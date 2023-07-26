package day1.latihan;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt();

        System.out.print("y = ");
        int y = input.nextInt();

        int kelP = 4*x;
        int kelS = 3*y;
        boolean hasil = kelP > kelS; //mendeklarasikan boolean itu penting

        System.out.println(hasil);
    }
}
