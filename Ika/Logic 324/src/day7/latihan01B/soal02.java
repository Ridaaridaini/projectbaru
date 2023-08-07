package day7.latihan01B;

import java.util.Arrays;
import java.util.Scanner;

public class soal02 {
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
                vokal=vokal+arrN[i];
//                System.out.println(vokal);
            } else if (!(arrN[i].equals("a") || arrN[i].equals("u") || arrN[i].equals("i") || arrN[i].equals("e") || arrN[i].equals("o"))) {
                konsonan=konsonan+arrN[i];
//                System.out.print(konsonan);
            }

        }

//        //mengurtkan huruf vokal
//        char[] vokChar = vokal.toCharArray();
//        Arrays.sort(vokChar);
//        String sortedChar = new String(vokChar);
//        System.out.println("sorted huruf vokal " + sortedChar);
//
//        //mengurutkan huruf konsonan
//        char[] konsonanChar = konsonan.toCharArray();
//        Arrays.sort(konsonanChar);
//        String sortedKonsonan = new String(konsonanChar);
//        System.out.println("sorted huruf konsonan "+sortedKonsonan);

        System.out.print("huruf vokal :" + vokal + " ");
        System.out.println();
        System.out.print("huruf konsonan :" + konsonan + " ");


    }
}
