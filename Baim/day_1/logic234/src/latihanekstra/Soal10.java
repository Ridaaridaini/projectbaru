package latihanekstra;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hurufKonsonan = "";
        String hurufVokal = "";
        
        System.out.println("Masukkan karakter");
        String[] kata = scanner.nextLine().replace(" ", "").toLowerCase().split("");
        Arrays.sort(kata);

        for (int i = 0; i < kata.length; i++) {
            if("aiueo".contains(kata[i])){
                hurufVokal += kata[i];
            } else {
                hurufKonsonan += kata[i];
            }
        }

        System.out.println("Huruf Vokal: " + hurufVokal);
        System.out.println("Huruf Konsonan: " + hurufKonsonan);

    }
}
