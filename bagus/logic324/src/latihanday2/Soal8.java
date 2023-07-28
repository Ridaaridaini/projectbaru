package latihanday2;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        int jas = 750000;
        int cp = 250000;
        int kemeja = 100000;
        int kaos = 50000;

        Scanner uang = new Scanner(System.in);

        System.out.print("total uang alfin: ");
        int uangAlfin = uang.nextInt();

        if(uangAlfin>=jas){
            System.out.println("alfin membeli jas");
        } else if (uangAlfin>=cp) {
            System.out.println("alfin membeli celana panjang");
        } else if (uangAlfin >= kemeja) {
            System.out.println("alfin membeli kemeja");
        } else if (uangAlfin>=kaos) {
            System.out.println("alfin membeli kaos");
        }

    }
}
