package day5.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5];
        int kecil = 0;
        int besar = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan " + (i+1) +": ");
            nilai[i] = input.nextInt();
        }
        System.out.println();

        Arrays.sort(nilai);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+" ");
        }

        for (int i = 0; i < nilai.length-1; i++) {
            kecil = kecil + nilai[i];
        }
        System.out.println();
        for (int i = 1; i < nilai.length; i++) {
            besar = besar + nilai[i];
        }
        System.out.println( kecil + " dan " + besar);

    }
}
