package day2.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("Selamat Datang di atm");
        System.out.println(" No Rekening : 1234567890");
        System.out.println(" Masukkan Pin : ");
        int pin = input.nextInt();
        if(pin == 123456){
            System.out.println(" Setor : ");
            long setor = input.nextLong();

            System.out.println(" Pilih : ");
            System.out.println(" 1. Antar Rekening");
            System.out.println(" 2. Antar Bank");

            System.out.println(" Pilih : ");
            short pilih = input.nextShort();
            if(pilih == 1){
                System.out.println("Masukkan Nomor Rekening : ");
                String NoRekening = input.nextLine();

                if(NoRekening.length() == 10){
                    System.out.println("Masukkan Nominal Transfer ");
                    long nominal = input.nextLong();

                    if(nominal <= setor){
                        setor = setor -nominal;
                        System.out.println(" transaksi berhasil ");
                        System.out.println(" sisa saldo : " + df.format(setor));
                        System.exit(0);
                    }else {
                        System.out.println("saldo tidak mencukupi");
                        System.exit(0);
                    }

                }else {
                    System.out.println("Input Salah");
                    System.exit(0);
                }
            } else if(pilih == 2){
                System.out.println("Masukkan Kode Bank : ");
                String kodeBank = input.nextLine();
                input.nextLine();
                System.out.println("Masukkan Nomor Rekening : ");
                String NoRekening = input.nextLine();

                if(NoRekening.length() == 10){
                    System.out.println("Masukkan Nominal Transfer ");
                    long nominal = input.nextLong();

                    if(nominal <= setor){
                        setor = setor -nominal - 7500;
                        System.out.println(" transaksi berhasil ");
                        System.out.println(" sisa saldo : Rp. " + df.format(setor));
                        System.exit(0);
                    }else {
                        System.out.println("saldo tidak mencukupi");
                        System.exit(0);
                    }

                }else {
                    System.out.println("Input Salah");
                    System.exit(0);
                }
            }
        }else {
            System.out.println("Pin Salah");
        }
    }
}
