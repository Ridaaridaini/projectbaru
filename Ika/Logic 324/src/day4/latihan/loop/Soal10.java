package day4.latihan.loop;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        // sekelompok orang ingin membeli es kopi susu dengan menggunakan promo diskon 50%
        // (maksimal diskon Rp 100.000 minimal order Rp 40.000) ditambahkan cashback 10%
        // cashback dari harga akhir yang dibayarkan maksimal cashback Rp 30.000
        // berapkah cup yang bisa dibeli jika mereka tidak ingin membayar lebih besar
        // dari nominal diskonnya? dan berapa saldo akhirnya setelah order diterima oleh customer
        // input : saldo OPO
        // contoh : saldo OPO =Rp 60.000
        // output : jumlah cup = 6, saldo akhir = Rp 11.400
        // harga kopi 18.000 ditambah ca


        Scanner input = new Scanner(System.in);
        System.out.print("masukan saldo OPO: ");
        int saldoOpo = input.nextInt();

        int diskon = 2;
        int cashback = 10;
        int minimalOrder = 40_000;
        int hargaCup = 18_000;
        int cup=0;
        int maksimalCashback = 30_000;
        long hargaTotal;
        long sisaSaldo;


        if (saldoOpo<=minimalOrder){
            for (int i = 1; i <= 4; i++) {
                if(i*hargaCup >minimalOrder){
                    if (i*hargaCup/diskon <= saldoOpo){
                        cup=i;
                    }
                }

            }
        } else if (saldoOpo>=minimalOrder && saldoOpo<= 200_000){
            for (int i = 1; i <= 11 ; i++) {
                if (i*hargaCup > minimalOrder){
                    if (i*hargaCup/2 <= saldoOpo){
                        cup=i;
                    }
                }
            }
        } else if (saldoOpo>=minimalOrder) {
            for (int i = 1; i <=1000 ; i++) {
                if(i*hargaCup>minimalOrder){
                    if (i*hargaCup/2 <= saldoOpo){
                        cup=i;
                    }
                }

            }
        }


        System.out.println("jumlah kopi yang dipesan " + cup);
        long harga = cup*hargaCup/2;
        System.out.println(harga);

        long nilaiCashback = harga/cashback;
//        System.out.println(nilaiCashback);

        if (nilaiCashback<= maksimalCashback){
            hargaTotal = harga-nilaiCashback;
            sisaSaldo = saldoOpo -hargaTotal;
            System.out.println("harga yang harus dibayarkan: " +hargaTotal) ;
            System.out.println("sisa saldo anda saat ini " + sisaSaldo);
        } else if(nilaiCashback > maksimalCashback) {
            hargaTotal = harga - maksimalCashback;
            sisaSaldo = saldoOpo - hargaTotal;
            System.out.println("harga yang harus dibayarkan: " +hargaTotal) ;
            System.out.println("sisa saldo anda saat ini " + sisaSaldo);
        }



//        Scanner input = new Scanner(System.in);
//        System.out.print("masukan saldo OPO: ");
//        int saldoOpo = input.nextInt();
//
//        int diskon = 2;
//        int cashback = 10;
//        int minimalOrder = 40_000;
//        int hargaCup = 18_000;
//        int cup=0;
//        int maksimalCashback = 30_000;
//
//
//        for (int i = 1; i <= 11 ; i++) {
//            if (i*hargaCup > minimalOrder){
//                if(i * hargaCup/diskon <= saldoOpo){
//                    cup=i;
//                }
//            }
//        }
//
//        System.out.println("jumlah kopi yang dipesan " + cup);
//        int harga = (cup * hargaCup)/2;
//        System.out.println(harga);
//
//        int casbackHarga = harga/cashback;
//
//        if (casbackHarga <= maksimalCashback){
//            int saldoAkhir = saldoOpo - (harga-casbackHarga);
//            System.out.println("sisa saldo " + saldoAkhir);
//        } else {
//            int saldoAkhir = saldoOpo - (harga-maksimalCashback);
//            System.out.println("sisa saldo " + saldoAkhir);
//        }

    }
}
