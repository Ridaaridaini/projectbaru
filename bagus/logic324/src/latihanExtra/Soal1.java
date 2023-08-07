package latihanExtra;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan panjang deret: ");
        int n = input.nextInt();

        int[] arr1 = new int[n];
        int [] arr2 = new int[n];

        int bil = 2;
        for (int i = 0; i < n; i++) {
            arr1[i] = bil;
            bil = bil + 2;
            System.out.print(arr1[i]+ " ");

        }

        System.out.println();

        int bil2 = -2;
        for (int i = 0; i < n; i++) {
            arr2[i] = bil2;
            bil2 = bil2 - 2;
            System.out.print(arr2[i]+ " ");

        }

        System.out.println();
        int [] total = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                total[i] = arr1[i] + arr2[i];
            }
            else {
                total[i] = arr1[i] + arr2[i];
            }
            System.out.print(total[i]+ " ");
        }




    }
}
