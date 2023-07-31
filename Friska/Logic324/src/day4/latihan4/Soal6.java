package day4.latihan4;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan saldo OPO anda : ");
        int saldo = input.nextInt();
        int saldo1 = saldo;
        int belanja = 0;
        int cup = 3;
//        int cup1 = 0;
        int cashback = 0;

        if (saldo >= 40000) {// biar memenuhi kndisi makanya didalam
            while (saldo >= cup * 9000) {
                cup = cup + 1;
                if (cup >= 12) {
                    break;
                }
            }
            cup = cup - 1;
            System.out.println("Jumlah cup yang dibeli yaitu :" + cup);
            belanja = 9000 * cup;
            saldo1 = saldo1 - belanja;
            cashback = belanja * 10 / 100;
            int fixsaldo = saldo1 + cashback;
//            System.out.println("Total beli adalah " + belanja);
//            System.out.println("Sisa uang adalah " + saldo1);
//            System.out.println("Cashback yang kamu dapat adalah " + cashback);
            System.out.println("Saldo akhir anda yang kamu dapat adalah: Rp."+ fixsaldo);
        } else if (saldo < 40000) {

            System.exit(0);
        }

//        }else if (saldo >= 198000){
//            int belanja1 = 198000;
//            boolean keputusan = true;
//            saldo = saldo - belanja1;
//            int sisaSaldo = saldo;
//            while (keputusan) { // selama keputusannya true dia akan nambah 1 cup
//                cup1 = cup1+1;
//                sisaSaldo = sisaSaldo - harga;// dan sisaSaldo dikurangi harga
//                if (sisaSaldo < 18000){// kalau kurang dari 18000 dia bakal false atau berhenti
//                    keputusan = false;
//                    System.out.println("cup :"+cup1);
//                }
//            }
//            int totalNoDiskon = cup1 * harga;
//            int fixTotalBelanja = totalNoDiskon + 198000;
//            int udahfix = saldo1 - fixTotalBelanja;
//            int fixCashback = fixTotalBelanja * 10/100;
//            if (fixCashback > 30000){
//                fixCashback = 30000;
//                udahfix= udahfix + fixCashback;
//                System.out.println("Saldo akhir anda yaitu : "+ udahfix);
//                System.out.println("Selamat kamu mendapatkan cashback sebesar: "+ fixCashback);
//                System.out.println("jum cup yang sudah didiskon: " + cup);
//
//
//            }
//            }


        }
    }