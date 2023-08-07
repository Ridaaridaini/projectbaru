package day2.latihan;

import java.util.Scanner;

public class Soal10jawabanBaru {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String PIN="123456";
        long saldo=0;
        System.out.print("Masukkan PIN anda:");
        String pin=input.nextLine();
        if (!pin.equalsIgnoreCase(PIN)){
            System.out.println("PIN SALAH");
        }else{
            System.out.print("masukkan setoran anda: ");
            saldo=saldo+ input.nextInt();
            System.out.println("Pilihan Transfer: 1.Antar Rekening   2.Antar Bank (/*input berupa angka pilihan");
            Integer pilihan= input.nextInt();
            input.nextLine();
            if (pilihan==1){
                System.out.println("masukkan rekening tujuan");
                String noRek= input.nextLine();
                if (noRek.length()==10){
                    System.out.println("Masukkan Nominal transfer: ");
                    long nominalTF=input.nextLong();
                    if (nominalTF<=saldo){
                        saldo=saldo-nominalTF;
                        System.out.println("Transaksi Berhasil, sisa saldo anda Rp"+saldo);
                    }else {
                        System.out.println("Transaksi GAGAL. Saldo tidak mencukupi");
                    }
                }
            }
            if (pilihan==2){
                System.out.println("Masukkan kode bank tujuan: ");
                int kode= input.nextInt();
                System.out.println("masukkan rekening tujuan");
                String noRek= input.nextLine();
                if (noRek.length()==10){
                    System.out.println("Masukkan Nominal transfer: ");
                    long nominalTF=input.nextLong();
                    if (nominalTF<=saldo+7500){
                        saldo=saldo-(nominalTF+7500);
                        System.out.println("Transaksi Berhasil, sisa saldo anda Rp"+saldo);
                    }else {
                        System.out.println("Transaksi GAGAL. Saldo tidak mencukupi");
                    }
                }
            }
        }
    }
}
