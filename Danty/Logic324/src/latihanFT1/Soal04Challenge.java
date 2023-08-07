package latihanFT1;

import java.util.Scanner;

public class Soal04Challenge {

    public static void main(String[] args) {


        //Deklarasi variabel yang diketahui
        int hargaKopi = 9000;
        double cashBack = 0.1; // cashback = 10%

        Scanner input = new Scanner(System.in);


        System.out.print("Saldo OPO = ");
        int saldo = input.nextInt();


//        do {
//            if (saldo >= 54000) {
//                if (saldo / hargaKopi <= 11) {
//                    int cup = saldo / hargaKopi;
//                    int beli = cup * hargaKopi;
//                    int diskon = beli / 2;
//                    double uangKembali = cashBack * beli; //ini uang cashback
//                    double sisaUang = saldo - beli; //ini sisa uang setelah bayar kopi sebelum diskon
//                    double sisaSaldo = sisaUang + uangKembali;
//
//                    //casting sisa saldo agar tidak ada koma
//                    int sisaSaldoBaru = (int) sisaSaldo;
//
//                    System.out.print("Jumlah cup = " + cup + "; Saldo akhir = Rp." + sisaSaldoBaru);
//                }

            while (saldo > 54000){

                if (saldo/hargaKopi > 11) {
                    int cup = 11; //ini karena tidak mau melebihi 100000 bayarnya
                    int beli = cup * hargaKopi;
                    double uangKembali = cashBack * beli; //ini uang cashback dari harga sebelum di diskon
                    double sisaUang = saldo - beli; //ini sisa uang setelah bayar kopi sebelum diskon
                    double sisaSaldo = sisaUang + uangKembali;

                    int sisaSaldoBaru = (int) sisaSaldo;

                    System.out.println("Jumlah cup = " + cup + "; Saldo akhir = Rp." + sisaSaldoBaru);

                   while (sisaSaldo > 27000 && sisaSaldo/hargaKopi >= 11) {

                        int cup1 = 11; //ini karena tidak mau melebihi 100000 bayarnya
                        int beli1 = cup1*hargaKopi;
                        double uangKembali1 = cashBack * beli1; //ini uang cashback dari harga sebelum di diskon
                        double sisaUang1 = sisaSaldo - beli1; //ini sisa uang setelah bayar kopi sebelum diskon
                        sisaSaldo = sisaUang1 + uangKembali1;

                        int sisaSaldoBaru1 = (int) sisaSaldo;

                        System.out.println("Jumlah cup = " + cup + "; Saldo akhir = Rp." + sisaSaldoBaru1);


                        continue;

                    }
                   while(sisaSaldo > 27000 && sisaSaldo/hargaKopi < 11){

                       double cup1 = sisaSaldo/hargaKopi; //ini karena tidak mau melebihi 100000 bayarnya
                       double beli1 = cup1*hargaKopi;
                       double uangKembali1 = cashBack * beli1; //ini uang cashback dari harga sebelum di diskon
                       double sisaUang1 = sisaSaldo - beli1; //ini sisa uang setelah bayar kopi sebelum diskon
                       sisaSaldo = sisaUang1 + uangKembali1;


                       int cupCast1 = (int) cup1;

                       int sisaSaldoBaru2 = (int) sisaSaldo;
                       System.out.println("Jumlah cup = " + cupCast1 + "; Saldo akhir = Rp." + sisaSaldoBaru2);

                       continue;

                   } break;
                }
                }
            }


    }

