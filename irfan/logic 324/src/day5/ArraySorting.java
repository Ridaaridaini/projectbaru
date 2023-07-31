package day5;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[] arrA = {1,5,3,9,7};

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        System.out.println();
        //sorting ascending ( 1,3,5,7,9)
        Arrays.sort(arrA);

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i]+" ");

        }
    }
}
