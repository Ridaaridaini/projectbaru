package day6.latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String[] hasil = kalimat.split(" ");
        for (int i = 0; i < hasil.length; i++) {
            String[] pengolahan = hasil[i].split("");

            System.out.print(pengolahan[0].toUpperCase());

            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.print(pengolahan[pengolahan.length-1].toUpperCase());
            System.out.print(" ");
        }
    }
}
