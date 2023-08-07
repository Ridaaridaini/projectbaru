package latihanA;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Saldo: ");
        int saldo = input.nextInt();

        int diskon = 2;
        int cashBack = 10;
        int minOrder = 40000;
        int cup = 0;
        int cupTambahan = 0;
        int hargaCup = 18000;
        int minCashBack = 30000;
        int sisaSaldo = 0;
        int total = 0;

        //nyari cup
//        while (sisaSaldo > 27000) {
        for (int i = 1; i <= 11; i++) {
            if (i * hargaCup > minOrder) {
                if (i * hargaCup / 2 <= saldo) {
                    cup = i;
                }

            }

        }
        System.out.println(cup);

        System.out.println("Jumlah cup: " + cup);
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
            total = harga - hargaSetelahDiskon - hargaCashBack;
//            System.out.println("Total: " + total);


        }
        saldo = saldo - total;
        System.out.println("Sisa Saldo Akhir: " + saldo);

    }

}

