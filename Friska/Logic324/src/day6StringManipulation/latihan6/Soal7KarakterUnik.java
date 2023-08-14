package day6StringManipulation.latihan6;

import java.util.Scanner;

public class Soal7KarakterUnik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String unik= "";

        String kalReplace = kalimat.replace(" ","");

        String [] kalRepSplit = kalReplace.split("");
        for (int i = 0; i < kalRepSplit.length; i++) {
            if(!unik.contains(kalRepSplit[i])){
                unik = unik + kalRepSplit[i];
            }

        }
        System.out.println(unik);
        System.out.println(unik.length());

        }


    }

