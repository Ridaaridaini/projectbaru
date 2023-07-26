package day1.Latihan;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {

        // membandingkan luas persegi dengan persegipanjang
        Scanner input = new Scanner(System.in);
        System.out.print("sisi x: ");
        int sisiX = input.nextInt();
        System.out.print("sisi y: ");
        int sisiY = input.nextInt();
        int luasPersegi = sisiX*sisiY;
        int luasSegitiga = luasPersegi/2; //misal sisi x= alas; sisi y = tinggi

        input.close();
        System.out.println(luasPersegi==luasSegitiga);


    }

}
