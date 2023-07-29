package day4.latihan;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.println("Quotes : ");
        String quotes = input.nextLine();
        System.out.println("Repeat : ");
        int repeat = input.nextInt();

        for (int i = 0; i < repeat; i++) {
            System.out.println(nama + " say, " + quotes);
        }
    }
}
