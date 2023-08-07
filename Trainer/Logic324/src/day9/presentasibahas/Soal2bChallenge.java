package day9.presentasibahas;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2bChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String[] kata = scanner.nextLine().toLowerCase().replace(" ", "").split(""); // [ b, a, i, m]
        Arrays.sort(kata); //[a, b, i, m]

        String hurufVokal = ""; //
        String hurufKonsonan = ""; //bm

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equalsIgnoreCase("a")) { //true
                if (!hurufVokal.contains(kata[i])){ //Cek apakah huruf vokal tidak mengandung huruf ini
                    if (hurufVokal.length()>0){ //cek apakah huruf vokal tidak kosong
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i]; // a
            } else if (kata[i].equalsIgnoreCase("i")) { //true
                if (!hurufVokal.contains(kata[i])){
                    if (hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i]; // b
            }
            else if (kata[i].equalsIgnoreCase("u")) {
                if (!hurufVokal.contains(kata[i])){
                    if (hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("e")) {
                if (!hurufVokal.contains(kata[i])){
                    if (hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("o")) {
                if (!hurufVokal.contains(kata[i])){
                    if (hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i];
            } else { //true
                if (!hurufKonsonan.contains(kata[i])){
                    if (hurufKonsonan.length()>0) {
                        hurufKonsonan += "-";
                    }
                }
                hurufKonsonan += kata[i];
            }
        }

        System.out.println("Huruf vokal: " + hurufVokal); //ai //setiap huruf vokal ganti, dipisahkan oleh strip
        System.out.println("Huruf konsonan: " + hurufKonsonan); //bm;
    }
}
