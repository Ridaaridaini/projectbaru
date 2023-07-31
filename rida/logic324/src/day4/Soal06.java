package day4;

import java.util.Scanner;

public class Soal06 {
    /* public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("masukkan OPO: ");
         Double opo= input.nextDouble();
         double hargaKopi, diskon, cashback;
         hargaKopi=18000;
         diskon=5/10;
         cashback=10/100;
         int cup,bayar;
         cup=0;
         if (opo>=54000){
             while (cup<=11 && opo>=9100 ) {
                 cup = cup + 1;
                 hargaKopi = hargaKopi - (hargaKopi * diskon);
                 //hargaKopi = hargaKopi - (hargaKopi * cashback);
                 opo = opo - hargaKopi;
             }
             System.out.println("jumlah cup: "+cup+" "+opo);

         }



         }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan OPO: ");
        Integer opo = input.nextInt();
        int sisaOpo, total, cashback, cup, hargakopi;
        cup = 0;
        hargakopi = 9000;
        cashback = 10;
        do {
            if (opo >= 54000) {
                if (opo / hargakopi <= 11) {
                    cup = opo / hargakopi;
                    total = cup * hargakopi;
                    opo = opo - total;
                    sisaOpo = opo + (total / cashback);
                    System.out.println("jumlah cup: " + cup + " Saldo Akhir Rp:" + sisaOpo);
                } else if (opo / hargakopi > 11) {
                    cup = 11;
                    total = cup * hargakopi;
                    opo = opo - total;
                    sisaOpo = opo + (total / cashback);
                    System.out.println("jumlah cup: " + cup + " Saldo akhir Rp:" + sisaOpo);
                }
                break;
            }
        }while (opo>=54000) ;
    }
}











