package day7.soalSimulasi.SoalA;

import java.util.Scanner;

public class Soal3AKonversi {
    public static void main(String[] args) {

        String botol = "botol";
        String cangkir = "cangkir";
        String teko = "teko";
        String gelas = "gelas";


        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan benda yang akan di konversi:");
        String benda1 = input.nextLine();
        System.out.println("Akan di konversi ke benda:");
        String benda2 = input.nextLine();

        if (botol.equalsIgnoreCase(benda1) && cangkir.equalsIgnoreCase(benda2)) {
            System.out.println("1 botol = " + 2 * 2.5 + " cangkir");
        } else if (botol.equalsIgnoreCase(benda1) && gelas.equalsIgnoreCase(benda2)) {
            System.out.println("1 botol = " + 2.0 + " gelas");
        } else if (botol.equalsIgnoreCase(benda1) && teko.equalsIgnoreCase(benda2)) {
            System.out.println("1 botol = " + 1 / 5 + " teko");
        }

        if (cangkir.equalsIgnoreCase(benda1) && botol.equalsIgnoreCase(benda2)) {
            System.out.println("1 cangkir = " + 1 / ( 2 * 2.5 )+ " botol");
        } else if (cangkir.equalsIgnoreCase(benda1) && gelas.equalsIgnoreCase(benda2)) {
            System.out.println("1 cangkir = " + 1 / 2.5 + " gelas");
        } else if (cangkir.equalsIgnoreCase(benda1) && teko.equalsIgnoreCase(benda2)) {
            System.out.println("1 cangkir = " + 1.0 / 25 + " teko");
        }

        if (gelas.equalsIgnoreCase(benda1) && botol.equalsIgnoreCase(benda2)) {
            System.out.println("1 gelas = " + 1.0 / 2 + " botol");
        } else if (gelas.equalsIgnoreCase(benda1) && teko.equalsIgnoreCase(benda2)) {
            System.out.println("1 gelas = " + 1.0 * 10 + " teko");
        } else if (gelas.equalsIgnoreCase(benda1) && cangkir.equalsIgnoreCase(benda2)) {
            System.out.println("1 gelas = " + 2.5 + " cangkir");
        }

        if (teko.equalsIgnoreCase(benda1) && botol.equalsIgnoreCase(benda2)) {
            System.out.println("teko = " + 1.0 / 5 + " botol");
        } else if (teko.equalsIgnoreCase(benda1) && gelas.equalsIgnoreCase(benda2)) {
            System.out.println("1 teko = " + 25 / 2.5 + " gelas");
        } else if (teko.equalsIgnoreCase(benda1) && cangkir.equalsIgnoreCase(benda2)) {
            System.out.println("1 teko = " + 25 + " cangkir");
        }
    }
}
