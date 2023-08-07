package latihanB;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String[] kata = scanner.nextLine().toLowerCase().replace(" ", "").split("");
        Arrays.sort(kata);

        String hurufVokal = "";
        String hurufKonsonan = "";

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equalsIgnoreCase("a")) {
                hurufVokal += kata[i];
            } else if (kata[i].equalsIgnoreCase("i")) {
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("u")) {
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("e")) {
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("o")) {
                hurufVokal += kata[i];
            } else {
                hurufKonsonan += kata[i];
            }
        }

        System.out.println("Huruf vokal: " + hurufVokal);
        System.out.println("Huruf konsonan: " + hurufKonsonan);
    }
}
