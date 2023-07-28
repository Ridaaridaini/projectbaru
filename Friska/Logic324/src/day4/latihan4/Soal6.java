package day4.latihan4;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan saldo OPO anda : ");
        int saldo = input.nextInt();
        int harga = 18000;
        int cup = 3;
        if (saldo >= 27000) {
            while(saldo >= cup * harga / 2){
                cup = cup+1;
            } cup = cup - 1;
            System.out.println(cup);

        }

    }
}


