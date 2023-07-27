package day2.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "123456";
        System.out.println("Masukkan PIN anda");
        String pin1= input.nextLine();
        if (pin1.equalsIgnoreCase(pin)){
            System.out.println("Uang yang disetor");
            long setoran= input.nextLong();
            System.out.println("Pilihan Transfer: 1. Antar Rekening, 2. Antar Bank ");
            int pilihan= input.nextInt();
            input.nextLine();
            //+NEXTLINE
            if (pilihan==1) {
                System.out.println("Masukkan rekening tujuan");
                String rektu= input.nextLine();
                input.nextLine();
                int rekening= rektu.length();
                if (rekening ==10) {
                    System.out.println("Masukkan Nominal Transfer");
                    long nominalTransfer = input.nextLong();
                    if (setoran >= nominalTransfer) {
                        long saldo = setoran - nominalTransfer;
                        System.out.println("Transaksi Berhasil");
                        System.out.println("Saldo anda saat ini Rp" + saldo);
                    } else if (setoran < nominalTransfer) {
                        System.out.println("Saldo tidak cukup ");
                    }
                    //TAMBAHKAN SYSTEM EXIT
                }else {
                    System.out.println("REK TUJUAN TIDAK VALID");
                    System.exit(0);
                }
            }
            if (pilihan==2) {
                System.out.println("Masukkan kode Bank");
                Integer kode= input.nextInt();
                System.out.println("Masukkan Rekening Tujuan");
                String rektu= input.nextLine();
                input.nextLine();
                int rekening= String.valueOf(rektu).length();
                if (rekening ==10) {
                    System.out.println("Masukkan Nominal Transfer");
                    long nominalTransfer = input.nextLong();
                    if (setoran >= (nominalTransfer + 7500)) {
                        long saldo = setoran - (nominalTransfer+ 7500);
                        System.out.println("Transaksi Berhasil");
                        System.out.println("Saldo anda saat ini Rp" + saldo);
                    } else if (setoran < (nominalTransfer + 7500)) {
                        System.out.println("Saldo tidak cukup ");
                    }
                }
            }else {
                System.out.println("REK TUJUAN TIDAK VALID");
                System.exit(0);
            }
        }else {
            System.out.println("PIN Salah");
        }

    }

}
