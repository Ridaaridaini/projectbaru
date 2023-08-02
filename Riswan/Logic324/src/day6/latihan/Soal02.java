package day6.latihan;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hasil1 = "";

        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String[] hasil = kalimat.split(" ");
        for (int i = 0; i < hasil.length; i++) {
            hasil1 = hasil1 +hasil[i];;
        }

        String[] hasilKalimat = hasil1.split("");

        for (int i = 0; i < hasilKalimat.length; i++) {
            System.out.println(hasilKalimat[i]);
        }
    }
}
