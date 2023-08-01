package day5.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] deret = new int[10];
        System.out.println("Masukkan deret angka:");
        for (int i = 0; i < deret.length; i++) {
            Integer nilai = input.nextInt();
            deret[i] = nilai;
        }
        Arrays.sort(deret);
        for (int i = 0; i < deret.length; i++) {
                System.out.print(deret[i] + " ");
        }
        int min=deret[0];
        int max=deret[deret.length-1];
        System.out.println();
        System.out.println("Min: " + min + ", Max: " + max);
        }
    }

