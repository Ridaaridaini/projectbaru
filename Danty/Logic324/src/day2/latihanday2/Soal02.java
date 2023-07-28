package day2.latihanday2;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Musim : ");
        String musim = input.nextLine();

        System.out.print("Hari : ");
        String hari = input.nextLine();

        if(musim.equalsIgnoreCase("Hujan") && hari.equalsIgnoreCase("Libur")){
            System.out.println("Rehat di rumah");
        }
        else if(musim.equalsIgnoreCase("Hujan") && hari.equalsIgnoreCase("Kerja")){
            System.out.println("Pasrah aj deh");
        }
        else if(musim.equalsIgnoreCase("Panas") && hari.equalsIgnoreCase("Libur")){
            System.out.println("Jalan-jalan ke pantai");
        }
        else if(musim.equalsIgnoreCase("Panas") && hari.equalsIgnoreCase("Kerja")){
            System.out.println("Hangout bareng teman kantor");

        }

    }
}
