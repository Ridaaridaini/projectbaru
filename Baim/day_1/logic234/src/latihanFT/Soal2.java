package latihanFT;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan rute: ");
        String[] rute = scanner.nextLine().split(" ");

        int tinggi = 0;
        int gunung = 0;
        int lembah = 0;

        for (String langkah : rute) {
            if (langkah.equalsIgnoreCase("n")) {
                tinggi++;
            } else if (langkah.equalsIgnoreCase("t")) {
                tinggi--;
            }

            if (tinggi == 0) {
                if (langkah.equalsIgnoreCase("t")) {
                    gunung++;
                } else if (langkah.equalsIgnoreCase("n")) {
                    lembah++;
                }
            }
        }

        System.out.println("Gunung: " + gunung);
        System.out.println("Lembah: " + lembah);
    }
}
