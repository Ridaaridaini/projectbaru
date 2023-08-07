package day2Percabangan.latihan2;

import java.util.Scanner;

public class Soal2HaridanMusim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan musim:");
        String musim = input.nextLine();
        System.out.println("Masukkan hari:");
        String hari = input.nextLine();

        if (musim.equalsIgnoreCase("Hujan") && hari.equalsIgnoreCase("Libur")){
                System.out.println("Kegiatan hari ini Rehat dirumah");
            }
        else if (musim.equalsIgnoreCase("Hujan") && hari.equalsIgnoreCase("Kerja")){
                System.out.println("Kegiatan hari Pasrah aj deh");
            }
        else if (musim.equalsIgnoreCase("Panas") && hari.equalsIgnoreCase("Libur")){
                        System.out.println("Jalan-jalan ke pantai");
            }
        else {
                        System.out.println("Hangout bareng teman kantor");
            }
        }
    }









