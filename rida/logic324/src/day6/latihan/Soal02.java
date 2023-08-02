package day6.latihan;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kalimat? ");
        String kalimat = input.nextLine();
        String kata= kalimat.replace(" ","");
        for (int i = 0; i < kata.length(); i++) {
           char kalimatChar = kata.charAt(i);
           System.out.println(kalimatChar);
            }

        }
    }


