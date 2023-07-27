package day2.latihan2;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        //Musim	Hari	Kegiatan
        //Hujan	Libur	Rehat di rumah
        //Hujan	Kerja	Pasrah aj deh
        //Panas	Libur	Jalan-jalan ke pantai
        //Panas	Kerja	Hangout bareng teman kantor

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan musim: ");
        String m = scan.nextLine();
        m.equalsIgnoreCase(m);

        System.out.print("masukan hari: ");
        String h= scan.nextLine();

        scan.close();
        if(m.equalsIgnoreCase("Hujan") && h.equalsIgnoreCase("Libur")){
            System.out.println("Rehat di rumah");
        } else if (m.equalsIgnoreCase("Hujan") && h.equalsIgnoreCase("Kerja")) {
            System.out.println("Pasrah aja deh");
        } else if (m.equalsIgnoreCase("Panas") && h.equalsIgnoreCase("Libur")) {
            System.out.println("Jalan-jalan ke pantai");
        } else if (m.equalsIgnoreCase("Panas") && h.equalsIgnoreCase("Kerja")) {
            System.out.println("Hangout bareng teman kantor");
        }

    }
}
