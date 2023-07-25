package day1.latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("harga jual a : ");
        int a = input.nextInt();
        System.out.print("harga jual b : ");
        int b = input.nextInt();
        int hasil = b - a;
        double persen = hasil/a * 100;

        System.out.println("keuntungan sebesar " + persen + " persen");
    }
}
