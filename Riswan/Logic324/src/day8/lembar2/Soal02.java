package day8.lembar2;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat : ");
        String kalimat = input.nextLine();
        String[] kalimat1 = kalimat.split("");
        String vokal = "";
        String konsonan="";

        for (int i = 0; i < kalimat1.length; i++) {
            if(kalimat1[i].equalsIgnoreCase("a")){
                vokal = vokal+kalimat1[i];
            }else if(kalimat1[i].equalsIgnoreCase("i")){
                vokal = vokal+kalimat1[i];
            }else if(kalimat1[i].equalsIgnoreCase("u")){
                vokal = vokal+kalimat1[i];
            }else if(kalimat1[i].equalsIgnoreCase("e")){
                vokal = vokal+kalimat1[i];
            }else if(kalimat1[i].equalsIgnoreCase("o")){
                vokal = vokal+kalimat1[i];
            }else if(kalimat1[i].equalsIgnoreCase(" ")){
                continue;
            }else {
                konsonan = konsonan+kalimat1[i];
            }
        }
        System.out.println("Huruf Vokal : "+vokal);
        System.out.println("Huruf konsonan : "+konsonan);
    }
}
