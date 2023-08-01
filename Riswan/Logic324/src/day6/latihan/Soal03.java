package day6.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String upKalimat = kalimat.toUpperCase();
        String[] hasil = upKalimat.split(" ");
        for (int i = 0; i < hasil.length; i++) {
//            System.out.println(hasil[i]);
            char char1 = hasil[i].charAt(0);
            System.out.println(char1);
        }
    }
}
