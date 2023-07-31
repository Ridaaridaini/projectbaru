package day5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        int[] arrA={1,5,3,9, 7};

        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i] + " ");
        }

        //sorting accending (1,22,5,7,9)
        Arrays.sort(arrA);

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");

        }

        System.out.println();
        Integer[] arrB= {3,5,6,8,1,2};
        //sorting desencing
        Arrays.sort(arrB, Collections.reverseOrder());
        for (int i = 0; i < arrB.length ; i++) {
            System.out.print(arrB[i] + " ");

        }

    }
}
