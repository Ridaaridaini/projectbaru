package day5.Latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjang = scanner.nextInt();

        int[] arrA = new int[panjang];

        int bil = 1;
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = bil;
            bil += 2;
        }

        for (int i : arrA) {
            System.out.print(i + " ");
        }
    }
}
