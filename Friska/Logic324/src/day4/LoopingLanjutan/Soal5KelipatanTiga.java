package day4.LoopingLanjutan;

import java.util.Scanner;

public class Soal5KelipatanTiga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka :");
        int angka = input.nextInt();
        for (int i = 1; i < angka; i++) {
            if(i % 3 == 0 && i % 2 == 0){
                System.out.print(i+" ");
            }

        }
    }
}
