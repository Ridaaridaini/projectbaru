package latihanB;

import java.util.Scanner;

public class Soal9Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input: ");
        String naikTurun = input.nextLine();

        String[] turunNaik = naikTurun.split(" ");
        int ketinggian = 0;
        int gunung = -1;
        int lembah = 0;

        for (int i = 0; i < turunNaik.length; i++) {
            String aksi = turunNaik[i];

            if(aksi.equalsIgnoreCase("N")){
                ketinggian = ketinggian + 1;

                if(ketinggian==0){
                    lembah = lembah + 1;
                }
            } else if (aksi.equalsIgnoreCase("T")) {
                ketinggian = ketinggian - 1;

                if(ketinggian==0){
                    gunung = gunung + 1;
                }
            }
        }
        System.out.println("gunung : "+gunung + " lembah: "+lembah);
    }
}
