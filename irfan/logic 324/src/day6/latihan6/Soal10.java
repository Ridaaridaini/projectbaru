package day6.latihan6;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        String regexPattern = "[^NT]";
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Langkah :");

        String langkah = in.nextLine();

        langkah = langkah.toUpperCase();

        String result = langkah.replaceAll(regexPattern,"");

        String[] splitResults = result.split("");

        Integer ketinggian = 0;
        Integer gunung = 0;
        Integer lembah = 0;

        for (String character : splitResults){
            if (character.equals("N")){
                ketinggian = ketinggian +1;
                gunung = gunung +1;
            }else {
                ketinggian = ketinggian -1;
                lembah = lembah + 1;
            }
        }

        System.out.println("langkah Yang digunakan = "+result +" Jumlah Gunung yang di lalui = "+gunung+" , lembah yang di lewati = "+lembah+" dan ketinggian saat ini = "+ ketinggian );

    }
}
