package latihanA;

import java.util.Scanner;

public class Soal4Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Saldo: ");
        int saldo = input.nextInt();

        int diskon = 2;
        int cashBack = 10;
        int cup = 0;
        int hargaCup = 18000;
        int maxCashBack = 30000;
        double dptcashback = 0.0;


        //nyari cup
        while (true) {
            if (saldo > 27000) {
                for (int i = 1; i <= 11; i++) {
                    if (i * hargaCup / 2 <= saldo) {
                        cup = i;
                    }
                }
//
                int harga = cup * hargaCup / diskon;


                dptcashback = (double) harga / cashBack;

                if (dptcashback > maxCashBack) {
                    dptcashback = maxCashBack;
                }

                saldo = saldo - harga + (int) dptcashback;
                System.out.println("Jumlah cup: " + cup + " Sisa Saldo Akhir: " + saldo);
            }else {
                System.exit(0);
            }


        }


    }
}



