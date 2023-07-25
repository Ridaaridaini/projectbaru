package day1.latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt();

        System.out.print("y = ");
        int y = input.nextInt();

        int untung = y-x;
        int persen = (untung*100)/x;

        System.out.println(persen +"%");
    }
}
