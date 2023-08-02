package day6.latihan;

import java.util.Scanner;

public class soal04Pembahasan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();
        kalimat = kalimat.toUpperCase();
        String[] arrKalimat= kalimat.split(" ");//{"LIV", "RUNGREN", TYLER"}


        for (int i = 0; i < arrKalimat.length; i++) {
            String kata = arrKalimat[i];
            System.out.print(kata.charAt(0));
            for (int j = 0; j < kata.length(); j++) {
                System.out.print("*");
            }
            System.out.println(kata.charAt(kata.length()-1));
        }

    }
}
