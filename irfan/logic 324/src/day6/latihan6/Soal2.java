package day6.latihan6;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inputkan kalimat = ");
        String kalimat = scanner.nextLine();
        kalimat = kalimat.replace(" ", ""); // {irfanafandi}
        for (int i = 0; i < kalimat.length(); i++) {
            System.out.println(kalimat.charAt(i));
        }

    }
}

