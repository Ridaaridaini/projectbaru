package day4.latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jas = 750000;
        int celanaPanjang = 350000;
        int kemeja = 250000;
        int kaos = 100000;
        int celanaPendek = 50000;

        System.out.println("Masukkan jumlah uang anda: ");
        long uang = scanner.nextInt();

        boolean uangMasih = true;

        scanner.close();

        for (; uangMasih; ) {
            if(uang >= jas){
                System.out.println("Pak topik membeli jas");
                uang -= jas;
            } else if (uang >= celanaPanjang){
                System.out.println("Pak topik membeli celana panjang");
                uang -= celanaPanjang;
            } else if (uang >= kemeja){
                System.out.println("Pak topik membeli kemeja");
                uang -= kemeja;
            } else if (uang >= kaos){
                System.out.println("Pak topik membeli kaos");
                uang -= kaos;
            } else if (uang >= celanaPendek){
                System.out.println("Pak topik membeli celana pendek");
                uang -= celanaPendek;
            } else {
                    System.out.println("Uang anda tidka mencukupi, sisa uang anda adalah: " + uang);
                uangMasih = false;
            }
        }
    }
}
