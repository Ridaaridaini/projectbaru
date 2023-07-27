package day1.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        int hasil;

        Scanner mod = new Scanner(System.in);

        System.out.println("masukan x: ");
        int x = mod.nextInt(); //4

        System.out.println("masukan y: ");
        int y = mod.nextInt(); //6

        hasil = x%y; //4

        System.out.println(hasil); //4
    }
}
