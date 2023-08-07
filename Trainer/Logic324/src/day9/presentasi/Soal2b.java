package day9.presentasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String[] kata = scanner.nextLine().toLowerCase().replace(" ", "").split(""); // [ b, a, i, m]
        Arrays.sort(kata); //[a, b, i, m]

        String hurufVokal = ""; // ai
        String hurufKonsonan = ""; //bm

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equalsIgnoreCase("a")) { //true
                hurufVokal += kata[i]; // a
            } else if (kata[i].equalsIgnoreCase("i")) { //true
                hurufVokal += kata[i]; // b
            }
            else if (kata[i].equalsIgnoreCase("u")) {
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("e")) {
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("o")) {
                hurufVokal += kata[i];
            } else { //true
                hurufKonsonan += kata[i];
            }
        }

        System.out.println("Huruf vokal: " + hurufVokal); //ai //setiap huruf vokal ganti, dipisahkan oleh strip
        System.out.println("Huruf konsonan: " + hurufKonsonan); //bm;
    }
}
