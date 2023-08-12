package day6.latihan6;

import java.util.Scanner;

public class Soal10NinjaHatori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String inputan = input.nextLine();

        String[] arrInput = inputan.split(" ");

        int ketinggian = 0;
        int gunung = 0;
        int lembah = 0;


        for (int i = 0; i < arrInput.length; i++) {
            String jalan = arrInput[i];
            if (jalan.equalsIgnoreCase("N")) {
                ketinggian = ketinggian + 1;
                if (ketinggian == 0) {
                    lembah = lembah + 1;
                }
            } else if (jalan.equalsIgnoreCase("T")) {
                ketinggian = ketinggian - 1;
                if (ketinggian == 0) {
                    gunung = gunung + 1;

                }
            }
        }System.out.println("gunung " + gunung + "lembah " + lembah);

    }

}
