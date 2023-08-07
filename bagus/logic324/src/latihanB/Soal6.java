package latihanB;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int admin = 7500;
        String pin = "123456";

        System.out.print("Masukan pin: ");
        String pinKu = input.nextLine();


        if (!pinKu.equals(pin)) {
            System.out.println("Pin Salah");
        }




        else {
            System.out.print("Uang yang Disetor: ");
            int saldo = input.nextInt();


            System.out.println("Pilihan Transfer 1. Antar rekening / 2. Antar Bank");

            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("Masukan rekening tujuan");
                String rekeningTujuan = input.nextLine();

                if (rekeningTujuan.length() != 10) {
                    System.out.println("Rekening yang dimasukan tidak valid");
                } else {
                    System.out.println("Masukan Nominal Transfer: ");
                    int transfer = input.nextInt();

                    int saldoSisa = saldo - transfer;

                    System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + saldoSisa);
                }
            }
            if (pilihan == 2) {
                System.out.println("Masukan rekening tujuan: ");
                String rekeningTujuan = input.nextLine();
                if (rekeningTujuan.length() != 10) {
                    System.out.println("Rekening Tidak Valid");
                } else {
                    System.out.println("Masukan nominal transfer: ");
                    int transfer = input.nextInt();

                    int saldoSisa = saldo - transfer - admin;

                    System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + saldoSisa);
                }
            }

        }
    }
}
