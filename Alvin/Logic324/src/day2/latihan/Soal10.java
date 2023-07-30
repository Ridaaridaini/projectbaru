package day2.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        String pin = "123456", pin_temp;
        long setUang, sisaSaldo = 0;
        String sisaSaldoStr;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("###,###,###");

        System.out.print("Masukan 6 digit PIN: ");
        pin_temp = scanner.nextLine();

        if (pin.equals(pin_temp)){

            System.out.print("Setor uang : ");
            setUang = scanner.nextLong();

            sisaSaldo = sisaSaldo + setUang;

            System.out.println("====================");
            System.out.println("======ATM GACOR=====");
            System.out.println("====================");
            System.out.println();
            System.out.println("Saldo : " + sisaSaldo);
            System.out.print("Pilihan transfer: ");
            System.out.print("1. Antar Rekening");
            System.out.print(" 2. Antar Bank");
            System.out.print(" (input pilihan hanya angka 1 atau 2): ");
            int choose = scanner.nextInt();

            switch (choose){
                case 1 :
                    scanner.nextLine();

                    System.out.print("Masukan Rekening Tujuan: ");
                    String rekeningTujuan = scanner.nextLine();

                    if (rekeningTujuan.length() == 10){

                        System.out.print("Masukan Nominal Transfer: ");
                        long jumlahTransfer = scanner.nextLong();

                        if (setUang >= jumlahTransfer){

                            sisaSaldo = sisaSaldo - jumlahTransfer;
                            sisaSaldoStr = decimal.format(sisaSaldo);
                            System.out.println("Transaksi berhasil, saldo anda saat ini " + sisaSaldoStr);

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
                    scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukan Rekening Tujuan: ");
                    String rekeningTujuanBankLain = scanner.nextLine();


                    if (rekeningTujuanBankLain.length() == 10){

                        System.out.print("Masukan Nominal Transfer: ");
                        long jumlahTransferBankLain = scanner.nextLong();

                        if (setUang >= (jumlahTransferBankLain+tarif)){
                            sisaSaldo = sisaSaldo - jumlahTransferBankLain - tarif;
                            sisaSaldoStr = decimal.format(sisaSaldo);

                            System.out.println("Transaksi berhasil, saldo anda saat ini " + sisaSaldoStr);
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
