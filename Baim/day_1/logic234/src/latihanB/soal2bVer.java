package latihanB;

import java.util.Arrays;
import java.util.Scanner;

public class soal2bVer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kata = scanner.nextLine().toLowerCase().replaceAll(" ", "");
        String hurufVokal = "";
        String hurufKonsonan = "";

        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            if ("aiueo".contains(String.valueOf(huruf))) {
                if (hurufVokal.isEmpty() || !hurufVokal.contains(String.valueOf(huruf))) {
                    hurufVokal += (hurufVokal.isEmpty() ? "" : "-") + huruf;
                }
            } else {
                if (hurufKonsonan.isEmpty() || !hurufKonsonan.contains(String.valueOf(huruf))) {
                    hurufKonsonan += (hurufKonsonan.isEmpty() ? "" : "-") + huruf;
                }
            }
        }

        System.out.println(hurufVokal);
        System.out.println(hurufKonsonan);
    }
}
