package day7.latihana;

import java.util.Scanner;

//Jika saldo sisa, bisa beli kopi lagi sampai saldo tidak cukup.
public class Soal04Challenge {
    public static void main(String[] args) {

        long hargaKopi = 18000;
        double persenDiskon = 0.5;
        double persenCashback = 0.1;
        long maxDiskon = 100000;
        long maxCashback = 30000;

        int cup = 3; //cup minimal dapat diskon

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saldo : ");
        long saldo = scanner.nextLong();

        if (saldo < 27000){
            System.out.println("Tidak jadi beli kopi, tidak mendapatkan diskon");
            System.exit(0);
        }

        while (saldo >= 27000){
            cup = 3; //cup minimal dapat diskon
            while(saldo >= cup * hargaKopi * persenDiskon && maxDiskon >= cup * hargaKopi * persenDiskon){
                cup = cup + 1;
            }
            cup = cup -1;

            long hargaDibayar = (long) (cup * hargaKopi * persenDiskon);
            saldo = (long) saldo - hargaDibayar;

            long cashBack = (long) (hargaDibayar * persenCashback);
            if (cashBack >= maxCashback){
                cashBack = maxCashback;
            }

            saldo = saldo + cashBack;

            System.out.println("Jumlah cup : " + cup + ", sisa saldo : " + saldo);
        }
    }
}
