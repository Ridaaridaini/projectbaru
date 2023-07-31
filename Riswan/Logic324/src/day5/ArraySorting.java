package day5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        Integer[] arr = {1,5,3,9,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //ascending
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //decesding
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
