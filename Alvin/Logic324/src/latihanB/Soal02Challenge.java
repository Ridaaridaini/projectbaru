package latihanB;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02Challenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input n: ");
        String n = scanner.nextLine();

        String[] arrN = n.toLowerCase().replace(" ", "").split("");

        Arrays.sort(arrN);
        String vokalList = "aiueo";
        String vokal = "";
        String konsonan = "";

        for (int i = 0; i < arrN.length; i++) {
            if (vokalList.contains(arrN[i])){
                if (!vokal.contains(arrN[i])){
                    if (vokal.length() > 0){
                        vokal += "-";
                    }
                }
                vokal += arrN[i];
            }else {
                if (!konsonan.contains(arrN[i])){
                    if (konsonan.length() > 0){
                        konsonan += "-";
                    }
                }
                konsonan += arrN[i];
            }
        }

        System.out.println("Vokal: " + vokal); //setiap huruf vokal ganti dipisah oleh strip
        System.out.println("Konsonan: " + konsonan);

//        String[] arrVokal = vokal.split("");
//        String[] arrKonsonan = konsonan.split("");
//
//        System.out.print("Vokal: "); //setiap huruf vokal ganti dipisah oleh strip
//        for (int i = 0; i < arrVokal.length; i++) {
//                if (i < arrVokal.length-1 && !arrVokal[i].equals(arrVokal[i+1])){
//                    System.out.print(arrVokal[i] + "-");
//                }else {
//                    System.out.print(arrVokal[i]);
//                }
//        }
//
//        System.out.println();
//
//        System.out.print("Konsonan: ");
//        for (int i = 0; i < arrKonsonan.length; i++) {
//            if (i < arrKonsonan.length-1 && !arrKonsonan[i].equals(arrKonsonan[i+1])){
//                System.out.print(arrKonsonan[i] + "-");
//            }else {
//                System.out.print(arrKonsonan[i]);
//            }
//        }


    }

}
