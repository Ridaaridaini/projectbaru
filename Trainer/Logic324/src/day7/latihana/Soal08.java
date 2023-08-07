package day7.latihana;

import java.util.Scanner;

public class Soal08 {
    //Jika PIN salah, beri kesempatan lagi.
    //Jika salah memasukkan PIN sebanyak 3 kali, cetak REKENING DIBLOKIR
    public static void main(String[] args) {
        String pin = "123456";
        int biayaAdmin = 7500;
        long sisaSaldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan PIN : ");
        String inputPin = scanner.nextLine();
        if (!inputPin.equals(pin)){
            System.out.println("PIN SALAH");
            System.exit(0);
        }

        System.out.print("Masukkan uang yang disetor : ");
        long setor = scanner.nextLong();
        sisaSaldo = sisaSaldo + setor;

        System.out.print("Pilih Jenis Transfer (1-2) : ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1){//Antar Rekening
            System.out.print("Masukkan rekening tujuan : ");
            String rekTujuan = scanner.nextLine();

            //fungsi untuk mengetahui panjang string
            int panjangRekTujuan = rekTujuan.length();
            if (panjangRekTujuan != 10){
                System.out.println("REK TUJUAN TIDAK VALID");
                System.exit(0);
            }

            System.out.print("Masukkan Nominal Transfer : ");
            long nominalTransfer = scanner.nextLong();

            if (sisaSaldo >= nominalTransfer){
                sisaSaldo = sisaSaldo - nominalTransfer;
                System.out.println("Transaksi berhasil, saldo Anda saat ini " + sisaSaldo);
            } else {
                System.out.println("Saldo tidak mencukupi");
            }
        } else if (pilihan == 2){//Antar Bank
            System.out.print("Kode Bank : ");
            scanner.nextLine();

            System.out.print("Masukkan rekening tujuan : ");
            String rekTujuan = scanner.nextLine();

            //fungsi untuk mengetahui panjang string
            int panjangRekTujuan = rekTujuan.length();
            if (panjangRekTujuan != 10){
                System.out.println("REK TUJUAN TIDAK VALID");
                System.exit(0);
            }

            System.out.print("Masukkan Nominal Transfer : ");
            long nominalTransfer = scanner.nextLong();

            if (sisaSaldo >= nominalTransfer + biayaAdmin){
                sisaSaldo = sisaSaldo - nominalTransfer - biayaAdmin;
                System.out.println("Transaksi berhasil, saldo Anda saat ini " + sisaSaldo);
            } else {
                System.out.println("Saldo tidak mencukupi");
            }
        }
    }
}
