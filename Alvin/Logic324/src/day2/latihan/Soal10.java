package day2.latihan;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        int pin = 123456, pin_temp;
        long uang = 10_000_000;
        String sisaUang;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("###,###,###");

        System.out.print("Masukan 6 digit PIN: ");
        pin_temp = scanner.nextInt();

        if (pin == pin_temp){

            System.out.println("====================");
            System.out.println("======ATM GACOR=====");
            System.out.println("====================");
            System.out.println();
            System.out.println("Saldo : " + uang);
            System.out.println("==Transfer Gacor==");
            System.out.println("1. Antar Rekening");
            System.out.println("2. Antar Bank");
            System.out.println();
            System.out.println("pilih menu: ");
            int choose = scanner.nextInt();

            switch (choose){
                case 1 :
                    System.out.print("Masukan Rekening Tujuan: ");
                    long rekeningTujuan = scanner.nextLong();
                    System.out.print("Masukan Nominal Transfer: ");
                    long jumlahTransfer = scanner.nextLong();

                    if (uang >= jumlahTransfer){

                        sisaUang = decimal.format(uang - jumlahTransfer);
                        System.out.println("Transaksi berhasil, saldo anda saat ini " + sisaUang);

                    }else{

                        System.out.println("Slado Tidak Cukup");

                    }

                    break;
                case 2:
                    int tarif = 4500;

                    System.out.print("Masukan Kode Bank: ");
                    int kodeBank = scanner.nextInt();
                    System.out.print("Masukan Rekening Tujuan: ");
                    long rekeningTujuanBankLain = scanner.nextLong();
                    System.out.print("Masukan Nominal Transfer: ");
                    long jumlahTransferBankLain = scanner.nextLong();

                    if (uang >= (jumlahTransferBankLain+tarif)){
                        sisaUang = decimal.format(uang - jumlahTransferBankLain - tarif);

                        System.out.println("Transaksi berhasil, saldo anda saat ini " + sisaUang);
                    }else {
                        System.out.println("Saldo Tidak Cukup");
                    }
                    break;
                default:
                    System.out.println("tidak ada pilihan");
                    scanner.nextLine();
                    break;

            }

        }else {
            System.out.println("PIN SALAH");
        }

    }
}
