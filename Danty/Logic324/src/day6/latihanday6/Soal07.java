package day6.latihanday6;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String kalimat = input.nextLine();//Halo Apa Kabarmu?

        kalimat = kalimat.replace(" ","");//HaloApaKabarmu?
        kalimat= kalimat.toLowerCase();//

        String unik = "";

        String [] arrKalimat = kalimat.split("");
        for (int i = 0; i < arrKalimat.length; i++) {
            String huruf = arrKalimat[i];
            if(!unik.contains(huruf)){
                unik = unik + huruf;
            }

        }
        System.out.println(unik);
        System.out.println(unik.length());



    }
}
