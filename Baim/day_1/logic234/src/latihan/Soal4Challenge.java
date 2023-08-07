package latihan;

import java.util.Scanner;

public class Soal4Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double diskon50 = 0.5;
        double cashback10 = 0.1;
        double totalBelanja = 0;
        int hargaKopi = 18000;
        int cupKopi = 0;
        double sisaSaldo = 0;
        int maxDiskon = 100000;
        int maxCashback = 30000;
        boolean masihBisa = true;

        System.out.print("Masukkan saldo anda =");
        int saldo = scanner.nextInt();

        scanner.close();

        while (masihBisa) {
            int b = saldo;
            while (b > 27000) {
                while (b >= cupKopi * hargaKopi * diskon50 && maxDiskon >= cupKopi * hargaKopi * diskon50) {
                    cupKopi++;
                }

                cupKopi -= 1;

                totalBelanja = cupKopi * hargaKopi * diskon50;
                totalBelanja -= (totalBelanja * cashback10);
                sisaSaldo = b - totalBelanja;
                b = (int) sisaSaldo;
                if (sisaSaldo < 27000) {
                    masihBisa = false;
                }
                
                System.out.println("Jumlah cup = " + cupKopi + " Saldo akhir = Rp." + sisaSaldo);
                cupKopi = 0;
            }
        }
    }
}
