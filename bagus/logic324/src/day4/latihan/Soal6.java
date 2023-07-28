package day4.latihan;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Saldo OPO: ");
       int saldo = input.nextInt();



//        long order = input.nextLong();

        int hargaCup = 18000;
        int minOrder = 40000;
//        double jumlahCup;
        int cup = 0;
        int diskon = 2;
        int cashBack = 10;
//        long cashBackk = (long) 0.1;
        int minCashBack = 30000;


//        sisaSaldo = saldo - ((hargaCup*0.5)- (hargaCup*0.05));
//        jumlahCup = (saldo - sisaSaldo) / ((hargaCup*0.5) - (hargaCup*0.05));
//
////
//        System.out.println(jumlahCup);
//        System.out.println(sisaSaldo);


        for (int i = 1; i <= 11; i++) {
            if (i * hargaCup > minOrder) {
                if (i * hargaCup / 2 <= saldo) {
//                    System.out.println(i);
                    cup = i;
                }
            }
        }

        System.out.println("Jumlah cup: "+cup);
        int harga = cup * hargaCup;
//        System.out.println("Harga asli: " + harga);

        int hargaSetelahDiskon = harga / diskon;

//        double diskonHarga = (double) cup * (double) hargaCup * (double)cashBackk;
//        System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);

//        double hargaSetelahDiskon = harga - hargaSebelumDiskon;
//        System.out.println("Harga setelah diskon: " +hargaSetelahDiskon);


        if (hargaSetelahDiskon >= minCashBack) {
            int hargaCashBack = hargaSetelahDiskon / cashBack;
//            System.out.println("Harga cashback: " + hargaCashBack);
//
            int total = harga - hargaSetelahDiskon - hargaCashBack;
//            System.out.println("Total: " + total);


            int sisaSaldo = saldo - total;
            System.out.println("Sisa Saldo Akhir: " + sisaSaldo);


        }
    }
}


