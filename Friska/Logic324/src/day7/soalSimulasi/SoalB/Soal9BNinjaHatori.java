package day7.soalSimulasi.SoalB;

import java.util.Scanner;

public class Soal9BNinjaHatori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan inputan: ");
        String inputan = input.nextLine();

        String[] arrInputan = inputan.split("");

        int gunung = 0;
        int lembah = 0;
        int ketinggian = 0;

        for (int i = 0; i < arrInputan.length; i++) {
            String jalan = arrInputan[i];
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
            }System.out.println("gunung "+gunung+ "lembah "+lembah);

        }

    }

