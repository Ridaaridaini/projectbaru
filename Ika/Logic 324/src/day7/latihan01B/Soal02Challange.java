package day7.latihan01B;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02Challange {
    public static void main(String[] args) {

        //memberikan "-" untuk setiap huruf yang sama misal aaee jadi aa-ee, aeii a-e-ii
        Scanner scanner = new Scanner(System.in);
        System.out.print("input kalimat: ");
        String n =scanner.nextLine();
        String vokal="";
        String konsonan="";
        String hasil1 = "";

        n=n.toLowerCase();
        String[] arrN = n.replace(" ","").split("");
        Arrays.sort(arrN);//mensort string yang yang sudah diubah kedalam bentuk array.
        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i].equals("a") || arrN[i].equals("u") || arrN[i].equals("i") || arrN[i].equals("e") || arrN[i].equals("o")){
                vokal=vokal+arrN[i];

            } else if (!(arrN[i].equals("a") || arrN[i].equals("u") || arrN[i].equals("i") || arrN[i].equals("e") || arrN[i].equals("o"))) {
                konsonan=konsonan+arrN[i];
//                System.out.print(konsonan);
            }
        }



        String[] arrVok = vokal.split("");
        String[] arrkons = konsonan.split("");
        for (int i = 1; i < arrVok.length; i++) {
            if(!arrVok[i-1].equalsIgnoreCase(arrVok[i])){
                System.out.print(arrVok[i-1]+ "-" + arrVok[i]);
            }else {
                System.out.print(arrVok[i]);
            }
        }

        System.out.println();
        for (int i = 1; i < arrkons.length; i++) {
            if(!arrkons[i-1].equalsIgnoreCase(arrkons[i])){
                System.out.print(arrkons[i-1] + "-" + arrkons[i]);
            }else {
                System.out.print(arrkons[i]);
            }
        }


    }
}
