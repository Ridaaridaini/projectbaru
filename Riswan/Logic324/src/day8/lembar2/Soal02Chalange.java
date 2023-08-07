package day8.lembar2;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02Chalange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat : ");
        String kalimat = input.nextLine().replace(" ","");
        String[] kalimat1 = kalimat.split("");
        Arrays.sort(kalimat1);
        String vokal = "";
        String konsonan="";

        for (int i = 0; i < kalimat1.length; i++) {
            if(kalimat1[i].equalsIgnoreCase("a")){
                if(i !=0 && !kalimat1[i-1].equalsIgnoreCase(kalimat1[i])){
                    vokal = vokal+" - ";
                }else {
                    vokal = vokal+kalimat1[i];
                }
            }else if(kalimat1[i].equalsIgnoreCase("i")){
                if(i !=0 && !kalimat1[i-1].equalsIgnoreCase(kalimat1[i])){
                    vokal = vokal+" - ";
                }
                vokal = vokal+kalimat1[i];

            }else if(kalimat1[i].equalsIgnoreCase("u")){
                if(i !=0 && !kalimat1[i-1].equalsIgnoreCase(kalimat1[i])){
                    vokal = vokal+" - ";
                }
                vokal = vokal+kalimat1[i];

            }else if(kalimat1[i].equalsIgnoreCase("e")){
                if(i !=0 && !kalimat1[i-1].equalsIgnoreCase(kalimat1[i])){
                    vokal = vokal+" - ";
                }
                vokal = vokal+kalimat1[i];

            }else if(kalimat1[i].equalsIgnoreCase("o")){
                if(i !=0 && !kalimat1[i-1].equalsIgnoreCase(kalimat1[i])){
                    vokal = vokal+" - ";
                }
                vokal = vokal+kalimat1[i];
            }else {
                konsonan = konsonan+kalimat1[i];
            }

        }
        System.out.println("Huruf Vokal : "+vokal);
        String[] konsonanArray = konsonan.split("");
        konsonan = "";
        for (int i = 0; i < konsonanArray.length; i++) {
            if(i !=0 && !konsonanArray[i-1].equalsIgnoreCase(konsonanArray[i])){
                konsonan = konsonan+" - ";
            }
            konsonan = konsonan+konsonanArray[i];
        }
        System.out.println("Huruf konsonan : "+konsonan);
    }
    }

