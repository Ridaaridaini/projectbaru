package day6.latihan6;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan kalimat: ");
        String str = input.nextLine();;

        String strReplace = str.replace(" ", "");

        String[] strKalimat = strReplace.split("");
        for (int i = 0; i < strKalimat.length; i++) {
            System.out.println(strKalimat[i]);

        }
    }
}

