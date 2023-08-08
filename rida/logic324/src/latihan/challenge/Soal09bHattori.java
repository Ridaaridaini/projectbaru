package latihan.challenge;

import java.util.Scanner;

public class Soal09bHattori {
    public static void main(String[] args) {
        Integer jumN=0, jumT=0,ketinggian=1;
        String naik="n",turun="t";
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan perjalan hartori: ");//NTTNN
        String[] perjalanan= input.nextLine().replace(" ","").split("");
        for (int i = 0; i < perjalanan.length; i++) {
            if (perjalanan[i].equalsIgnoreCase(naik)){
                ketinggian=ketinggian+1;
                if (ketinggian==0){
                    jumT=jumT+1;//LEMBAH1
                    continue;
                }
            }else{
                ketinggian=ketinggian-1;
                if (ketinggian==0){
                    jumN=jumN+1;//GUNUNG1
                    continue;
                }
            }

        }
        if (jumT-1<0){
            jumT=0;
        }
        System.out.println("Gunung yang telah dilewati hattori ialah: "+(jumN-1));
        System.out.println("Lembah yang telah dilewati hattori adalah: "+(jumT));
    }
}
