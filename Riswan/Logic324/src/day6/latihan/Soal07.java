package day6.latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String kalimatTanpaSpasi = kalimat.replaceAll("\\s", "").toLowerCase();
        String simpanKalimat = "";
        int jumlah = 0;
        System.out.println(kalimatTanpaSpasi);
        String[] pisahKalmat = kalimatTanpaSpasi.split("");

        for (int i = 0; i < kalimatTanpaSpasi.length(); i++) {
            if(!simpanKalimat.contains(pisahKalmat[i])){
                simpanKalimat = simpanKalimat +pisahKalmat[i];
            }
        }
        System.out.println(" jumlah : " + simpanKalimat.length());


    }
}
