package day5.Latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] deret = new int[10];
        int min = 0;
        int max = 0;

        for (int i = 0; i < deret.length; i++) {
            System.out.print("Masukkan bilangan indeks ke-" + i + ": ");
            int bilangan = scanner.nextInt();
            deret[i] = bilangan;
        }

        Arrays.sort(deret);

        for (int i = 0; i < deret.length; i++) {
            if (i == 0) {
                min = deret[i];
            }

            if (i == deret.length - 1) {
                max = deret[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
