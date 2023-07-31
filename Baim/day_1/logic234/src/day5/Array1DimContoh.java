package day5;

import java.util.Scanner;

public class Array1DimContoh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arrA = new int[3];

        for (int i = 0; i < arrA.length; i++) {
            System.out.print("input indeks ke-" + i + ": ");
            arrA[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }

        for (int i = 0; i < arrA.length; i++) {
            if (i == arrA.length - 1) {
                System.out.print(arrA[i]);      
            } else {
                System.out.print(arrA[i] + ", ");
            }
        }
    }
}
