package day4.latihan;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        long maxDiskon = 100_000, minOrder = 40_000, maxCashBack = 30_000, saldoPO, spend;
        long hargaKopiTotal = 0, hargaTotal, hargaDiskon = 0, hargaKopi = 18_000;
        int jumlahKopi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo OPO: ");
        saldoPO = scanner.nextLong();

        for (int i = 0; ; i++) {
            jumlahKopi = i;
            hargaKopiTotal = hargaKopiTotal + hargaKopi;

            if (hargaKopiTotal > minOrder){
                if (saldoPO < (hargaKopiTotal/2)){
                    System.out.println(jumlahKopi);
                    System.out.println((hargaKopiTotal/2));
                    break;
                }

            }
        }
    }

}
