package day7.soalSimulasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2BVokalConsonan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kalimat :");
        String kalimat = input.nextLine().toLowerCase();

        String hurufVokal ="aiueo";
        String tampungVokal = "";
        String hurufKonsonan = "";

        String tampungVokal2 = "";
        String tampungKonsonan2 = "";

        String [] arrKalimat = kalimat.replace(" ","").split("");
        Arrays.sort(arrKalimat);


        for (int i = 0; i < arrKalimat.length; i++) {
            if(hurufVokal.contains(arrKalimat[i])){
                tampungVokal += arrKalimat[i];
                tampungVokal2 = tampungVokal.replace("","-");

            }else {
                hurufKonsonan += arrKalimat[i];
                tampungKonsonan2 = hurufKonsonan.replace("","-");

            }
            
        }
        System.out.println("Vokal " + tampungVokal2);
        System.out.println("Konsonan " + tampungKonsonan2);

    }
}