package day6.latihan6;

import java.util.Scanner;

public class PembahasanNo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input");
        String input = scanner.nextLine();

        String[] arrInput = input.split("");

        int ketinggian = 0;
        int gunung = 0;
        int lembah = 0;

        for (int i = 0; i < arrInput.length; i++) {
            String aksi = arrInput[i];
            if (aksi.equals("N")){
                //Naik
                ketinggian = ketinggian + 1;
                if(ketinggian == 0){
                    lembah = lembah + 1;
                }else if(aksi.equals("T")){
                    //Turun
                    ketinggian = ketinggian-1;
                    if(ketinggian==0){
                        gunung = gunung + 1;
                    }
                }
            }


        }System.out.println("gunung"+gunung+"lembah"+lembah);
    }
}
