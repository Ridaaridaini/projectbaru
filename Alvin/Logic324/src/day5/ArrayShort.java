package day5;

import java.util.Arrays;
import java.util.Collections;

public class ArrayShort {

    public static void main(String[] args) {

        int[] arrA = {1,5,3,9,7};

        for (int j : arrA) {
            System.out.print(j);
        }

        //shorting ascending
        Arrays.sort(arrA);
        System.out.println();
        for (int j : arrA) {
            System.out.print(j);
        }

        //short descending
        Integer[] arrB = {1,7,9,5,3};
        System.out.println();
        Arrays.sort(arrB, Collections.reverseOrder());

        for (int i : arrB) {
            System.out.print(i);
        }
    }

}
