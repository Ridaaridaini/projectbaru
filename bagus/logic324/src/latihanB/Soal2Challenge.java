package latihanB;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan kata: ");
        String kata = input.nextLine();

        String[] vokal = {"a", "i", "u", "e", "o"};
        String[] konsonan = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        String kataReplace = kata.replace(" ", "");
        String[] kataSplit = kataReplace.split("");
        Arrays.sort(kataSplit);

        String hurufVokal = "";
        String hurufKonsonan = "";

//        String[] hurufVokalSplit = hurufVokal.split("");
////        Arrays.sort(hurufVokalSplit);
//        String[] hurufKonsonanSplit = hurufKonsonan.split("");
////        Arrays.sort(hurufKonsonanSplit);


        for (int i = 0; i < kataSplit.length; i++) {
            for (int j = 0; j < vokal.length; j++) {
                if(kataSplit[i].equalsIgnoreCase(vokal[j])){
                    if (!hurufVokal.contains(kataSplit[i])){
                        if (hurufVokal.length()>0){
                            hurufVokal += "-";
                        }
                    }
                    hurufVokal = hurufVokal + kataSplit[i];
                }
            }
        }


        for (int i = 0; i < kataSplit.length; i++) {
            for (int j = 0; j < konsonan.length; j++) {
                if (kataSplit[i].equalsIgnoreCase(konsonan[j])) {
                    if (!hurufKonsonan.contains(kataSplit[i])){
                        if (hurufKonsonan.length()>0){
                            hurufKonsonan += "-";
                        }
                    }
                    hurufKonsonan = hurufKonsonan + kataSplit[i];

                }
            }
        }




        System.out.print("hurus vokal: " + hurufVokal.toLowerCase());
        System.out.println();
        System.out.print("huruf konsonan: " + hurufKonsonan.toLowerCase());
    }
}
