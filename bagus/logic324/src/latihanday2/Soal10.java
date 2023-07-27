package latihanday2;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {


        String pin = "123456";

        long admin = 7500;
        long saldo = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan pin: ");
        String bankPin = scanner.nextLine();

        if (bankPin.equals(pin)) {


            System.out.println("masukan uang yang disetor: ");
            long setor = scanner.nextLong();
            saldo = setor + saldo;

            System.out.println("masukan pilihan: ");
            int pilihan = scanner.nextInt();



            if (pilihan == 1) {



                System.out.println("masukan rekening tujuan: ");
                String tujuan = scanner.next();

                if (tujuan.length() == 10) {

                    System.out.println("masukan nomnial transfer: ");
                    long tf = scanner.nextLong();
                    if (tf < saldo) {
                        long sisaSaldo = saldo - tf;
                        System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + sisaSaldo);
                    } else if (tf > saldo) {
                        System.out.println("Saldo tidak cukup");
                    }

                } else if (tujuan.length() != 10) {
                    System.out.println("nomor rekening tidak valid");
                }
            } else if (pilihan == 2) {

                System.out.println("masukan kode bank: ");
                int kodeBank = scanner.nextInt();

                System.out.println("masukan rekening tujuan: ");
                String tujuan = scanner.next();

                if (tujuan.length() == 10) {

                    System.out.println("masukan nomnial transfer: ");
                    long tf = scanner.nextLong();
                    if (tf < saldo-admin) {
                        long sisaSaldo = saldo - tf - admin;
                        System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + sisaSaldo);
                    } else if (tf > saldo) {
                        System.out.println("Saldo tidak cukup");
                    }
                } else if (tujuan.length() != 10) {
                    System.out.println("nomor rekening tidak valid");
                }

            }
        } else {
            System.out.println("pin salah");
        }
    }
}