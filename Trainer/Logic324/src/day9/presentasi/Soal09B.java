package day9.presentasi;

import java.util.Scanner;

public class Soal09B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kalimat : ");//nttnn
        String kalimat = input.nextLine();
        String[] jumlahChar = kalimat.split(" ");
        int ketinggian=0;//1,0,-1,0,1
        int gunung=0;//1
        int lembah=0;//1
        for (int i = 0; i < jumlahChar.length; i++) {//i=0,1,2,3,4
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
        System.out.println("ketinggian : " + ketinggian);//1
        System.out.println("lembah : " + lembah);//1
        System.out.println("Gunung : " + gunung);//1
    }
}
