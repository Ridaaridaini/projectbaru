package day4;

import java.util.Random;
import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {

        int n,taruhan, A, B;
        boolean menyerah = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah kartu = ");
        n = input.nextInt();

        int kartuKomputer = n;
        int kartuPemain = n;

        while (menyerah == false && kartuPemain > 0 && kartuKomputer > 0 ){
            A = (int) (Math.random() * 10);
            B = (int) (Math.random() * 10);

            System.out.print("Masukan Jmlah Taruhan = ");
            taruhan = input.nextInt();

            System.out.println("Masukan Angka Pilihan \n 1. Pilih A \n 2. Pilih B \n 3. Menyerah : ");
            int pilihan = input.nextInt();

            if(pilihan == 1){
                if (A > B ){
                    kartuKomputer = kartuKomputer-taruhan;
                    kartuPemain = kartuPemain+taruhan;
                    System.out.println("Kamu Menang Taruhan, Kartu A = "+A+" Kartu B = "+ B);
                    System.out.println("Jumlah Kartu Pemain = "+kartuPemain+"\tJumlah Kartu Komputer = "+ kartuKomputer);

                } else if (A < B) {
                    kartuPemain = kartuPemain - taruhan;
                    kartuKomputer =kartuKomputer + taruhan;
                    System.out.println("Kamu Kalah Taruhan, Kartu A = "+A+" Kartu B = "+ B);
                    System.out.println("Jumlah Kartu Pemain = "+kartuPemain+"\tJumlah Kartu Komputer = "+ kartuKomputer);

                }else {
                    System.out.println("Hasil Seri Kartu A = "+A+" Kartu B = "+ B);
                    System.out.println("Jumlah Kartu Pemain = "+kartuPemain+"\tJumlah Kartu Komputer = "+ kartuKomputer);
                }
            } else if (pilihan == 2) {
                if (A < B ){
                    kartuKomputer = kartuKomputer-taruhan;
                    kartuPemain = kartuPemain+taruhan;
                    System.out.println("Kamu Menang Taruhan, Kartu A = "+A+" Kartu B = "+ B);
                    System.out.println("Jumlah Kartu Pemain = "+kartuPemain+"\tJumlah Kartu Komputer = "+ kartuKomputer);

                } else if (A > B) {
                    kartuPemain = kartuPemain - taruhan;
                    kartuKomputer =kartuKomputer + taruhan;
                    System.out.println("Kamu Kalah Taruhan, Kartu A = "+A+" Kartu B = "+ B);
                    System.out.println("Jumlah Kartu Pemain = "+kartuPemain+"\tJumlah Kartu Komputer = "+ kartuKomputer);
                }else {
                    System.out.println("Hasil Seri Kartu A = "+A+" Kartu B = "+ B);
                    System.out.println("Jumlah Kartu Pemain = "+kartuPemain+"\tJumlah Kartu Komputer = "+ kartuKomputer);

                }
            } else if (pilihan == 3) {
                System.out.println("Kamu Memlih Untuk Menyerah, You Lose");
                menyerah = true;

            }else {
                System.out.println("Tidak Ada Dalam Pilihan");
            }
        }

    }
}
