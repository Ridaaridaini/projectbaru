package day4.LoopingLanjutan;

import java.util.Scanner;

public class PembahasanNomor6 {
    public static void main(String[] args) {
        //Diketahui
        int hargaKopi = 18000;
        double diskon = 0.5;
        int jumCup = 1;
        int maxDiskon = 100_000;
        double persenCashback =0.1;
        int maxCashback = 30000;

        //input saldo
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah saldo: ");
        long saldo = input.nextLong();

        // Cek saldo, cukup tidak untuk membeli kopi

        if (saldo < 27000){
            System.out.println("Tidak jadi beli, saldo tidak cukup");
        }else{//kalo saldo mencukupi
        }// logic untuk menghitung jumlah cup

        while (saldo >= jumCup * hargaKopi *diskon && //cek apakah saldo masih cukup
                maxDiskon > jumCup * hargaKopi * diskon){
            jumCup = jumCup + 1;

        }
        jumCup = jumCup -1;
        System.out.println("Jumlah cup: "+ jumCup);

        //logic untuk hitung sisa saldo

        double hargaBayar = jumCup * hargaKopi *diskon;
        double cashback = hargaBayar * persenCashback;
        if (cashback > maxCashback){
            cashback = 30000;
        }
        saldo = (int) (saldo - hargaBayar +cashback);
        System.out.println("Jum Cup = "+ jumCup + ", Saldo Akhir Rp." + saldo);

    }
}
