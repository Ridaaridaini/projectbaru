package day7.soalSimulasi.Challange;

import java.util.Scanner;

public class Challange9B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input : ");
        String input = scanner.nextLine();

        String[] arrInput = input.split("");

        int ketinggian = -1;
        int gunung = 0;
        int lembah = 0;

        int skip = 1;

        for (int i = 0; i < arrInput.length; i++) {
            String aksi = arrInput[i];
            if (aksi.equalsIgnoreCase("N")) {
                ketinggian = ketinggian + 1;
                if (ketinggian == 0) {
                    if(skip == 1){
                        skip = 0;
                    }else{
                        lembah = lembah + 1;
                    }

                }
            } else if (aksi.equalsIgnoreCase("T")) {
                ketinggian = ketinggian - 1;
                if (ketinggian == 0) {
                    if (skip == 1){
                        skip = 0;
                    }else{
                        gunung = gunung + 1;
                    }

                }
            }
        }
        System.out.println("Gunung : " + gunung + ",Lembah : " + lembah);

    }
}
