package latihan;

import java.util.Scanner;

public class Gunung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input : ");
        String input = scanner.nextLine(); //"N T T N N N"

        String[] arrInput = input.split(" "); //{"N","T","T","N","N","N"}

        int ketinggian = 0;//1 0 -1 0 1 2
        int gunung = 0;//1
        int lembah = 0;//1

        for (int i = 0; i < arrInput.length; i++) {//i = 0,1,2,3,4,5,6 | arrInput.length = 6
            String aksi = arrInput[i]; //N
            if (aksi.equals("N")){
                //Naik
                ketinggian = ketinggian + 1;
                if (ketinggian == 0){
                    lembah = lembah + 1;
                }
            } else if(aksi.equals("T")){
                //Turun
                ketinggian = ketinggian - 1;
                if (ketinggian == 0){
                    gunung = gunung + 1;
                }
            }
        }

        System.out.println("Gunung : " + gunung +",Lembah : " + lembah);


    }
 }

