package latihanA;

import java.util.Scanner;

public class Soal04Challenge {

    public static void main(String[] args) {

        int jumlahCup = 0;
        long hargaKopi = 18_000, totalHarga = 0, hargaKopiDiskon = 9_000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo OPO: ");
        long saldoOPO = scanner.nextLong();

        long saldoAwal = saldoOPO;
        double cashback;

        while (saldoOPO>27_000) {
            totalHarga = 0;
            jumlahCup = 0;
            // kondisi jika kopi terkena diskon (min order 3 cup atau 54_000)
            if (saldoOPO >= 27_000 && saldoOPO < 100_000) {

                while (saldoOPO >= hargaKopiDiskon) {

                    saldoOPO = saldoOPO - hargaKopiDiskon;
//                    totalHarga = totalHarga + hargaKopiDiskon;
                    jumlahCup++;
                }

                totalHarga = jumlahCup * hargaKopiDiskon;

            } else if (saldoOPO > 99_000) {
                while (saldoOPO > 27_000) {
                    saldoOPO = saldoOPO - hargaKopiDiskon;
//                    totalHarga = totalHarga + hargaKopiDiskon;
                    jumlahCup++;

                    if (totalHarga == 99_000) {
                        break;
                    }
                }


                totalHarga = jumlahCup * hargaKopiDiskon;
            }


            saldoOPO = saldoAwal - totalHarga;
            cashback = totalHarga * 0.1;
            if (cashback <= 30_000) {
                saldoOPO = saldoOPO + (int) cashback;
            }
            if (cashback > 30_000) {
                saldoOPO = saldoOPO + 30_000;
            }

            if (saldoOPO < 27_000){
                break;
            }
        System.out.println("jumlah cup = " + jumlahCup + "; Saldo Akhir = " +saldoOPO);
        }


    }

}
