package day3.latihan3;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        int i,j;

        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int a= inputan.nextInt();

        for (i = 0; i < a; i++) {
            System.out.print("@");

            for(j=0; j < a-1; j++){
            System.out.print("@");
            }
            System.out.println();
        }
        }
    }


