package day6.latihan;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("imput kata");
        String kataX= input.nextLine();
        String[] kata= kataX.replace(" ","").split("");
        //String splitKata= kata.split("");
        String palindrom = "" ;
        for (int i = kata.length-1; i >= 0; i--) {
            palindrom =palindrom+ kata[i];

        }
        if (kataX.replace(" ","").equalsIgnoreCase(palindrom)) {
            System.out.println("kata palindrom");
        }else
            System.out.println("bukan kata palindrom");




    }
}
