package latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String PIN="123456";
        System.out.print("Masukkan kode PIN: ");
        long saldo=0;
        int rekening=10;
        String pin=input.nextLine();
        if (pin.equalsIgnoreCase(PIN)) {
            System.out.print("Uang yang di setor: ");
            saldo = saldo + input.nextLong();
            System.out.println("pilihan: 1. Antar Rekening   2. Antar Bank ");
            Integer pil = input.nextInt();
            input.nextLine();
            if (pil == 1) {
                System.out.print("Masukkan rekening tujuan: ");
                String rekTujuan = input.nextLine();
                //input.nextLine();
                if (rekening == rekTujuan.length()) {
                    System.out.print("Masukkan nominal transfer: ");
                    long transfer = input.nextLong();
                    if (saldo >= transfer) {
                        saldo = saldo - transfer;
                        System.out.println("Transaksi berhasil, saldo saat ini Rp." + saldo+",-");
                    } else {
                        System.out.println("Salo tidak mencukupi");
                    }
                }
            } else {
                System.out.print("Masukkan kode Bank: ");
                String kode = input.nextLine();
                System.out.print("Masukkan rekening tujuan: ");
                String rekTujuan = input.nextLine();
                //input.nextLine();
                if (rekening == rekTujuan.length()) {
                    System.out.print("Masukkan nominal transfer: ");
                    long transfer = input.nextLong();
                    if (saldo >= transfer + 7500) {
                        saldo = saldo - transfer - 7500;
                        System.out.println("Transaksi berhasil, saldo saat ini Rp." + saldo+",-");
                    } else {
                        System.out.println("Salo tidak mencukupi");
                    }
                }

            }
        }else{
            System.out.println("PIN SALAH ");
        }
    }
}
