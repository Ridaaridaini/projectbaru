package day6.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String[] jumlahChar = kalimat.split("");
        int ketinggian=0;
        int gunung=0;
        int lembah=0;
        for (int i = 0; i < jumlahChar.length; i++) {
            if(jumlahChar[i].equalsIgnoreCase("n")){
                ketinggian = ketinggian +1;
                if (ketinggian ==0){
                    lembah =lembah +1;
                }
            } else if (jumlahChar[i].equalsIgnoreCase("t")) {
                ketinggian = ketinggian -1;
                if (ketinggian ==0){
                    gunung =gunung +1;
                }
            }

        }
        System.out.println("ketinggian : " + ketinggian);
        System.out.println("lembah : " + lembah);
        System.out.println("Gunung : " + gunung);
    }
}
