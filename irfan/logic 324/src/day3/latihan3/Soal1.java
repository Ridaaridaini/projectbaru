package day3.latihan3;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        int i, deretAngka;
        int a=1;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        deretAngka = inputan.nextInt();

        for(i=0; i<deretAngka; i++){
            System.out.print(a + " ");
            a= a+2;
        }
        System.out.println();
    }
}
