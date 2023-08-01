package day5.latihan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class soal10 {
    public static void main(String[] args) {
    //"Tentukan nilai minimal dan maksimal dari seluruh komponen
        // dalam deret dengan panjang 10 ini.
        //Input : 1 2 4 7 8 6 9 2 5 4
        //Output : Min = 1, Max =9"
        Scanner scanner = new Scanner(System.in);
        int[] arrA = {1,2,4,7,8,6,9,2,5,4};
        Integer[] arrB = {1,2,4,7,8,6,9,2,5,4};


        System.out.println("=================CARA 1==================");
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }

        System.out.println();
        Arrays.sort(arrA);
        for (int i = 0; i < arrA.length; i++) {
//            System.out.print(arrA[i] + " ");
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

        System.out.println();
        System.out.println("===========CARA 2================");

        System.out.print("input panjang array :");
        int b = scanner.nextInt();
        int[] arrC = new int[b];

        for (int i = 0; i < arrC.length; i++) {
            System.out.print("input ke-" + i + " : ");
            arrC[i] = scanner.nextInt();
        }

        int min = arrC[0];
        int max = arrC[0];

        for (int i = 0; i < arrC.length; i++) {
            System.out.print(arrC[i] +" ");

        }
        //mencari nilai min
        for (int i = 0; i < arrC.length-1; i++) {
            if(arrC[i] < min){
                min=arrC[i];
            }
            System.out.println("langkah ke "+ i);
            System.out.print("MIN : " +min);
        }

        //mencari nilai max
        for (int i = 0; i < arrC.length; i++) {
            if (arrC[i]> max){
                max=arrC[i];
            }

            System.out.println("langkah ke "+ i);
            System.out.println("MAX " + max);
        }

        System.out.println("MAX= " +max+ " MIN= " +min);

    }
}
