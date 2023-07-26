package day2.latihan2;

import day1.Input;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

        String hujan ="hujan";
        String panas ="panas";
        String kerja ="kerja";
        String libur ="Libur";

        Scanner input = new Scanner(System.in);
        System.out.print("Musim = ");
        String musim = input.nextLine();

        System.out.print("Hari = ");
        String hari = input.nextLine();



        if(musim.equalsIgnoreCase(hujan) && hari.equalsIgnoreCase(libur)){
            System.out.println("Rehat dirumah");

        }else if(musim.equalsIgnoreCase(hujan) && hari.equalsIgnoreCase(kerja)){
            System.out.println("pasrah aj deh");

        }else if(musim.equalsIgnoreCase(panas) && hari.equalsIgnoreCase(libur)){
            System.out.println("jalan-jalan ke pantai");

        }else if(musim.equals(panas) && hari.equalsIgnoreCase(kerja)){
            System.out.println("Hangout bareng teman kantor");

        }else{
            System.out.println("invalid");
        }
    }
}



