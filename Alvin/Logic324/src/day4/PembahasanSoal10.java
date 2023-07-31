package day4;

import java.util.Scanner;

public class PembahasanSoal10 {

    public static void main(String[] args) {

        double diskon = 0.5;
        double max_cashback = 30_000;
        double cashback = 0.1;
        int jumlahCup = 1;
        long hargaKopi = 18_000;
        long max_diskon = 100_000;
        long saldoOPO;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo OdO: ");
        saldoOPO = scanner.nextLong();

        if (saldoOPO < 27000){// cek saldo apakah cukup untuk membeli kopi dengan diskon

        }else { // jika sadldo cukup
            // menhitung jumlah cup

            while (saldoOPO >= jumlahCup*hargaKopi*diskon && max_diskon > jumlahCup* hargaKopi*diskon){
                jumlahCup = jumlahCup+1;
            }

            jumlahCup = jumlahCup-1;
            System.out.println("Jumlah Cup: "+ jumlahCup);


            double totalHarga = jumlahCup*hargaKopi*diskon; //hitung toal harga tanpa cashback
            double cashBack  = totalHarga * cashback; // hitung cashback

            if (cashBack > max_cashback){ // jika cashback leboh dari 30000 maka max cashback 30000
                cashback = max_cashback;
            }

            long hargaBayar = (int)totalHarga-(int)cashBack; // menghitung harga yang dibayar
            System.out.println("Total bayar: " + hargaBayar);
            System.out.println("Sisa OdO: " + (saldoOPO-hargaBayar));


        }


    }
}
