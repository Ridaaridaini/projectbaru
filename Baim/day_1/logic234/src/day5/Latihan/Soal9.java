package day5.Latihan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] deret = new int[5];
        int terkecil = 0;
        int terbesar = 0;

        for (int i = 0; i < deret.length; i++) {
            System.out.print("Masukkan bilangan indeks ke-" + i + ": ");
            int bilangan = scanner.nextInt();

            deret[i] = bilangan;
        }

        Arrays.sort(deret);

        for (int i = 0; i < deret.length; i++) {
            if(i != deret.length - 1){
                terkecil += deret[i];
            }

            if(i != 0){
                terbesar += deret[i];
            }
        }

        System.out.println("Terbesar: " + terbesar);
        System.out.println("Terkecil: " + terkecil);

    }
}
