package day2.latihanday2;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {
        String pin = "123456"; //tipe data string karena nilai ini tidak dioperasikan
        int biayaAdmin = 7500;
        long sisaSaldo = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan PIN : ");
        String inputPin = input.nextLine();

        if (!inputPin.equals(pin)){
            System.out.println("PIN SALAH");
            System.exit(0); //ini supaya misal kondisi if tidak terpenuhi maka langsung hentikan program

        }

        System.out.print("Masukkan uang yang di setor = ");
        long setor = input.nextLong();
        sisaSaldo = sisaSaldo + setor;

        System.out.print("Pilih Jenis Transfer = ");
        int transfer = input.nextInt();

        input.nextLine(); //ini karena tipe data inputan berbeda yang bawah, yg atas int dan yang bawah string. jadi harus di kasih pemisah seperti ini

        if(transfer == 1){
            System.out.print("Masukkan rekening tujuan : ");
            String rekTujuan = input.nextLine();

            //fungsi untuk mengetahui panjang string
            int panjangRekTujuan = rekTujuan.length();

            if (panjangRekTujuan != 10){   //ini karena di soal diminta harus 10 digit
                System.out.println("REKENING TIDAK VALID");
                System.exit(0);
            }

            System.out.print("Nominal Transfer = ");
            long nominalTransfer = input.nextLong();

            if (sisaSaldo >= nominalTransfer){
                sisaSaldo = sisaSaldo - nominalTransfer;
                System.out.println("Transaksi berhasil, saldo Anda saat ini " + sisaSaldo);
            }
            else {
                System.out.println("Saldo tidak mencukupi");
            }

        }
        else if (transfer == 2){ //antar bank
            System.out.print("Kode Bank : ");
            input.nextLine(); //tidak perlu ditampung ke dalam variabel

            System.out.print("Masukkan rekening tujuan : ");
            String rekTujuan = input.nextLine();

            //fungsi untuk mengetahui panjang string
            int panjangRekTujuan = rekTujuan.length();

            if (panjangRekTujuan != 10){   //ini karena di soal diminta harus 10 digit
                System.out.println("REKENING TIDAK VALID");
                System.exit(0);
            }

            System.out.print("Nominal Transfer = ");
            long nominalTransfer = input.nextLong();

            if (sisaSaldo >= nominalTransfer+biayaAdmin){
                sisaSaldo = sisaSaldo - nominalTransfer - biayaAdmin;
                System.out.println("Transaksi berhasil, saldo Anda saat ini " + sisaSaldo);
            }
            else {
                System.out.println("Saldo tidak mencukupi");
            }




        }

    }
}
