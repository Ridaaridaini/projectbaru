package day6.latihan;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("kalimat: ");
        String kalimat = scanner.nextLine();

        String[] replaceSplitKalimat = kalimat.replace(" ", "").split("");

        for (int i = 0; i < replaceSplitKalimat.length; i++) {
            System.out.println(replaceSplitKalimat[i]);
        }

    }

}
