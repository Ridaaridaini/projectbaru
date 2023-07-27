package day2.latihan;

import java.util.Scanner;

public class PembahasanSoal10 {
    public static void main(String[] args) {
        String pin = "123456";
        int biayaadmin = 7500;
        long sisasaldo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan PIN");
        String inputpin= scanner.nextLine();
        if(!inputpin.equals(pin)) {
            System.out.println("PIN Salah");
            System.exit(0);
        }
        System.out.println("masukkan uang yang disetor: ");
        long setor= scanner.nextLong();
        sisasaldo = sisasaldo + setor;
        System.out.println("Pilih jenis transfer (1 - 2)");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        if (pilihan == 1) {
            System.out.println("Masukkan rekening tujuan");
            String rektujuan = scanner.nextLine();
            //Fungsi untuk mengetahui panjang string
            int panjangrektujuan = rektujuan.length();
            if (panjangrektujuan != 10) {
                System.out.println("REK TUJUAN TIDAK VALID");
                System.exit(0);

            }
            System.out.println("Masukkan nominal transfer ");
            long nominalTransfer = scanner.nextLong();
            if (sisasaldo >= nominalTransfer) {
                sisasaldo = sisasaldo - nominalTransfer;
                System.out.println("Transaksi Berhasil");
                System.out.println("Saldo anda saat ini Rp" + sisasaldo);

            } else {
                System.out.println("Saldo tidak cukup ");
            }
        } else if (pilihan == 2) {
            System.out.println("Masukkan kode Bank");
            scanner.nextLine();
            System.out.println("Masukkan rekening tujuan");
            String rektujuan= scanner.nextLine();
            int panjangrektujuan = rektujuan.length();
            if (panjangrektujuan != 10) {
                System.out.println("REK TUJUAN TIDAK VALID");
                System.exit(0);

            }
            System.out.println("Masukkan nominal transfer ");
            long nominalTransfer = scanner.nextLong();
            if (sisasaldo >= (nominalTransfer +biayaadmin)) {
                sisasaldo = sisasaldo - (nominalTransfer + biayaadmin);
                System.out.println("Transaksi Berhasil");
                System.out.println("Saldo anda saat ini Rp" + sisasaldo);

            } else {
                System.out.println("Saldo tidak cukup ");
            }

        }
    }
}


