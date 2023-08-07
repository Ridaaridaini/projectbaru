package day8;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        //Diketahui
        int hargaKopi = 18000;
        double diskon = 0.5;
        double persenCashback = 0.1;
        int jmlCup = 1;
        int maxDiskon = 100_000;
        int maxCashback = 30_000;

        //Input Saldo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Saldo : ");
        int saldo = scanner.nextInt();

        //Cek saldo, cukup gk buat beli kopi
        if (saldo < 27000) {
            System.out.println("tidak jadi beli, saldo kurang mencukupi");
        } else { //Kalo saldo mencukupi
            //Logic Menghitung Jumlah Cup
            while (saldo >= jmlCup * hargaKopi * diskon //cek apakah saldo masih cukup
                    && maxDiskon > jmlCup * hargaKopi * diskon) { //cek apakah sudah mendekati max diskon
                jmlCup = jmlCup + 1;
            }
            jmlCup = jmlCup - 1;
            //System.out.print("Jumlah Cup : " + jmlCup);

            //Logic untuk hitung sisa saldo
            double hargaBayar = jmlCup * hargaKopi * diskon;
            double cashback = hargaBayar * persenCashback;
            if (cashback > maxCashback) {
                cashback = maxCashback;
            }
            saldo = (int) (saldo - hargaBayar + cashback);
            System.out.println("Jumlah Cup = " + jmlCup + ", Saldo Akhir Rp." + saldo);
        }

    }
}
