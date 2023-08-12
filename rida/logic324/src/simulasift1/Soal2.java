package simulasift1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan catatan perjalan sasuke: ");
        String[] catatan=input.nextLine().split("");
        Integer gunung=0,lembah=0, ketinggian=0;
        for (int i = 0; i < catatan.length; i++) {
            if(catatan[i].equalsIgnoreCase("N")){
                ketinggian=ketinggian+1;
                if (ketinggian==0){
                    lembah=lembah+1;
                }
            }
            if (catatan[i].equalsIgnoreCase("T")){
                ketinggian=ketinggian-1;
                if(ketinggian==0){
                    gunung=gunung+1;
                }
            }
        }
        System.out.println("Gunung yang telah dilewati sasuke = "+gunung);
        System.out.println("dan lembah yang telah dilewati sasuke = "+lembah);
    }
}
