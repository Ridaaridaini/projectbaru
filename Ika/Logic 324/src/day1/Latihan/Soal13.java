package day1.Latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("harga beli : ");
        double x = input.nextDouble();

        System.out.print("harga jual: ");
        double y = input.nextDouble();

        double keuntungan = ((y-x)/x)*100;

        input.close();
        System.out.println(keuntungan + "%");

    }
}
