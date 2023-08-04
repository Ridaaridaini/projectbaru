package day7.latihan01B;

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
        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i].equals("a") || arrN[i].equals("u") || arrN[i].equals("i") || arrN[i].equals("e") || arrN[i].equals("o")){
                vokal=vokal+arrN[i];
//                System.out.println(vokal);
            } else if (!(arrN[i].equals("a") || arrN[i].equals("u") || arrN[i].equals("i") || arrN[i].equals("e") || arrN[i].equals("o"))) {
                konsonan=konsonan+arrN[i];
//                System.out.print(konsonan);
            }

        }

        System.out.print("huruf vokal :" + vokal + " ");
        System.out.println();
        System.out.print("huruf konsonan :" + konsonan + " ");


    }
}
