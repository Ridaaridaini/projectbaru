package day6StringManipulation.latihan6;

import java.util.Scanner;

public class Soal4CetakAwalanAkhirandanBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan kalimat: ");
        char huruf = 'a';
        String kalimat = input.nextLine();
        String [] arrKalimat= kalimat.split(" ");
        for (int i = 0; i < arrKalimat.length; i++) {
            String kapital = arrKalimat[i].toUpperCase();
            huruf = kapital.charAt(0);
            System.out.print(huruf);

            for (int j = 0; j < arrKalimat[i].length(); j++) {
                System.out.print("*");

            }
            char simpan = kapital.charAt(arrKalimat[i].length()-1);
            System.out.println(simpan);
            System.out.println();

        }

    }



}

