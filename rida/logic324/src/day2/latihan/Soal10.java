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
            Integer setor= input.nextInt();
            System.out.println("Pilihan Transfer: 1. Antar Rekening, 2. Antar Bank ");
            Integer pilihan= input.nextInt();
            if (pilihan==1) {
                System.out.println("Masukkan rekening tujuan");
                String rektu= input.nextLine();
                input.nextLine();
                if (rektu.length()==10) {
                    System.out.println("Masukkan Nominal Transfer");
                    Integer jumlah = input.nextInt();
                    if (setor >= jumlah) {
                        int saldo = setor - jumlah;
                        System.out.println("Transaksi Berhasil");
                        System.out.println("Saldo anda saat ini Rp" + saldo);
                    } else if (setor < jumlah) {
                        System.out.println("Saldo tidak cukup ");
                    }
                }
            } else if (pilihan==2) {
                System.out.println("Masukkan kode Bank");
                Integer kode= input.nextInt();
                System.out.println("Masukkan Rekening Tujuan");
                String rektu= input.nextLine();
                System.out.println("Masukkan Nominal Transfer");
                Integer jumlah = input.nextInt();
                if (setor >= (jumlah + 7500)){
                    int saldo = setor - (jumlah + 7500);
                    System.out.println("Transaksi Berhasil");
                    System.out.println("Saldo anda saat ini Rp" + saldo);
                } else if (setor < (jumlah + 7500)){
                    System.out.println("Saldo tidak cukup ");
                }
            }
        }else {
            System.out.println("PIN Salah");
        }

    }
}
