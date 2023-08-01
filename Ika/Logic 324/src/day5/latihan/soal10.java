package day5.latihan;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

public class soal10 {
    public static void main(String[] args) {
    //"Tentukan nilai minimal dan maksimal dari seluruh komponen
        // dalam deret dengan panjang 10 ini.
        //Input : 1 2 4 7 8 6 9 2 5 4
        //Output : Min = 1, Max =9"
        int[] arrA = {1,2,4,7,8,6,9,2,5,4};
        Integer[] arrB = {1,2,4,7,8,6,9,2,5,4};

        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }

        System.out.println();
        Arrays.sort(arrA);
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        System.out.println();
        System.out.print("MIN "+ arrA[0] + " ");

        System.out.println();
        Arrays.sort(arrB, Collections.reverseOrder());
        for (int j = 0; j < arrB.length; j++) {
            System.out.print(arrB[j] + " ");
        }
        System.out.println();
        System.out.print("MAX " + arrB[0]);


    }
}
