package day6.latihan;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String[] hasil = kalimat.split(" ");

        for (int i = 0; i < hasil.length; i++) {
            System.out.println(hasil[i]);
        }
    }
}
