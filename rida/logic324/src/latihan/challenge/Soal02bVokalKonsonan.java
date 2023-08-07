package latihan.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02bVokalKonsonan {
    public static void main(String[] args) {
        char a='a', i='i',u='u',e='e',o='o';
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String[] kata=input.nextLine().toLowerCase().replace(" ","").split("");
        Arrays.sort(kata);
        String vokal="",konsonan="";
        for (int j = 0; j < kata.length; j++) {
            char tmp=kata[j].charAt(0);
            if(tmp==a||tmp==i || tmp==u|| tmp==e ||tmp==o){
                vokal=vokal+String.valueOf(kata[j].charAt(0));
                continue;
            }else {
                konsonan=konsonan+String.valueOf(kata[j].charAt(0));
                continue;
            }
        }
        //System.out.println("Huruf vokal : "+vokal);
        String[] banding=vokal.split("");
        for (int b = 1; b < banding.length; b++) {
            if (!banding[b-1].equalsIgnoreCase(banding[b])){
                System.out.print(banding[b-1]+"-"+banding[b]);
            }else
            System.out.print(banding[b]);
        }
        System.out.println();
        String[] banding1=konsonan.split("");
        for (int b = 0; b < banding1.length-1; b++) {
            if (b==0) {
                System.out.print(banding1[b]);
            } else if (!banding1[b-1].equalsIgnoreCase(banding1[b])){
                System.out.print("-"+banding1[b]);
            }else
                System.out.print(banding[b]);
        }
        System.out.println();
    }
}
