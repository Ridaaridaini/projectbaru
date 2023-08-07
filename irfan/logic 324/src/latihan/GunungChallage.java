package latihan;

import java.util.Scanner;

public class GunungChallage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input : ");
        String input = scanner.nextLine();

        String[] arrInput = input.split(" ");

        int ketinggian = 1;
        int gunung = -1;
        int lembah = 0;

        for (int i = 0; i < arrInput.length; i++) {
            String mencari = arrInput[i];
            if (mencari.equals("N")){
                // Buat Naik
                ketinggian = ketinggian + 1;
                if (ketinggian == 0){
                    lembah = lembah + 1;
                }
            } else if(mencari.equals("T")){
                // Buat Turun
                ketinggian = ketinggian - 1;
                if (ketinggian == 0){
                    gunung = gunung + 1;
                }
            }
        }

        if(gunung<0){
            gunung =0;
        }

        System.out.println("Gunung = " + gunung +",Lembah = " + lembah);

    }
 }

