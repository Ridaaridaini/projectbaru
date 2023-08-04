package latihan;

import java.util.Scanner;

public class Soal09part2 {
    public static void main(String[] args) {
        Integer jumN=0, jumT=0,bukit=0;
        String naik="n",turun="t";
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan perjalan hartori: ");
        String[] perjalanan= input.nextLine().replace(" ","").split("");
        for (int i = 0; i < perjalanan.length; i++) {
            if (perjalanan[i].equalsIgnoreCase(naik)){
                bukit=bukit+1;
                if (bukit==0){
                   jumT=jumT+1;
                   continue;
                }
            }else{
                bukit=bukit-1;
                if (bukit==0){
                    jumN=jumN+1;
                    continue;
                }
            }

        }
        System.out.println("Gunung yang telah dilewati hattori ialah: "+jumN);
        System.out.println("Lembah yang telah dilewati hattori adalah: "+jumT);
    }
}
