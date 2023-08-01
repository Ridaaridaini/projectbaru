package day6.latihan;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String[] hasil = kalimat.split(" ");
        for (int i = 0; i < hasil.length; i++) {
            String[] pengolahan = hasil[i].split("");

            System.out.print(pengolahan[0].toUpperCase());

            for (int j = 1; j < pengolahan.length-1; j++) {
                System.out.print("*");
            }
            System.out.print(pengolahan[pengolahan.length-1].toUpperCase());
            System.out.println();
        }

    }
}
