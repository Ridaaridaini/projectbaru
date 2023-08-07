package latihanA;

import java.util.Scanner;

public class Soal04Challenge {

    public static void main(String[] args) {

        int jumlahCup = 0;
        long hargaKopi = 18_000, totalHarga = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo OPO: ");
        long saldoOPO = scanner.nextLong();

        long saldoAwal = saldoOPO;

        // kondisi jika kopi terkena diskon (min order 3 cup atau 54_000)
        while (saldoOPO >= 27_000){
            jumlahCup = 0;
            saldoAwal = saldoOPO;
            totalHarga = 0;

            if (saldoOPO >= 27_000 && saldoOPO < 100_000){

                while (saldoOPO >= hargaKopi*0.5){

                    saldoOPO = saldoOPO - hargaKopi/2;
                    totalHarga = totalHarga + hargaKopi/2;
                    jumlahCup++;
                }

                totalHarga = jumlahCup * hargaKopi/2;

            } else if (saldoOPO > 99_000) {

                while (totalHarga < 100_000){
                    saldoOPO = saldoOPO - hargaKopi/2;
                    totalHarga = totalHarga + hargaKopi/2;
                    jumlahCup++;

                    if (totalHarga == 99_000){
                        break;
                    }
                }


                totalHarga = jumlahCup * hargaKopi/2;
            }

            saldoOPO = saldoAwal - totalHarga;
            double cashback = totalHarga*0.1;
            if (cashback <= 30_000){
                saldoOPO = saldoOPO + (int)cashback;
            }
            if (cashback > 30_000){
                saldoOPO = saldoOPO + 30_000;
            }

            System.out.println("jumlah cup = " + jumlahCup + "; Saldo Akhir = " +saldoOPO);

        }

    }

}
