package latihanday2;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner musim = new Scanner(System.in);
        System.out.print("musim= ");
        String m = musim.nextLine();

        Scanner hari = new Scanner(System.in);
        System.out.print("hari= ");
        String h = hari.nextLine();

        String kegiatan1 = "Rehat dirumah";
        String kegiatan2 = "Pasrah aja deh";
        String kegiatan3 = "Jalan jalan ke pantai";
        String keigiatan4 = "Hangout bareng temen kantor";
        
        if(m.equals("hujan") && h.equals("libur")){
            System.out.println(kegiatan1);
        } else if (m.equals("hujan") && h.equals("kerja")) {
            System.out.println(kegiatan2);
        } else if (m.equals("panas") && h.equals("libur")) {
            System.out.println(kegiatan3);
        } else if (m.equals("panas") && h.equals("kerja")) {
            System.out.println(keigiatan4);
        }

    }


}


