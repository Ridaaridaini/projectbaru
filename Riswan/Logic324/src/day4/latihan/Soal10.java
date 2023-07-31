package day4.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long harga = 18000;
        boolean keputusan=true;
        long cup = 0;

        System.out.println("Masukkan Saldo : ");
        long saldo = input.nextLong();
        long hitungCup = saldo;
        long hitungCup1 = saldo;
        long total = 0;

        if(saldo>=40000 && saldo<=200_000){
            while(keputusan){
                hitungCup = hitungCup - 9000;
                cup = cup +1;
                if(hitungCup < 9000){
                    keputusan = false;
                }
            }
            System.out.println(" jumlah cup : " + cup);
            total = 9_000 * cup;
            System.out.println( " total pembelian : " + total);

            System.out.println("jumlah cup : " + cup);
            long cashback = total/100*10;
            long hasil = saldo - total + cashback;
            if(cashback<=30_000){
                System.out.println("Diskon : "+ cashback);
                System.out.println("hasil : "+ hasil);

            }else if (cashback >= 30000){
                System.out.println("hasil : "+ hasil);
                System.out.println(" jumlah cup : "+ cup + " harga : " + (saldo - total + 30_000));
                System.out.println(" sisa saldo : "+ (saldo - hasil));
            }

        }else if (saldo >200_000){
            long saldo1 = 0;
            saldo1 = saldo - 198000;
            cup = cup +22;
            long cup1 = 0;
            long diluarDiskon = 0;

            System.out.println("diluar diskon : " + saldo1);

            while (keputusan){
                saldo1 = saldo1 - harga;
                cup1 = cup1 + 1 ;
                diluarDiskon = diluarDiskon +1;
                if(saldo1<18000){
                    keputusan = false;
                }
            }
            long jumlahCup = cup +cup1;
            System.out.println(" jumlah cup : " + (jumlahCup));
            total = 18_000 * cup1;
            total = total +198000;
            System.out.println( " total pembelian : " + total);

            System.out.println("jumlah cup : " + jumlahCup);
            long cashback = total/100*10;
            System.out.println(" cash back : " + cashback);
            long hasil = saldo - total + cashback;
            System.out.println("hasil "+hasil);
            if(cashback > 30000){
                System.out.println("saldo : " + (saldo - total + 30000));
                System.out.println(" jumlah cup : "+ (jumlahCup + 1) + " Kembalian : " + (saldo - total + 30000 - 18_000));
            }else {
                System.out.println(" jumlah cup : "+ (jumlahCup + 1) + " Kembalian : " + (saldo - total + cashback - 18_000));
//                System.out.println(" sisa saldo : "+ (saldo - hasil));

            }
        }else {

            System.out.println(" tidak membeli ");
        }
    }

}

