package day1.latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kellX, kellY;
        System.out.println("x= ");
        Integer x= input.nextInt();
        System.out.println("y= ");
        Integer y= input.nextInt();
        kellX = 4 * x;
        kellY = 3 * y ;
        System.out.println("keliling Persegi: " +kellX);
        System.out.println("keliling segitiga sama sisi: "+kellY);
        System.out.println(kellX>kellY);

    }
}
