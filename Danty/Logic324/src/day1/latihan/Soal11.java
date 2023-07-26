package day1.latihan;

import java.util.Scanner;

public class Soal11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        double hasil = Math.pow(a, b); //tipe data tergantung yang tersedia di program ini

        System.out.println(hasil);

    }
}
