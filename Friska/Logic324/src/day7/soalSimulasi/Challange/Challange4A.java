package day7.soalSimulasi.Challange;

import java.util.Scanner;

public class Challange4A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan saldo OVO: ");
        int saldo = input.nextInt();


        int cashback = 10;
        int cup = 0;
        int hargaCup = 18000;
        int maksCashback = 30000;
        double totalCashback = 0.0;

        //1.Cari cup dulu
        while (true) {
            if (saldo > 27000) {
                for (int i = 1; i <= 11; i++) {
                    if (i * hargaCup / 2 <= saldo) {
                        cup = i;
                    }

                }
                int harga = cup * hargaCup / 2;
                totalCashback = (double) harga / cashback;

                if (totalCashback > maksCashback) {
                    totalCashback = maksCashback;
                }
                saldo = saldo - harga + (int) totalCashback;
                System.out.println("Jumlah Cup " + cup + " Sisa Saldo " + saldo);


            } else {
                System.exit(0);
            }
        }
    }
}

