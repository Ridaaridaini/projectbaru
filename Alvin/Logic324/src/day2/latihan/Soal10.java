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
                    scanner.nextLine();
                    System.out.print("Masukan Rekening Tujuan: ");
                    String rekeningTujuan = scanner.nextLine();
                    System.out.print("Masukan Nominal Transfer: ");
                    long jumlahTransfer = scanner.nextLong();

                    if (rekeningTujuan.length() == 10){
                        if (uang >= jumlahTransfer){

                            sisaUang = decimal.format(uang - jumlahTransfer);
                            System.out.println("Transaksi berhasil, saldo anda saat ini " + sisaUang);

                        }else{

                            System.out.println("Slado Tidak Cukup");

                        }
                    }else{
                        System.out.println("Nomor Rekening Harus 10 digit");
                    }

                    break;

                case 2:
                    int tarif = 7500;

                    System.out.print("Masukan Kode Bank: ");
                    int kodeBank = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukan Rekening Tujuan: ");
                    String rekeningTujuanBankLain = scanner.nextLine();
                    System.out.print("Masukan Nominal Transfer: ");
                    long jumlahTransferBankLain = scanner.nextLong();


                    if (rekeningTujuanBankLain.length() == 10){

                        if (uang >= (jumlahTransferBankLain+tarif)){
                            sisaUang = decimal.format(uang - jumlahTransferBankLain - tarif);

                            System.out.println("Transaksi berhasil, saldo anda saat ini " + sisaUang);
                        }else {
                            System.out.println("Saldo Tidak Cukup");
                        }
                    }else {
                        System.out.println("Nomor Rekening Harus 10 digit");
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
