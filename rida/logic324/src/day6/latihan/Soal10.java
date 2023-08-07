package day6.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer ketinggian=0, gunung=0, lembah=0;
        System.out.print("Masukkan catatan perjalanan hattori: ");
        String[] catatan = input.nextLine().split("");
        for (int i = 0; i < catatan.length; i++) {
            if (catatan[i].equalsIgnoreCase("n")){
                ketinggian=ketinggian+1;
                if(ketinggian==0){
                    lembah=lembah+1;
                    continue;
                }
            }
            else if (catatan[i].equalsIgnoreCase("t")){
                ketinggian=ketinggian-1;
                if (ketinggian==0){
                    gunung=gunung+1;
                    continue;
                }
            }
        }
        System.out.println("Gunung yang hattori lewati: "+gunung+" dan lembah yang hattori lewati: "+lembah);
    }
}
