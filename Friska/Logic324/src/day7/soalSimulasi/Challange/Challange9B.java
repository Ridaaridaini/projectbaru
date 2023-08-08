package day6.latihan;

import java.util.Scanner;

public class Challange9B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input : ");
        String input = scanner.nextLine();

        String[] arrInput = input.split(" ");

        int ketinggian = 0;//1 0 -1 0 1 2
        int gunung = 0;//1
        int lembah = 0;//1

        for (int i = 0; i < arrInput.length; i++) {
            String aksi = arrInput[i]; //N
            if (aksi.equals("N")){

                ketinggian = ketinggian + 1;
                if (ketinggian == 0){
                    lembah = lembah + 1;
                }
            } else if(aksi.equals("T")){

                ketinggian = ketinggian - 1;
                if (ketinggian == 0){
                    gunung = gunung + 1;
                }
            }
        }

        System.out.println("Gunung : " + gunung +",Lembah : " + lembah);


    }
}
