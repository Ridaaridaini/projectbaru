package day4.latihan.loop;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        // sekelompok orang ingin membeli es kopi susu dengan menggunakan cashback 50%
        // (maksimal diskon Rp 100000 dengan meinimal oerder Rp40.000) ditambah ca

        Scanner input = new Scanner(System.in);
        System.out.print("masukan saldo OPO: ");
        int saldoOpo = input.nextInt();

        int diskon = 2;
        int cashback = 10;
        int minimalOrder = 40_000;
        int hargaCup = 18_000;
        int cup=0;
        int maksimalCashback = 30_000;


        for (int i = 1; i <= 11 ; i++) {
            if (i*hargaCup > minimalOrder){
                if(i * hargaCup/2 <= saldoOpo){
                    cup=i;
                }
            }
        }

        System.out.println("jumlah kopi yang dipesan " + cup);
        int harga = (cup * hargaCup)/2;
        System.out.println(harga);

        int casbackHarga = harga/cashback;

        if (casbackHarga <= maksimalCashback){
            int saldoAkhir = saldoOpo - (harga-casbackHarga);
            System.out.println("sisa saldo " + saldoAkhir);
        } else {
            int saldoAkhir = saldoOpo - (harga-maksimalCashback);
            System.out.println("sisa saldo " + saldoAkhir);
        }

    }
}
