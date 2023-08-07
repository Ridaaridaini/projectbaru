package day9.presentasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2bChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String[] kata = scanner.nextLine().toLowerCase().replace(" ", "").split(""); // [ b, a, i, m]
        Arrays.sort(kata); //[a, b, i, m]

        String hurufVokal = ""; // ai
        String hurufKonsonan = ""; //bm

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equalsIgnoreCase("a")) { //true
                if(i != 0 && !kata[i-1].equalsIgnoreCase("a") ){
                    hurufVokal += "-";
                }
                hurufVokal += kata[i]; // a
            } else if (kata[i].equalsIgnoreCase("i")) { //true

                if(i != 0 && !kata[i-1].equalsIgnoreCase("i")){
                    hurufVokal += "-";
                }
                hurufVokal += kata[i]; // b
            }
            else if (kata[i].equalsIgnoreCase("u")) {

                if(i != 0 && !kata[i-1].equalsIgnoreCase("u")){
                    hurufVokal += "-";
                }
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("e")) {

                if(i != 0 && !kata[i-1].equalsIgnoreCase("e")){
                    hurufVokal += "-";
                }
                hurufVokal += kata[i];
            }
            else if (kata[i].equalsIgnoreCase("o")) {
                if(i != 0 && !kata[i-1].equalsIgnoreCase("o")){
                    hurufVokal += "-";
                }
                hurufVokal += kata[i];
            }

            if(!"aiueo".contains(kata[i])){
                if(i != 0 && !kata[i].equalsIgnoreCase(kata[i-1])){
                    hurufKonsonan += "-";
                }
                hurufKonsonan += kata[i];
            }
        }

        if(hurufKonsonan.substring(0, 1).equalsIgnoreCase("-")){
            System.out.println("Huruf konsonan: " + hurufKonsonan);
        }
        System.out.println("Huruf vokal: " + hurufVokal); //ai //setiap huruf vokal ganti, dipisahkan oleh strip
         //bm;
    }
}
