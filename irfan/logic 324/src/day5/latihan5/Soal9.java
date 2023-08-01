package day5.latihan5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        int n = 5; // Panjang array
        int[] arr = new int[n];

        // Meminta pengguna memasukkan nilai untuk setiap elemen dalam array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka =");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println();

        // Mengurutkan array untuk memudahkan perhitungan
        Arrays.sort(arr);

        // Menghitung nilai minimum dari penjumlahan 4 elemen terkecil
        int minSum = 0;
        for (int i = 0; i < n - 1; i++) {
            minSum += arr[i];
        }

        // Menghitung nilai maksimum dari penjumlahan 4 elemen terbesar
        int maxSum = 0;
        for (int i = 1; i < n; i++) {
            maxSum += arr[i];
        }

        System.out.println("Hasil: " + minSum +" dan "+ maxSum);
        scanner.close();
             }
        }

