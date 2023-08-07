package day7.latihan01A;

import java.util.Scanner;

public class soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan saldo opo: ");
        int saldoOpo = scanner.nextInt();

        int hargaKopi = 18_000;
        int minimalOrder = 40_000;
        int maksimalCashback = 30_000;
        int maksimaldiskon=100_000;
        int cashback = 10;
        int cup=1;
        int hargaBayar;
        int nilaiCashback;
        int sisaSaldo =0;

        if(saldoOpo<27_000){
            System.out.println("tidak jadi membeli, saldo kurang");
        }else {
            while (saldoOpo>= (hargaKopi*cup)/2 && maksimaldiskon>(hargaKopi*cup)/2){
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
            System.out.println("sisa saldo "+sisaSaldo);
            saldoOpo=sisaSaldo;
        }




//        System.out.print("masukan saldo opo: ");
//        int saldoOpo = scanner.nextInt();
//
//        int hargaKopi = 18_000;
//        int minimalOrder = 40_000;
//        int maksimalCashback = 30_000;
//        int cashback = 10;
//        int cup=0;
//        int hargaBayar;
//        int nilaiCashback;
//
//        if(saldoOpo<27_000){
//            System.out.println("tidak jadi membeli saldo kurang");
//        }
//
//        if(saldoOpo<=minimalOrder){
//            for (int i = 1; i <= 4; i++) {
//                if(i*hargaKopi>=minimalOrder){
//                    if (i*hargaKopi/2<=saldoOpo){
//                        cup=i;
//                    }
//                }
//
//            }
//        }
////        System.out.println(cup);
//
//        if(saldoOpo>=minimalOrder && saldoOpo<= 200_000){
//            for (int i = 1; i <=11 ; i++) {
//                if(i*hargaKopi >=minimalOrder){
//                    if(i*hargaKopi/2 <=saldoOpo){
//                        cup=i;
//                    }
//                }
//
//            }
//        }
//        System.out.println("banyak es kopi susu yang dibeli "+cup + " cup");
//        //mencari harga bayar
//        hargaBayar = cup*hargaKopi/2;
//        //mencari cashback
//        System.out.println("harga bayar sebelum diskon: " + hargaBayar);
//        nilaiCashback = hargaBayar/cashback;
//        System.out.println("cashback " + nilaiCashback);
//
//        if(cashback<=maksimalCashback){
//            hargaBayar= hargaBayar-nilaiCashback;
//            System.out.println("harga " + cup + " cup adalah " +hargaBayar);
//        } else if (cashback > maksimalCashback) {
//            hargaBayar=hargaBayar-maksimalCashback;
//            System.out.println("harga " + cup + " cup es kopi susu adalah " +hargaBayar);
//        }

    }
}
