package day2Percabangan.latihan2;

import java.util.Scanner;

public class Soal10TrfBank {
    public static void main(String[] args) {
        //1. masukkan pin dulu, benar atau tidak
        Scanner input = new Scanner(System.in);
        String pin = "123456";
        long saldo = 0;
        long setor = 0;
        long trfRekening = 0;
        long trfBank = 0;
        long biayaAdmin = 7500;


        System.out.println("Masukkan pin anda");
        String pin2 = input.nextLine();

        //2.Setor tunai
        if (pin.equals(pin2)) {
            System.out.println("Masukkan jumlah uang yang akan disetor :");
            setor = input.nextLong();
            saldo = setor;

            System.out.println("Pilih transfer: 1. Antar Rekening ; 2. Antar Bank");
            int pilihantrf = input.nextInt();

            if (pilihantrf == 1) {

                System.out.println("Masukkan Rekening  tujuan: ");
                String rekTujuan = input.nextLine();

                int panjangRekening = rekTujuan.length();

                if (panjangRekening != 10) {
                    System.out.println("Rekening yang anda masukkan tidak valid");
                    System.exit(0);
                }

                    System.out.println("Masukkan Nominal Transfer: ");
                    trfRekening = input.nextLong();
                    if (saldo < trfRekening) {
                        System.out.println("Saldo tidak mencukupi");
                    } else {
                        saldo = saldo - trfRekening;
                        System.out.println("Transaksi berhasil, saldo Anda saat ini: " + saldo);
                    }

                } else if (pilihantrf == 2) {
                    System.out.println("Masukkan kode bank:");
                    int kodeBank = input.nextInt();
                    System.out.println("Masukkan Nominal Transfer: ");
                    trfBank = input.nextLong();
                    if (saldo < trfBank || saldo < biayaAdmin) {
                        System.out.println("Saldo anda tidak mencukupi");
                    } else {
                        saldo = saldo - trfBank - biayaAdmin;
                        System.out.println("Transaksi berhasil, saldo Anda saat ini: " + saldo);
                    }

                }


            } else {
                System.out.println("PIN SALAH");
                System.exit(0);

            }


        }

    }



