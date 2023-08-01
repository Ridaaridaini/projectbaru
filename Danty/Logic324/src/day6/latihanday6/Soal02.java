package day6.latihanday6;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String kalimat = input.nextLine();

        kalimat = kalimat.replace(" ","");
        String[] arrKalimat = kalimat.split("");

        for (int i = 0; i < arrKalimat.length; i++) {
            System.out.println(arrKalimat[i]);

        }

    }
}
