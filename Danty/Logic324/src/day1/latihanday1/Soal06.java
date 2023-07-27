package day1.latihanday1;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt();

        System.out.print("y = ");
        int y = input.nextInt();

        int luasP = x*x;
        int luasS = (y*y)/2;

        System.out.print(luasP == luasS);


    }
}
