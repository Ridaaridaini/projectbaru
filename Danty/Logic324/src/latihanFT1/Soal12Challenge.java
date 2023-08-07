package latihanFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal12Challenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String kalimat = input.nextLine();


        String[] kata = kalimat.toLowerCase().replace(" ", "").split("");
        Arrays.sort(kata);

        String hurufVokal = "";
        String hurufKonsonan = "";

        for (int i = 0; i < kata.length; i++) {

            if(kata[i].equalsIgnoreCase("a")){
                if(!hurufVokal.contains(kata[i])) {
                    if(hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal = hurufVokal + kata[i];
            }
            else if(kata[i].equalsIgnoreCase("i")){
                if(!hurufVokal.contains(kata[i])) {
                    if(hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal = hurufVokal + kata[i];
            }
            else if(kata[i].equalsIgnoreCase("u")) {

                if(!hurufVokal.contains(kata[i])) {

                    if(hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal = hurufVokal + kata[i];
            }
            else if(kata[i].equalsIgnoreCase("e")) {

                if(!hurufVokal.contains(kata[i])) {

                    if(hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal = hurufVokal + kata[i];
            }
            else if(kata[i].equalsIgnoreCase("o")) {

                if(!hurufVokal.contains(kata[i])) {
                    if(hurufVokal.length()>0) {
                        hurufVokal += "-";
                    }
                }
                hurufVokal = hurufVokal + kata[i];
            }
            else{

                if(!hurufKonsonan.contains(kata[i])) {
                    if(hurufKonsonan.length()>0) {
                        hurufKonsonan += "-";
                    }
                }
                hurufKonsonan = hurufKonsonan + kata[i];
            }
        }
        System.out.println("Huruf Vokal : " + hurufVokal);
        System.out.print("Huruf Konsonan : " + hurufKonsonan);

    }
}
