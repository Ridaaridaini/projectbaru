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
        if (pin2.equals(pin)) {
            System.out.println("Masukkan jumlah uang yang akan disetor :");
            setor = input.nextLong();
            saldo = setor;

            System.out.println("Pilih transfer: 1. Antar Rekening ; 2. Antar Bank");
            int pilihantrf = input.nextInt();
            input.nextLine();

            if (pilihantrf == 1) {

                System.out.println("Masukkan Rekening  tujuan: ");
                String rekTujuan = input.nextLine();

//                int panjangRekening = rekTujuan.length();

                if (rekTujuan.length() != 10) {
                    System.out.println("Rekening yang anda masukkan tidak valid");
                    System.exit(0);
                } else {

                    System.out.println("Masukkan Nominal Transfer: ");
                    trfRekening = input.nextLong();
                    if (saldo < trfRekening) {
                        System.out.println("Saldo tidak mencukupi");
                    } else {
                        saldo = saldo - trfRekening;
                        System.out.println("Transaksi berhasil, saldo Anda saat ini: " + saldo);
                    }

                }

            } else if (pilihantrf == 2) {
                System.out.println("Masukkan kode bank:");
                int kodeBank = input.nextInt();
                System.out.println("Masukkan Nominal Transfer: ");
                trfBank = input.nextLong();
                long totalTrfBank = trfBank + biayaAdmin;
                if ( saldo < totalTrfBank) {
                    System.out.println("Saldo anda tidak mencukupi");
                    System.exit(0);
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



