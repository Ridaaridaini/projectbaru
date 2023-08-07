package day7.soalSimulasi.Challange;

import java.util.Scanner;

public class Soal3AKonversiChallange {
    public static void main(String[] args) {

        String botol = "botol";
        String cangkir = "cangkir";
        String teko = "teko";
        String gelas = "gelas";

        double totalkonversi = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan benda yang akan di konversi:");
        String benda1 = input.nextLine();

        System.out.println("Akan di konversi ke benda:");
        String benda2 = input.nextLine();

        System.out.println("Berapa banyak benda tersebut?");
        double banyak = input.nextInt();

        if (botol.equalsIgnoreCase(benda1) && cangkir.equalsIgnoreCase(benda2)) {
            totalkonversi =  2 * 2.5 * banyak;
            System.out.println( totalkonversi +"cangkir");
        } else if (botol.equalsIgnoreCase(benda1) && gelas.equalsIgnoreCase(benda2)) {
            totalkonversi = 2.0 * banyak;
            System.out.println(totalkonversi + " gelas");
        } else if (botol.equalsIgnoreCase(benda1) && teko.equalsIgnoreCase(benda2)) {
            totalkonversi = 1/5 * banyak;
            System.out.println(totalkonversi + " teko");
        }

        if (cangkir.equalsIgnoreCase(benda1) && botol.equalsIgnoreCase(benda2)) {
            totalkonversi = 1 / ( 2 * 2.5 ) * banyak;
            System.out.println(totalkonversi+ " botol");
        } else if (cangkir.equalsIgnoreCase(benda1) && gelas.equalsIgnoreCase(benda2)) {
            totalkonversi = 1/2.5 * banyak;
            System.out.println(totalkonversi +  " gelas");
        } else if (cangkir.equalsIgnoreCase(benda1) && teko.equalsIgnoreCase(benda2)) {
            totalkonversi =  1.0 / 25 * banyak;
            System.out.println(totalkonversi + " teko");
        }

        if (gelas.equalsIgnoreCase(benda1) && botol.equalsIgnoreCase(benda2)) {
            totalkonversi = 1.0 / 2 * banyak;
            System.out.println(totalkonversi + " botol");
        } else if (gelas.equalsIgnoreCase(benda1) && teko.equalsIgnoreCase(benda2)) {
            totalkonversi = 1.0 * 10 * banyak;
            System.out.println(totalkonversi + " teko");
        } else if (gelas.equalsIgnoreCase(benda1) && cangkir.equalsIgnoreCase(benda2)) {
            totalkonversi = 2.5 * banyak;
            System.out.println(totalkonversi + " cangkir");
        }

        if (teko.equalsIgnoreCase(benda1) && botol.equalsIgnoreCase(benda2)) {
            totalkonversi = 1.0 / 5 * banyak;
            System.out.println(totalkonversi + " botol");
        } else if (teko.equalsIgnoreCase(benda1) && gelas.equalsIgnoreCase(benda2)) {
            totalkonversi = 25 / 2.5 * banyak;
            System.out.println(totalkonversi+" gelas");
        } else if (teko.equalsIgnoreCase(benda1) && cangkir.equalsIgnoreCase(benda2)) {
            totalkonversi = 25 * banyak;
            System.out.println(totalkonversi + " cangkir");
        }
    }
}
