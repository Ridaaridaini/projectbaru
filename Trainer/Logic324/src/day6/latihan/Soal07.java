package day6.latihan;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String kalimat = scanner.nextLine(); //"Halo Apa Kabarmu?"
        kalimat = kalimat.replace(" ",""); //"HaloApaKabarmu?"
        kalimat = kalimat.toLowerCase();//"haloapakabarmu?"

        String unik = ""; //h, ha, hal, halo,

        String[] arrKalimat = kalimat.split(""); //{h,a,l,o,a,p,a,k,a,b,a,r,m,u,?}
        for (int i = 0; i < arrKalimat.length; i++) {//i = 0, 1, 2, 3, 4, 5
            String huruf = arrKalimat[i]; //a
            if (!unik.contains(huruf)){
                unik = unik + huruf;
            }

        }
        System.out.println(unik);
        System.out.println(unik.length());



    }

}
