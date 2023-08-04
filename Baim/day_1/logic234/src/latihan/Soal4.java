package latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double diskon50 = 0.5;
        double cashback10 = 0.1;
        double totalBelanja = 0;
        double hargaKopi = 18000;
        int cupKopi = 0;
        double sisaSaldo = 0;
        boolean masihBisa = true;

        System.out.print("Masukkan saldo anda =");
        int saldo = scanner.nextInt();

        scanner.close();

        if (saldo <= 40000) {
            System.out.println("if 1");
            while (hargaKopi <= saldo) {
                saldo -= hargaKopi;
                cupKopi++;
            }
        } else {
            while (masihBisa) {
                totalBelanja += hargaKopi;
                if (totalBelanja * diskon50 < saldo) {
                    cupKopi++;
                } else {
                    totalBelanja -= hargaKopi;
                    totalBelanja *= diskon50;
                    totalBelanja = totalBelanja - (totalBelanja * cashback10);
                    sisaSaldo = saldo - totalBelanja;
                    masihBisa = false;
                }
            }
        }
        System.out.println("Jumlah cup = " + cupKopi + " Saldo akhir = Rp." + sisaSaldo);
    }
}