package day6.latihan6;

import java.util.Scanner;

public class PembahasanSoal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalimat :");
        String kalimat = scanner.nextLine();

        String unik = "";
        String kalimatr = kalimat.replace(" ","");

        String [] arrKalimat = kalimatr.split("");
        for (int i = 0; i < arrKalimat.length; i++) {
//            String huruf = arrKalimat[i];
            if(!unik.contains(arrKalimat[i])){
                unik = unik + arrKalimat[i];
            }

        }
        System.out.println(unik);
        System.out.println(unik.length());

    }
}
