package day5.latihan5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        int[] deret = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan 10 angka dalam deret:");
        for (int i = 0; i < 10; i++) {
            deret[i] = input.nextInt();
        }

        int min = Arrays.stream(deret).min().getAsInt();
        int max = Arrays.stream(deret).max().getAsInt();

        System.out.print("Min = " + min + ", Max = " + max);
    }
}

