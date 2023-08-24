package simulasiFT1;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Rute = ");
        String rute = input.nextLine();

        String[ ] arrRute = rute.split(" ");

        int ketinggian = 0;
        int gunung = 0;
        int lembah = 0;

        for (int i = 0; i < arrRute.length; i++) {

            String aksi = arrRute[i];

            if(aksi.equalsIgnoreCase("N")){

                ketinggian = ketinggian + 1;

                if(ketinggian == 0){

                    lembah = lembah + 1;
                }


            } else if(aksi.equalsIgnoreCase("T")){

                ketinggian = ketinggian - 1;

                if(ketinggian == 0){

                    gunung = gunung + 1;

                }
            }

        }
        System.out.println("Jumlah Gunung = " + gunung + " dan Jumlah Lembah = " + lembah);

    }
}
