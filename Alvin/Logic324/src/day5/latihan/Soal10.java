package day5.latihan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer[] arrMinMax = new Integer[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("n-" + i + ": ");
            int n = scanner.nextInt();

            arrMinMax[i] = n;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arrMinMax[i] + " ");
        }

        System.out.println();

        int min = Collections.min(Arrays.asList(arrMinMax));
        int max = Collections.max(Arrays.asList(arrMinMax));

        System.out.println("Min: " + min + " Max: " + max);



    }

}
