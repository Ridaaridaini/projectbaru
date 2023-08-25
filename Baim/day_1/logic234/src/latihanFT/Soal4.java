package latihanFT;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan kalimat: ");
        String[] kata = scanner.nextLine().toLowerCase().replace(" ", "").split("");
        Arrays.sort(kata);
        String hurufGabungan = "";

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equalsIgnoreCase("a")) {
                if (i != 0 && !hurufGabungan.contains("a")) {
                    hurufGabungan += ", ";
                }
                hurufGabungan += kata[i];
            } else if (kata[i].equalsIgnoreCase("i")) {
                if (i != 0 && !hurufGabungan.contains("i")) {
                    hurufGabungan += ", ";
                }
                hurufGabungan += kata[i];
            } else if (kata[i].equalsIgnoreCase("u")) {
                if (i != 0 && !hurufGabungan.contains("u")) {
                    hurufGabungan += ", ";
                }
                hurufGabungan += kata[i];
            } else if (kata[i].equalsIgnoreCase("e")) {
                if (i != 0 && !hurufGabungan.contains("e")) {
                    hurufGabungan += ", ";
                }
                hurufGabungan += kata[i];
            } else if (kata[i].equalsIgnoreCase("o")) {
                if (i != 0 && !hurufGabungan.contains("o")) {
                    hurufGabungan += ", ";
                }
                hurufGabungan += kata[i];
            } else {
                if(!hurufGabungan.contains(kata[i])){
                    hurufGabungan += ", ";
                }
                hurufGabungan += kata[i];
            }
        }

        System.out.println("Huruf Gabungan: " + hurufGabungan);
    }
}
