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

        // kondisi jika kopi terkena diskon (min order 3 cup atau 54_000)
        if (saldoOPO >= 27_000 && saldoOPO < 199_000){

            while (saldoOPO >= hargaKopiDiskon){

                saldoOPO = saldoOPO - hargaKopiDiskon;
                totalHarga = totalHarga + hargaKopiDiskon;
                jumlahCup++;
            }

            totalHarga = jumlahCup * hargaKopiDiskon;

        } else if (saldoOPO > 199_000) {

            while (totalHarga < 100_000){
                saldoOPO = saldoOPO - hargaKopiDiskon;
                totalHarga = totalHarga + hargaKopiDiskon;
                jumlahCup++;

                if (saldoOPO < hargaKopiDiskon){
                    break;
                }
            }


                totalHarga = jumlahCup * hargaKopiDiskon;
        }



        System.out.println(totalHarga);
        System.out.println(jumlahCup);


    }

}
