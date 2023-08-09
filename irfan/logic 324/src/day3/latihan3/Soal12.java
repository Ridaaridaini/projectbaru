package day3.latihan3;

import java.util.Scanner;

public class Soal12 {
    public static void main(String[] args) {

        int i,j;

        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int n= inputan.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("*");
            for (j = 0; j < n; j++) {
                if(i > j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
