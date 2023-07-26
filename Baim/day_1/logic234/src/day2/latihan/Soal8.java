package day2.latihan;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jas = 750000;
        int celanaPanjang = 250000;
        int kemeja = 100000;
        int kaos = 50000;

        System.out.print("Masukkan uang kamu: ");
        int uang = scanner.nextInt();

        scanner.close();

        if (uang >= kaos && uang <= kemeja) {
            System.out.println("Kamu hanya bisa beli kaos");
        } else if (uang >= kemeja && uang <= celanaPanjang) {
            System.out.println("Kamu hanya bisa beli kemeja");
        } else if (uang >= celanaPanjang && uang <= jas) {
            System.out.println("Kamu hanya bisa beli celana panjang");
        } else if (uang >= jas) {
            System.out.println("Kamu hanya bisa beli jas");
        } else {
            System.out.println("Uang kamu tidak cukup");
        }
    }
}
