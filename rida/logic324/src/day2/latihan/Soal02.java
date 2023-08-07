package day2.latihan;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        String musim1 = "hujan";
        String musim2 = "panas";
        String hari1 = "libur";
        String hari2 = "kerja";
        Scanner input = new Scanner(System.in);
        System.out.print("Musim apa saat ini? ");
        String musim = input.nextLine();
        System.out.print("Masukkan Hari? ");
        String hari = input.nextLine();
        if (musim.equalsIgnoreCase(musim1) && hari.equalsIgnoreCase(hari1)) {
            System.out.println("Rehat dirumah ");
        } else if (musim.equalsIgnoreCase(musim1) && hari.equalsIgnoreCase(hari2)) {
            System.out.println("Pasrah aja deh ");
        } else if (musim.equalsIgnoreCase(musim2) && hari.equalsIgnoreCase(hari1)) {
            System.out.println("Jalan-jalan ke pantai");
        } else if (musim.equalsIgnoreCase(musim2) && hari.equalsIgnoreCase(hari2)) {
            System.out.println("Hangout bareng teman kantor");
        }
    }
}
