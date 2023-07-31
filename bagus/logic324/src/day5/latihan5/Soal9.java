package day5.latihan5;


import java.util.Arrays;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];


        System.out.println("Masukkan nilai untuk setiap elemen dalam array:");
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }


        Arrays.sort(array);


        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += array[i];
            maxSum += array[array.length - 1 - i];
        }


        System.out.println("Nilai minimum: " + minSum);
        System.out.println("Nilai maksimum: " + maxSum);
    }
}
