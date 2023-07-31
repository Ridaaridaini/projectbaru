package day5;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {1,5,3,9,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
