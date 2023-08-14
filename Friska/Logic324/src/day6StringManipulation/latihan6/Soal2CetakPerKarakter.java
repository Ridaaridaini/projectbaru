package day6StringManipulation.latihan6;

import java.util.Scanner;

public class Soal2CetakPerKarakter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        kalimat = kalimat.replace(" ","");
        System.out.println(kalimat);
        String [] arrKalimat =  kalimat.split("");
        for (int i = 0; i < arrKalimat.length; i++) {
            System.out.println(arrKalimat[i]);

        }




    }
}
