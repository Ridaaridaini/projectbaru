package latihanFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal12 {

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
                hurufVokal = hurufVokal + kata[i];
            }
            else if(kata[i].equalsIgnoreCase("i")){
                hurufVokal = hurufVokal + kata[i];
            }
            else if(kata[i].equalsIgnoreCase("u")) {
                hurufVokal = hurufVokal + kata[i];
            }
            else if(kata[i].equalsIgnoreCase("e")) {
                hurufVokal = hurufVokal + kata[i];
            }
            else if(kata[i].equalsIgnoreCase("o")) {
                hurufVokal = hurufVokal + kata[i];
            }
            else{
            hurufKonsonan = hurufKonsonan + kata[i];
            }
        }
        System.out.println("Huruf Vokal : " + hurufVokal);
        System.out.print("Huruf Konsonan : " + hurufKonsonan);







    }
}
