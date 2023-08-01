package day6.latihan6;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan kalimat: ");
        String kalimat = input.nextLine();

        String unik = "";

        String kalRep = kalimat.replace(" ", "");
//        System.out.println(kalRep);

        String[] kalRepSplit = kalRep.split("");
        for (int i = 0; i < kalRepSplit.length; i++) {
//            System.out.println(kalRepSplit[i]);
//            unik = unik + kalRepSplit[i];
            if (!unik.contains(kalRepSplit[i])){
//
                unik = unik + kalRepSplit[i];
//                System.out.println(unik);
        }


//            System.out.println(unik);
    }
        System.out.println(unik);
        System.out.println(unik.length()+ " karater");

}
}


//        System.out.println(ka.length());


