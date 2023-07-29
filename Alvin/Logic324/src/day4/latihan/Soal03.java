package day4.latihan;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

        long uang;

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan uang: ");
        uang = scanner.nextLong();

        scanner.close();

        for (int i = 0; ; i++) {
            if (uang < 50.000){
                System.out.print("sisa uang: " + uang);
                break;
            }

            if (uang > 750_000){
                System.out.println("Pak Topik beli jas");
                uang = uang - 750_000;
            } else if (uang < 750_000 && uang >= 350_000) {
                System.out.println("Pak Topik beli celana panjang");
                uang = uang - 350_000;
            } else if (uang < 350_000 && uang >= 250_000) {
                System.out.println("Pak Topik beli kemeja");
                uang = uang - 250_000;
            } else if (uang < 250_000 && uang >= 100_000) {
                System.out.println("Pak Topik beli kaos");
                uang = uang - 100_000;
            }else {
                System.out.println("Pak Topik beli celana pendak");
                uang = uang - 50_000;
            }
        }

    }

}
