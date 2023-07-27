package day2.latihan2;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan pin anda: ");
        int pinInput = input.nextInt();
        int pin = 12345;
        if (pinInput == pin ){
            System.out.println("Masukkan jumlah uang yang akan disetor: ");
            int jumSetor = input.nextInt();
            System.out.println("Setoran berhasil!");
            System.out.println("Pilihan Transfer : ");
            System.out.println("ketik 1 untuk Antar Rekening");
            System.out.println("ketik 2 untuk Antar Bank ");
            int pilihanTf = input.nextInt();
            if(pilihanTf == 1){
                System.out.println("Masukkan nomor rekening yang dituju : ");
                String tujuan1 = input.nextLine();
                if(tujuan1.length() == 10){
                    System.out.println("Masukkan jumlah Nominal yang akan ditransfer : ");
                    int jumTf1 = input.nextInt();
                else{
                        System.out.println("Maaf, rekening tujuan anda tidak valid");
                    }
                    if(jumSetor >= jumTf1){
                        int sisaSaldo = jumSetor - jumTf1;
                        System.out.println("Transaksi berhasil, saldo Anda saat ini Rp " + sisaSaldo);
;
                    }
                    else{
                        System.out.println("Maaf, saldo anda tidak mencukupi");
                    }

// Belom selesai mas, besok dicoba lagi
                }

                }
            }

        }
    }

