package day4.latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        long jas = 750000;
        long cp = 350000;
        long kemeja = 250000;
        long kaos = 100000;
        long topi = 50000;

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan uang Pak Topik: ");
        long uang = scan.nextLong();

        while (uang>=topi){
            if(uang>=jas){
                System.out.println("Pak Topik membeli jas");
                uang = uang - jas;
            } else if (uang >= cp) {
                System.out.println("Pak Topik membeli celana panjang");
                uang = uang - cp;
            } else if (uang >= kemeja) {
                System.out.println("Pak Topik membeli kemeja");
                uang = uang - kemeja;
            } else if (uang >= kaos) {
                System.out.println("Pak Topik membeli Kaos");
                uang = uang - kaos;
            } else if (uang >= topi) {
                System.out.println("Pak Topik membeli topi");
                uang = uang - topi;
            }

        }
    }
}
