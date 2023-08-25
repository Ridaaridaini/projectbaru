package simulasi;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input : ");
        String input = scanner.nextLine();

        String[] arrInput = input.split(" ");

        int ketinggian = 0;
        int gunung = 0;
        int lembah = 0;

        for (int i = 0; i < arrInput.length; i++) {
            String mencari  = arrInput[i];
            if(mencari.equals("N")){

                ketinggian = ketinggian + 1;
                if (ketinggian == 0){
                    lembah = lembah + 1;
                }
            } else if (mencari.equals("T")) {

                ketinggian = ketinggian - 1;
                if (ketinggian == 0){
                    gunung = gunung + 1;
                }

            }

        }
        System.out.println("Gunung : "+gunung +",Lembah : "+lembah);
    }
}
