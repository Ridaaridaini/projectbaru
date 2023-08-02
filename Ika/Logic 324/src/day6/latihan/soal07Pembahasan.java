package day6.latihan;

import java.util.Scanner;

public class soal07Pembahasan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("kalimat: ");
        String kalimat = scanner.nextLine();
        kalimat =kalimat.replace(" ","");
        kalimat = kalimat.toLowerCase();

        String unik="";
        String[] arrKalimat = kalimat.split("");
        for (int i = 0; i < arrKalimat.length; i++) {
            String huruf = arrKalimat[i];
            if(!unik.contains(huruf)){
                unik= unik + huruf;
            }
        }
        System.out.println(unik);
        System.out.println(unik.length());

    }
}
