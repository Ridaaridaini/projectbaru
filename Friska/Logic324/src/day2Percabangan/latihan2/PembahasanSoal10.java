package day2Percabangan.latihan2;

import java.util.Scanner;

public class PembahasanSoal10 {
    public static void main(String[] args) {
        String pin = "123456";
        int biayaAdmin = 7500;
        long sisaSaldo = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan PIN : ");
        String inputPin = scanner.nextLine();
        if(!inputPin.equals(pin)){
            System.out.println("PIN SALAH");
            System.exit(0);

        }

        System.out.println("Masukkan uang yanng akan disetor");
        long setor = scanner.nextLong();
        sisaSaldo = sisaSaldo +setor;

        System.out.println("Pilih Jenis Transfer (1-2):");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1){
            System.out.println("Masukkan rekening tujuan");
            String rekTujuan = scanner.nextLine();

            int panjangRektujuan = rekTujuan.length();
            if(panjangRektujuan != 10){
                System.out.println("Rekening tujuan tidak valid ");
                System.exit(0);
            }
            System.out.println("Masukkan Nominal Transfer: ");
            long nominalTransfer = scanner.nextLong();

            if (sisaSaldo >= nominalTransfer){
                sisaSaldo = sisaSaldo - nominalTransfer;
                System.out.println("Transaksi berhasil, saldo anda saat ini " + sisaSaldo);
            }else{
                System.out.println("Saldo anda tidak mencukupi");
            }
        }else if(pilihan == 2){
            System.out.println("Kode Bank :");
            scanner.nextLine();
        }

        }

}
