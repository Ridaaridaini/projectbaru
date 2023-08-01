package day6.latihan;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {
        int road = 0, gunung = 0, lembah =0;
        Scanner scanner = new Scanner(System.in);

        String naikTurun = scanner.nextLine();

        naikTurun = naikTurun.replace(" ", "");

        String[] arrNaikTurun = naikTurun.split("");

        for (int i = 0; i < arrNaikTurun.length; i++) {

            if (arrNaikTurun[i].equalsIgnoreCase("N")){
                road = road+1;

                if (road == 0){
                    lembah = lembah +1;
                }

            } else if (arrNaikTurun[i].equalsIgnoreCase("T")) {
                road = road-1;

                if (road == 0){
                    gunung = gunung +1;
                }
            }



        }

        System.out.println("Gunung: " + gunung);
        System.out.println("Lembah: " + lembah);

    }

}
