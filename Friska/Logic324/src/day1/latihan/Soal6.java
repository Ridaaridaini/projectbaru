package day1.latihan;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai sisi x :");
        int sisiX = input.nextInt();

        System.out.println("MAsukkan nilai sisi y :");
        int sisiY = input.nextInt();

        input.close();
        int luasPersegi = sisiX * sisiX;
        int luasSegitiga = 1/2 * sisiY * sisiY;

        System.out.println(luasPersegi==luasSegitiga);
    }
}