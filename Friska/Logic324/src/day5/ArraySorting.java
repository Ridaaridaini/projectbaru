package day5;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int [] arrA = {1,5,3,9,7};

        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]+" ");

        }
        // Sorting Ascending
        Arrays.sort(arrA);
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]+" ");

        }




    }

}
