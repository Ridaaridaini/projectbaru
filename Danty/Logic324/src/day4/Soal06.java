package day4;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Saldo OPO : ");
        int saldo = input.nextInt();

//        int hargaKopi = 9000; //harga per cup setelah di diskon
//        int cashBack = 10; //10%

//        do {
//            if (saldo >= 54000) {
//                if (saldo / hargaKopi <= 11) {
//                    int cup = (saldo / hargaKopi);
//                    int hargaBeliKopi = (cup * hargaKopi);
//                    int saldo2 = saldo - hargaBeliKopi;
//                    int sisaSaldo = saldo2 + (hargaBeliKopi / cashBack);
//                    System.out.println("Jumlah cup : " + cup + " Saldo Akhir = Rp " + sisaSaldo);
//
//                } else if (saldo / hargaKopi > 11) {
//                    int cup = 11;
//                    int hargaBeliKopi = (cup * hargaKopi);
//                    int saldo2 = saldo - hargaBeliKopi;
//                    int sisaSaldo = saldo2 + (hargaBeliKopi / cashBack);
//                    System.out.println("Jumlah cup :" + cup + "Saldo Akhir = Rp " + sisaSaldo);
//                }
//                break;
//
//            }
//        } while (saldo >= 54000);

        int hargaKopi = 18000;
        double diskon = 0.5; //diskon 50%
        double persenCashBack = 0.1; //cashback 10%
        int jmlCup = 1;
        int maxDiskon = 100000;
        int maxCashBack = 30000;



        if(saldo < 27000){
            System.out.print("Tidak jadi beli");

        }else{
            while(saldo >= jmlCup * hargaKopi * diskon //cek apakah saldo masih cukup
                    && maxDiskon > jmlCup * hargaKopi * diskon){ //cek apakah sudah mendekati max diskon
                jmlCup = jmlCup + 1;
            }
            jmlCup = jmlCup - 1;
            //System.out.print("Jumlah Cup = " + jmlCup);

            //logic untuk menghitung sisa saldo

           double hargaBayar = jmlCup * hargaKopi * diskon;
           double cashBack = hargaBayar * persenCashBack;

           if(cashBack > maxCashBack){
               cashBack = maxCashBack;

           }saldo = (int) (saldo - hargaBayar + cashBack);
            System.out.print("Jumlah Cup = " + jmlCup + " ,Saldo Akhir = Rp " + saldo);


        }





    }
}
