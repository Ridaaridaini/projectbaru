package day7.latihan01B;

import java.util.Arrays;
import java.util.Scanner;

public class soal02PemChallange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input kalimat: ");
        String n =scanner.nextLine();
        String vokal="";
        String konsonan="";

        n=n.toLowerCase();
        String[] arrN = n.replace(" ","").split("");
        Arrays.sort(arrN);//mensort string yang yang sudah diubah kedalam bentuk array.
        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i].equals("a") || arrN[i].equals("u") || arrN[i].equals("i") || arrN[i].equals("e") || arrN[i].equals("o")){
               if(!vokal.contains(arrN[i])){
                   if(vokal.length()>0){
                       vokal+="-";
                   }
               }
                vokal=vokal+arrN[i];

            } else if (!(arrN[i].equals("a") || arrN[i].equals("u") || arrN[i].equals("i") || arrN[i].equals("e") || arrN[i].equals("o"))) {
                if(!konsonan.contains(arrN[i])){
                    if(konsonan.length()>0){
                        konsonan+="-";
                    }
                }
                konsonan=konsonan+arrN[i];
            }

        }

        System.out.print("huruf vokal :" + vokal + " ");
        System.out.println();
        System.out.print("huruf konsonan :" + konsonan + " ");


    }
}
