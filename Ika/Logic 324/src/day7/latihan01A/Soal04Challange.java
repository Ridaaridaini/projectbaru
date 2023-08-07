package day7.latihan01A;

import java.util.Scanner;

public class Soal04Challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan saldo opo: ");
        int saldoOpo = scanner.nextInt();

        int hargaKopi = 18_000;
//        int minimalOrder = 40_000;
        int maksimalCashback = 30_000;
        int maksimaldiskon=100_000;
        int cashback = 10;
        int cup=1;
        int hargaBayar;
        int nilaiCashback;
        int sisaSaldo =0;


        if(saldoOpo<27_000) {
            System.out.println("tidak jadi membeli saldo kurang");
        }

       while (saldoOpo>26_000){
           cup=0;
           if(saldoOpo<27_000) {
               System.out.println("tidak jadi membeli saldo kurang");
           }else {
               while (saldoOpo>=27000 && saldoOpo>= (hargaKopi*cup)/2 && maksimaldiskon>(hargaKopi*cup)/2){
                   cup=cup+1;
               }
               cup=cup-1;
//           System.out.println(cup);
               hargaBayar =(hargaKopi*cup)/2;
               //menghitung cashback
               nilaiCashback = hargaBayar/cashback;

               if(cashback<=maksimalCashback){
                   hargaBayar= hargaBayar-nilaiCashback;
                   System.out.println("harga " + cup + " cup adalah " +hargaBayar);
               } else if (cashback > maksimalCashback) {
                   hargaBayar=hargaBayar-maksimalCashback;
                   System.out.println("harga " + cup + " cup es kopi susu adalah " +hargaBayar);
               }

               sisaSaldo=saldoOpo-hargaBayar;
           }

           saldoOpo=sisaSaldo;
       }
        System.out.println("sisa saldo opo " + saldoOpo);

    }

}

