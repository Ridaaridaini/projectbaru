package day4;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        double diskon = 0.5;
        double minimumOrde = 40000;
        double maksDiskon = 100000;
        double cashback = 0.1;
        double maksCashback = 30000;
        double hargaKopi = 18000;
        double maxCup = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Saldo = ");
        double saldoOPO = input.nextInt();

        while (saldoOPO >= hargaKopi){
            if (saldoOPO >= minimumOrde){
                double hargaAsli = saldoOPO/diskon;
                maxCup = Math.floor(hargaAsli / hargaKopi);
                double buyKopi = maxCup*hargaKopi;
                double hargaDiskon = buyKopi*diskon;
                if (hargaDiskon <= 100000){
                    double sisaKembalian = saldoOPO - hargaDiskon;
                    double nilaiCashback = hargaDiskon*cashback;
                    if (nilaiCashback > 30000){
                        saldoOPO = sisaKembalian + 30000;
                    }else {
                        saldoOPO = sisaKembalian + nilaiCashback;}
                }else {
                    double sisaKembalian = saldoOPO - 100000;
                    double nilaiCashback = 100000*cashback;
                    if (nilaiCashback > 30000){
                        saldoOPO = sisaKembalian + 30000;
                    }else {
                        saldoOPO = sisaKembalian + nilaiCashback;}
                }
            }else {
                maxCup = maxCup + 1;
                saldoOPO = saldoOPO - hargaKopi;
            }
        }

        System.out.println("jumlah Kopi = " + maxCup + " dan Jumlah Kembalian = " + saldoOPO);

    }

}



