package latihanFT1;

import java.util.Scanner;

public class Soal04Challenge {

    public static void main(String[] args) {

        //Deklarasi variabel yang diketahui
        int hargaKopi = 9000; //setelah di diskon
        double cashBack = 0.1; // cashback = 10%

        Scanner input = new Scanner(System.in);

        System.out.print("Saldo OPO = ");
        int saldo = input.nextInt();



        do{
            if(saldo >= 27000){
                if(saldo/hargaKopi <= 11){
                    int cup = saldo/hargaKopi;
                    int beli = cup * hargaKopi;
                    double uangKembali = cashBack*beli; //ini uang cashback
                    double sisaUang = saldo - beli; //ini sisa uang setelah bayar kopi sebelum diskon
                    double sisaSaldo = sisaUang + uangKembali;

                    //casting sisa saldo agar tidak ada koma
                    int sisaSaldoBaru = (int) sisaSaldo;
                    saldo = sisaSaldoBaru;

                    System.out.println("Jumlah cup = " + cup + "; Saldo akhir = Rp." + sisaSaldoBaru);
                }
                else if(saldo/hargaKopi > 11){
                    int cup = 11; //ini karena tidak mau melebihi 100000 bayarnya
                    int beli = cup * hargaKopi;
                    double uangKembali = cashBack*beli; //ini uang cashback dari harga sebelum di diskon
                    double sisaUang = saldo - beli; //ini sisa uang setelah bayar kopi sebelum diskon
                    double sisaSaldo = sisaUang + uangKembali;

                    //casting sisa saldo agar tidak ada koma
                    int sisaSaldoBaru = (int) sisaSaldo;
                    saldo = sisaSaldoBaru;

                    System.out.println("Jumlah cup = " + cup + "; Saldo akhir = Rp." + sisaSaldoBaru);
                }

            }
        }
        while (saldo >= 27000);

    }
}
