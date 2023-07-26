package day2.latihan;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Musim   : ");
        String musim = input.nextLine();
        System.out.println("Hari    : ");
        String hari = input.nextLine();

        if(musim.equalsIgnoreCase("Hujan") && hari.equalsIgnoreCase("Libur")){
            System.out.println("Rehat di Rumah");
        } else if (musim.equalsIgnoreCase("Hujan") && hari.equalsIgnoreCase("Kerja")) {
            System.out.println("Pasrah aja deh");
        } else if (musim.equalsIgnoreCase("Panas") && hari.equalsIgnoreCase("Libur")) {
            System.out.println("jalan-jalan ke pantai");
        } else if (musim.equalsIgnoreCase("Panas") && hari.equalsIgnoreCase("Kerja")) {
            System.out.println("Hangout bareng teman kantor");
        }else {
            System.out.println("input yang anda masukkan salah");
        }
    }
}
