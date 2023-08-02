package day6.latihan6;

import java.util.Scanner;

public class PembahasanSoal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalimat :");
        String kalimat = scanner.next();
        kalimat = kalimat.replace(" ","");
        kalimat = kalimat.toLowerCase();

        String unik = "";

        String [] arrKalimat = kalimat.split(" ");
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
