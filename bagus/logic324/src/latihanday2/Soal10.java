package latihanday2;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {


        int pin = 123456;
        long saldo = 10000000;
        long admin = 7500;


        Scanner pinBank = new Scanner(System.in);
        System.out.println("masukan pin: ");
        int bankPin = pinBank.nextInt();

        if (bankPin == pin) {


            Scanner transfer = new Scanner(System.in);
            System.out.println("masukan pilihan: ");
            int pilihan = transfer.nextInt();

            if (pilihan == 1) {
                Scanner rekening = new Scanner(System.in);

                System.out.println("masukan rekening tujuan: ");
                String tujuan = rekening.next();

                if (tujuan.length() == 10) {
                    Scanner nominal = new Scanner(System.in);
                    System.out.println("masukan nomnial transfer: ");
                    long tf = nominal.nextLong();
                    if (tf<saldo) {
                        long sisaSaldo = saldo - tf;
                        System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + sisaSaldo);
                    } else if (tf>saldo) {
                        System.out.println("Saldo tidak cukup");
                    }

                } else if (tujuan.length() != 10) {
                    System.out.println("nomor rekening tidak valid");
                }
            } else if (pilihan==2) {
                Scanner rekening = new Scanner(System.in);

                System.out.println("masukan rekening tujuan: ");
                String tujuan = rekening.next();

                if (tujuan.length() == 10) {
                    Scanner nominal = new Scanner(System.in);
                    System.out.println("masukan nomnial transfer: ");
                    long tf = nominal.nextLong();
                    if (tf<saldo) {
                        long sisaSaldo = saldo - tf;
                        System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + sisaSaldo);
                    } else if (tf>saldo) {
                        System.out.println("Saldo tidak cukup");
                    }
                } else if (tujuan.length() != 10) {
                    System.out.println("nomor rekening tidak valid");
                }

            } else {
                System.out.println("pin salah");
            }
        }
    }
}