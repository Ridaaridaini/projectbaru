package day5.latihan5;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array = ");
        int p = scanner.nextInt();

        int[] arrA = new int[p];
        int ganjil = 1;

        for (int i = 0; i < p; i++) {
            arrA[i] = ganjil;
            ganjil +=2;
        }
        for (int i = 0; i < arrA.length; i++) {
                System.out.print(arrA[i] + " ");

        }
    }
}
