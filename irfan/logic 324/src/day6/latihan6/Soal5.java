package day6.latihan6;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        String kalimat = "The quick brown fox jumps over a lazy dog";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan karakter : ");
        char karakterCari = scanner.next().charAt(0);
        scanner.close();

        boolean karakter = false;
        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == karakterCari) {
                karakter = true;
                break;
            }
        }

        if (karakter) {
            System.out.println("Karakter " + karakterCari + " ada dalam kalimat");
        } else {
            System.out.println("Karakter " + karakterCari + " tidak ada dalam kalimat");
        }
    }
}
