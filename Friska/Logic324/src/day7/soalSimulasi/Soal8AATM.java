package day7.soalSimulasi;

import java.util.Scanner;

public class Soal8AATM {
    public static void main(String[] args) {
        String pin = "123456";
        long sisaSaldo = 0;
        long biayaAdmin = 7500;
        int salah = 0;
        int nyoba = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pin: ");
        String pin2 = input.nextLine();
            if (!pin2.equals(pin)) {
                nyoba++;
                System.out.println("PIN Salah");
            } else if (pin2.equals(pin)) {
                System.out.println("Masukkan nominal yang akan disetor  ");
                long setor = input.nextInt();
                sisaSaldo = setor;

                System.out.println("Pilihan transfer 1.Antar rekening ; 2. Antar Bank :");
                int pilihan = input.nextInt();

                if (pilihan == 1){
                    System.out.println("Masukkan nomor rekening tujuan: ");
                    long rekening = input.nextLong();
                    String strRekening = String.valueOf(rekening);

                    if (strRekening.length() !=10){
                        System.out.println("Rekening tidak valid");
                        System.exit(0);
                    }
                    System.out.println("Masukkan Nominal Transfer: ");
                    long trf = input.nextLong();
                    if (trf <= sisaSaldo) {
                        sisaSaldo = sisaSaldo - trf;
                        System.out.println("Transaksi berhasil, saldo anda saat ini: "+ sisaSaldo);
                    }else {
                        System.out.println("Maaf saldo anda tidak cukup");
                    }

                } else if (pilihan == 2) {
                    System.out.println("Kode Bank: ");
                    String kode = input.nextLine();

                    System.out.println("Masukkan nomor rekening tujuan: ");
                    String strRekening = input.nextLine();

                    if (strRekening.length() !=10) {
                        System.out.println("Rekening tidak valid");
                        System.exit(0);
                    }
                    System.out.println("Masukkan Nominal Transfer: ");
                    long trfBank = input.nextLong();

                    if (trfBank <= sisaSaldo) {
                        sisaSaldo = sisaSaldo - trfBank - biayaAdmin;
                        System.out.println("Transaksi berhasil, saldo anda saat ini: "+ sisaSaldo);
                    }else {
                        System.out.println("Maaf saldo anda tidak cukup");
                    }
                }

            }

        }
    }





