package latihanA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal08Challenge {

    public static void main(String[] args) {

        String pin = "123456", rekeningTujuan = "";
        boolean credential = false;
        long saldo = 0, setor, transfer, biayaTransfer = 7_500;
        String tempPin = "";
        int count = 0, kesempatan = 3;

        Scanner scanner = new Scanner(System.in);

        while (!credential){
            System.out.print("verifikasi pin: ");
            tempPin = scanner.nextLine();

            if (!tempPin.equals(pin)){
                kesempatan--;
                System.out.println("PIN Salah");
                System.out.println("kesempatan : "+kesempatan);
                count++;

                if (count == 3){
                    System.out.println("REKENING DI BLOKIR");
                    System.exit(0);
                }

                continue;
            }

            credential = true;
        }

        System.out.print("uang yg di setor: ");
        setor = scanner.nextLong();

        saldo = saldo+setor;

        System.out.print("1. Antar Rekening     2. Antar Bank (pilih 1 atau 2): ");
        int pilih = scanner.nextInt();

        //antar rekening
        if (pilih == 1){
            scanner.nextLine();
            System.out.print("rekening tujuan: ");
            rekeningTujuan = scanner.nextLine();

            if (rekeningTujuan.length() != 10){
                System.out.println("panjang rekening harus 10 digit");
                System.exit(402);
            }

            System.out.print("nominal transfer: ");
            transfer = scanner.nextLong();

            if (transfer>saldo){
                System.out.println("saldo anda tidak cukup");
                System.exit(5);
            }

            saldo = saldo-transfer;


            //antar bank
        } else if (pilih == 2) {
            scanner.nextLine();
            System.out.print("kode bank: ");
            scanner.nextLine();
            System.out.print("rekening tujuan: ");
            rekeningTujuan = scanner.nextLine();

            if (rekeningTujuan.length() != 10){
                System.out.println("panjang rekening harus 10 digit");
                System.exit(402);
            }

            System.out.print("nominal transfer: ");
            transfer = scanner.nextLong()+biayaTransfer;

            if (transfer>saldo){
                System.out.println("saldo anda tidak cukup");
                System.exit(5);
            }

            saldo = saldo-transfer;
        }else{
            System.out.println("anda diluar angkasa");
        }


        DecimalFormat df = new DecimalFormat("###,###,###");
        String strSaldo = df.format(saldo);

        System.out.println("saldo anda saat ini: Rp."+strSaldo+".-");

    }

}
