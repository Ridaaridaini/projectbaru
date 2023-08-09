package day5.latihan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Soal10v2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer[] arrMinMax = new Integer[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("n-" + i + ": ");
            int n = scanner.nextInt();

            arrMinMax[i] = n;
        }

        Arrays.sort(arrMinMax);


        for (int i = 0; i < arrMinMax.length; i++) {
            System.out.print(arrMinMax[i] + " ");
        }

        System.out.println();
        System.out.print("min: " + arrMinMax[0]);
        System.out.print(", max: " + arrMinMax[arrMinMax.length-1]);



    }

}
