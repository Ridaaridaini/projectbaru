package latihan;

import java.util.Scanner;

public class PinAtmChallange {
    public static void main(String[] args) {
        int pin, saldo, jenisTransfer, nominalTransfer;
        int kesempatan = 3;
        String rekeningTujuan, kodeBank;

        Scanner inputan = new Scanner(System.in);

        // kondisi cek pin
//        for (int i = 0; i < ; i++) {


        while (true) {
            if(kesempatan == 0){
                System.out.println("REKENING DIBLOKIR");
//                kesempatan = kesempatan - 1;
                System.exit(0);
            }

            System.out.print("Masukkan PIN = ");
            pin = inputan.nextInt();


            if(pin == 123456){
                break;
            }else {
                kesempatan--;
            }
//                return; // kondisi apabila salah program berhenti
            }

            System.out.print("set saldo awal = ");
            saldo = inputan.nextInt();

            System.out.print(" Pilihan Transfer: 1. Antar Rekening, 2. Antar Bank (input pilihannya angka 1 atau 2)");
            jenisTransfer = inputan.nextInt();

            // kondisi pilihan antar rekening
            if (jenisTransfer == 1) {
                inputan.nextLine();
                System.out.print("Masukkan Rekening Tujuan");
                rekeningTujuan = inputan.nextLine();

                // cek panjang rekening
                if (rekeningTujuan.length() != 10) {
                    System.out.print("rekening harus 10 digit");
                    return; // kondisi apabila salah program berhenti
                }

                System.out.print("Masukkan Nominal Transfer = ");
                nominalTransfer = inputan.nextInt();

                //cek saldo cukup apa tidak
                if (saldo >= nominalTransfer) {
                    System.out.print("Transaksi berhasil, saldo anda saat ini" + (saldo - nominalTransfer));
                } else {
                    System.out.print("saldo tidak cukup melakukan transfer");
                }


                // jika pilihan transfer antar bank
            } else if (jenisTransfer == 2) {
                inputan.nextLine();
                System.out.print("Masukkan Kode Bank = ");
                kodeBank = inputan.nextLine();

                System.out.print("Masukkan Rekening Tujuan = ");
                rekeningTujuan = inputan.nextLine();

                //kondisi rekening bank harus 10 digit
                if (rekeningTujuan.length() != 10) { // length = kondisi string untuk pengecekan panjang string
                    System.out.print("rekening harus 10 digit =");
                    return; // kondisi apabila salah program berhenti
                }

                System.out.print("Masukkan Nominal Transfer = ");
                nominalTransfer = inputan.nextInt();

                // kondisi nominal transfer
                if (saldo >= (nominalTransfer + 7500)) {
                    System.out.print("Transaksi berhasil, saldo anda saat ini =" + (saldo - (nominalTransfer + 7500)));
                } else {
                    System.out.print("saldo tidak cukup melakukan transfer =");
                }

            } else {
                System.out.println("error");
            }
        }
    }
