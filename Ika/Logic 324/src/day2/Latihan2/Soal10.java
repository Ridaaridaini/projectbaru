package day2.Latihan2;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        //Seorang karyawan hendak melakukan transfer uang dengan tujuan di rekening bank yang sama dan
        //di rekening bank yang berbeda (biaya admin Rp. 7.500). Namun saldo rekening karyawan tersebut kosong.
        //Kemudian dia hendak melakukan setoran tunai terlebih dahulu melalui mesin ATM.
        //
        //Constraint:
        //# Tabungan/Rekening karyawan memiliki kode PIN dan setiap transaksi harus verifikasi PIN tersebut, jika salah muncul "PIN Salah"
        //# Jika saldo tidak cukup melakukan transfer, munculkan pesan "Saldo tidak mencukupi"
        //# Panjang rekening harus 10 digit
        //
        //Contoh Input:
        //Masukkan PIN	123456
        //Uang yang disetor	10.000.000
        //Pilihan Transfer:	1. Antar Rekening, 2. Antar Bank (input pilihannya angka 1 atau 2)
        //
        //Output: jika pilih 1				Output: jika pilih 2
        //Masukkan Rekening Tujuan		1234567890		Masukkan Kode Bank		1
        //Masukkan Nominal Transfer		5.000.000		Masukkan Rekening Tujuan		1234567890
        //Output : Transaksi berhasil, saldo Anda saat ini Rp. 5.000.000				Masukkan Nominal Transfer		5.000.000
        //				Output: Transaksi berhasil, saldo Anda saat ini Rp. 4.992.500

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan pin: ");
        int pinBank = scan.nextInt();
        int pin = 123456;
        int saldo = 0;
        int transfer = 1;
        int rekening = 1234567890;
        int biayaAdmin= 7_500;


        if (pin == pinBank) {

            if (saldo < transfer) {
                System.out.print("jumlah yang disetor: ");
                int setor = scan.nextInt();
                saldo += setor;
                System.out.print("saldo anda Rp" + saldo);


                System.out.println("\njenis transfer");
                System.out.println("\n1. Antar Rekening\n2. Antar bank");
                System.out.print("pilih jenis Transfer: ");
                int jenisTrasfer = scan.nextInt();


                if (jenisTrasfer == 1) {
                    System.out.print("Masukan nomor rekening: ");
                    rekening = scan.nextInt();
                    int panjangRekening = String.valueOf(rekening).length();
                    if (panjangRekening == 10) {
                        System.out.print("masukan nominal transfer: ");
                        transfer = scan.nextInt();
                        if (saldo>=transfer){
                            saldo -= transfer;
                            System.out.println("Transaksi berhasil, saldo anda saat ini Rp" + saldo);
                        }else {
                            System.out.println("SALDO TIDAK MENCUKUPI");
                        }
                    } else {
                        System.out.println("Nomor rekening salah");
                        System.exit(3);
                    }
                    System.out.println();

                } else if (jenisTrasfer == 2) {
                    System.out.print("Masukan kode bank: ");
                    int kodeBank = scan.nextInt();
                    System.out.print("Masukan nomor rekening: ");
                    rekening = scan.nextInt();
                    int panjangRekening = String.valueOf(rekening).length();
                    if (panjangRekening == 10) {
                        System.out.print("masukan nominal transfer: ");
                        transfer = scan.nextInt();
                        if (saldo>=transfer){
                            saldo =saldo - transfer -biayaAdmin;
                            System.out.println("Transaksi berhasil, saldo anda saat ini Rp" + saldo);
                        }else {
                            System.out.println("SALDO TIDAK MENCUKUPI");
                        }
                    } else {
                        System.out.println("Nomor rekening salah");
                        System.exit(3);
                    }
                }

                scan.close();
            }else {
                System.out.println("sistem tidak valid");
            }
        } else {
            System.out.println("PIN Salah");
            System.exit(2);
        }

    }
}
