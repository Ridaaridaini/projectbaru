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
        System.out.println("Masukan pin: ");
        int pinKu = scan.nextInt();
        int pin = 123456;
        int saldo;





    }

}
