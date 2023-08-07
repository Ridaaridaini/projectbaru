package day9.presentasibahas;

import java.util.Scanner;

public class Soal9BChallenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input : ");
        String n = input.nextLine(); //

        String[] arrInput = n.split(" ");

        int ketinggian = 1;
        int gunung = -1;
        int lembah = 0;

        for (int i = 0; i < arrInput.length; i++) {
            String aksi = arrInput[i];
            if (aksi.equals("N")) {
                //Naik
                ketinggian = ketinggian + 1;
                if (ketinggian == 0) {
                    lembah = lembah + 1;

                }
            } else if (aksi.equals("T")) {
                //Turun
                ketinggian = ketinggian - 1;
                if (ketinggian == 0) {
                    gunung = gunung + 1;
                }
            }

        }
        if (gunung < 0){
            gunung = 0;
        }
        System.out.print("Jumlah Gunung = " + gunung + ", Jumlah Lembah = " + lembah);
    }
}
