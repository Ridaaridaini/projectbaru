package day1.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int x = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int y = input.nextInt();

        int hasil = Math.max(x, y);

        input.close();

        System.out.println("===================");
        System.out.println("Bilangan terbesar antara " + x + " dan " + y + "adalah: " + hasil);
        System.out.println("===================");
    }
}
