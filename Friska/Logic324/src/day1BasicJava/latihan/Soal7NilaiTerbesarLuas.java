package day1BasicJava.latihan;

import java.util.Scanner;

public class Soal7NilaiTerbesarLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai X: ");
        int sisiX = input.nextInt();

        System.out.println("Masukkan nilai y: ");
        int sisiY = input.nextInt();

        int kelPersegi = 4 * sisiX;
        int kelSegitiga = 3 * sisiY;

        System.out.println(kelPersegi > kelSegitiga);
    }
}
