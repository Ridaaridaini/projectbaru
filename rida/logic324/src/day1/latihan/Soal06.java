package day1.latihan;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int luasX, luasY;
        System.out.println("x= ");
        Integer x= input.nextInt();
        System.out.println("y= ");
        Integer y= input.nextInt();
        luasX = x * x;
        luasY = 1/2 * y *y;
        System.out.println(luasX==luasY);

    }
}
