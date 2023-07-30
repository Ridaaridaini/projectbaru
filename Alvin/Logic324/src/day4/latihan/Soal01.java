package day4.latihan;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        String name, quotes;
        int repeat;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        name = scanner.nextLine();
        System.out.print("Quotes: ");
        quotes = scanner.nextLine();
        System.out.print("Repeat: ");
        repeat = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < repeat; i++) {

            System.out.println(name + " say, "+quotes);

        }

    }

}
