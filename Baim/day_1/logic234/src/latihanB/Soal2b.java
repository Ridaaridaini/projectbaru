package latihanB;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String[] kata = scanner.nextLine().toLowerCase().replace(" ", "").split("");
        Arrays.sort(kata);

        String hurufVokal = "";
        String hurufKonsonan = "";

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equalsIgnoreCase("a")) {
                if(i != 0){
                    if (!hurufVokal.contains("a")) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i];
            } else if (kata[i].equalsIgnoreCase("i")) {
                if(i != 0){
                    if (!hurufVokal.contains("i")) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i];
            } else if (kata[i].equalsIgnoreCase("u")) {
                if(i != 0){
                    if (!hurufVokal.contains("u")) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i];
            } else if (kata[i].equalsIgnoreCase("e")) {
                if(i!=0){
                    if (!hurufVokal.contains("e")) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i];
            } else if (kata[i].equalsIgnoreCase("o")) {
                if(i != 0){
                    if (!hurufVokal.contains("o")) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal += kata[i];
            } else {
                if(hurufKonsonan.length() != 0){
                    if(!hurufKonsonan.contains(kata[i])){
                        hurufKonsonan += "-";
                    }
                }
                hurufKonsonan += kata[i];
            }
        }

        System.out.println(hurufVokal);
        System.out.println(hurufKonsonan);

    }
}
