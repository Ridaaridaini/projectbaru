package latihan;

import java.util.Scanner;

public class SaldoOppo {
    public static void main(String[] args) {
        //Diketahui
        int hargaKopi = 18000;
        double diskon = 0.5;
        double persenCashback = 0.1;
        int jmlCup = 1;
        int maxDiskon = 100000;
        int maxCasback = 30000;

        //input saldo
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan saldo : ");
        int saldo = scanner.nextInt();   // 60.000

        //cek saldo, cukup gk buat beli kopi
        if (saldo < 27000){
            System.out.println("tidak jadi beli, saldo kurang");
        }else{ // kalo saldo mencukupi
            //Logic Menghitung jumlah cup
            while (saldo >= jmlCup * hargaKopi * diskon && maxDiskon > jmlCup * hargaKopi * diskon ){
                jmlCup = jmlCup + 1;
            }
            jmlCup = jmlCup - 1;
            //System.out.println("Jumlah cup :" + jmlCup);

            //Logic untuk hitung sisa saldo
            double hargaBayar = jmlCup * hargaKopi * diskon;
            double cashback = hargaBayar * persenCashback;
            if ( cashback > maxCasback){
                cashback = 30000;
            }
            saldo = (int) (saldo - hargaBayar + cashback);
            System.out.println("jumlah cup = " + jmlCup + " Saldo akhir Rp." + saldo);

        }
    }
}
