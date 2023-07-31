package day5.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nilai = new int[10];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan " + (i+1) +": ");
            nilai[i] = input.nextInt();
        }
        int min = nilai[0];
        int max = nilai[0];
//        for (int i = 0; i < nilai.length; i++) {
//            System.out.print(nilai[i]);
//        }
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }

            if (nilai[i] > max) {
                max = nilai[i];
            }
            System.out.println("langkah ke " + i );
            System.out.println("kecil = " + min);
            System.out.println("maksimal = " + max);
        }
        System.out.println("Nilai max : " + max + " nilai min : " + min);
    }
}
