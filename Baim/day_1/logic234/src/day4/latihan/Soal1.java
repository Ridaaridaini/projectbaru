package day4.latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Quotes: ");
        String quotes = scanner.nextLine();

        System.out.print("Repeat: ");
        int repeat = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < repeat; i++) {
            System.out.println(nama + " say," + quotes);
        }
    }
}
