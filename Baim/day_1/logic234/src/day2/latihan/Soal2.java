package day2.latihan;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan masukkan musim (hujan/panas): ");
        String musim = scanner.nextLine();

        System.out.print("Silahkan masukkan hari (libur / kerja): ");
        String hari = scanner.nextLine();

        scanner.close();
        System.out.println("================================");
        if (musim.equalsIgnoreCase("hujan") && hari.equalsIgnoreCase("libur")) {
            System.out.println("Rehat di rumah");

        } else if (musim.equalsIgnoreCase("hujan") && hari.equalsIgnoreCase("kerja")) {
            System.out.println("Pasrah aja deh");

        } else if (musim.equalsIgnoreCase("panas") && hari.equalsIgnoreCase("libur")) {
            System.out.println("Jalan jalan ke pantai");

        } else if (musim.equalsIgnoreCase("panas") && hari.equalsIgnoreCase("kerja")) {
            System.out.println("Hangout bareng temen kantor");
        } else {
            System.out.println("Masukkan sesuai input");
        }
    }
}
