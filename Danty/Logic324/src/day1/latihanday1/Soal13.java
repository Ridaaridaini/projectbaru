package day1.latihanday1;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        double x = input.nextDouble();

        System.out.print("y = ");
        double y = input.nextDouble();

        double untung = y-x;
        double persen = (untung*100)/x;

        System.out.println(persen +"%");
    }
}
