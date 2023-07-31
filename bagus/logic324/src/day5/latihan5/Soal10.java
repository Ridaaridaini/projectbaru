package day5.latihan5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];



        for (int i = 0; i < array.length; i++) {
            System.out.print("input index ke " + i + " : ");
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            min = array[0];
            max = array.length - 1;


        }
        System.out.println();
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        

    }
}
