package day7.soalSimulasi;

import java.util.Scanner;

public class Soal4AKopi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan saldo OVO: ");
        long saldo = input.nextLong();
        long saldo1 = saldo;
        long belanja = 0;
        long cashback = 0;
        int cup = 1;
        if(saldo >= 40000){
            while (saldo >= cup * 9000){
                cup = cup + 1;
                if (cup >= 12){
                break;
                }

            }cup = cup - 1;
            System.out.println("Jumlah cup: "+cup);
            belanja = cup * 9000;
            saldo1 = saldo - belanja;
            cashback = belanja * 1/10;
            long saldoAkhir = saldo1 + cashback ;
            System.out.println("Saldo akhir :"+ saldoAkhir);



        }
    }
}
