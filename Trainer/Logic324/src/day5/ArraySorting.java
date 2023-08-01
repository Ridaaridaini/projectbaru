package day5;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

    public static void main(String[] args) {

        Integer[] arrA = {1, 5, 3, 9, 7};

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        System.out.println();

        //Sorting Ascending (1, 3, 5, 7, 9)
        Arrays.sort(arrA);

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        System.out.println();

        //Sorting Descending (9, 7, 5, 3, 1)
        Arrays.sort(arrA, Collections.reverseOrder());

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }

    }

}
