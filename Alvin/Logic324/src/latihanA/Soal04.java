package latihanA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        int jumlahCup = 0;
        long hargaKopi = 18_000, totalHarga = 0, hargaKopiDiskon = 9_000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo OPO: ");
        long saldoOPO = scanner.nextLong();

        long saldoAwal = saldoOPO;

        // kondisi jika kopi terkena diskon (min order 3 cup atau 54_000)
        if (saldoOPO >= 27_000 && saldoOPO < 100_000){

            while (saldoOPO >= hargaKopiDiskon){

                saldoOPO = saldoOPO - hargaKopiDiskon;
                totalHarga = totalHarga + hargaKopiDiskon;
                jumlahCup++;
            }

            totalHarga = jumlahCup * hargaKopiDiskon;

        } else if (saldoOPO > 99_000) {

            while (totalHarga < 100_000){
                saldoOPO = saldoOPO - hargaKopiDiskon;
                totalHarga = totalHarga + hargaKopiDiskon;
                jumlahCup++;

                if (totalHarga == 99_000){
                    break;
                }
            }


                totalHarga = jumlahCup * hargaKopiDiskon;
        }

        saldoOPO = saldoAwal - totalHarga;
        double cashback = totalHarga*0.1;
        if (cashback <= 30_000){
            saldoOPO = saldoOPO + (int)cashback;
        }
        if (cashback > 30_000){
            saldoOPO = saldoOPO + 30_000;
        }

        System.out.println(cashback);

        System.out.println("jumlah cup = " + jumlahCup + "; Saldo Akhir = " +saldoOPO);


    }

}
