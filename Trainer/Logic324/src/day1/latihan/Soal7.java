package day1.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        int x = scanner.nextInt(); //2

        System.out.print("Masukkan sisi segitiga: ");
        int y = scanner.nextInt(); //3

        int kelilingPersegi = 4 * x; // 4 x 2 = 8
        int kelilingSegitiga = 3 * y; // 3 x 3 = 9
        boolean cekBool = kelilingPersegi > kelilingSegitiga; // 8 > 9

        scanner.close();

        System.out.println("==========================");
        System.out.println("Apakah keliling persegi lebih besar dari keliling segitiga sama sisi? " + cekBool); //false
    }
}
