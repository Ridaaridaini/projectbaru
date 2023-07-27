package day2.Latihan2;

import java.util.Scanner;

public class Soal10Pembahasan {
    public static void main(String[] args) {
        String pin = "123456";
        int biayaAdmin = 7_500;
        long sisaSaldo = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("masukan PIN: ");
        String inputPin = input.nextLine();

        if (!inputPin.equals(pin)) {// magsudnya adalah jika pin salah maka nnt langsung ke clode
            System.out.println("PIN SALAH");
            System.exit(0);
        }

        System.out.print("Masukan Uang yang disetor: ");
        long setor = input.nextLong();
        sisaSaldo += setor;

        System.out.println("=================Pilihan jenis transfer==================");
        System.out.println("1. Antar Bank");
        System.out.println("2. Beda Bank");
        System.out.print("pilih jenis transfer: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {//antar rekening
            System.out.print("Masukan rekening tujuan: ");
            String rekTujuan = input.nextLine();
            //fungsi untuk mengetahui panjang String .length
            int panjangRekTujuan = rekTujuan.length();
            if (panjangRekTujuan != 10) {
                System.out.print("REK TUJUAN TIDAK VALID");
                System.exit(0);
            }

            System.out.print("Masukan nominal transfer: ");
            long nominalTransfer = input.nextLong();
            if(sisaSaldo>=nominalTransfer){
                sisaSaldo = sisaSaldo-nominalTransfer;
                System.out.println("Transaksi berhasil, saldo anda saat ini Rp" + sisaSaldo);
            }else {
                System.out.println("Saldo tidak mencukupi");
            }

        } else if (pilihan == 2) {//antar bank
            System.out.print("Kode Bank: ");
            input.nextLine();
            System.out.print("Masukan rekening tujuan: ");
            String rekTujuan = input.nextLine();
            //fungsi untuk mengetahui panjang String .length
            int panjangRekTujuan = rekTujuan.length();
            if (panjangRekTujuan != 10) {
                System.out.print(" REK TUJUAN TIDAK VALID");
                System.exit(0);
            }

            System.out.print("Masukan nominal transfer: ");
            long nominalTransfer = input.nextLong();
            if(sisaSaldo>=nominalTransfer + biayaAdmin){
                sisaSaldo = sisaSaldo-nominalTransfer-biayaAdmin;
                System.out.println("Transaksi berhasil, saldo anda saat ini Rp" + sisaSaldo);
            }else {
                System.out.println("Saldo tidak mencukupi");
            }

        }
    }
}