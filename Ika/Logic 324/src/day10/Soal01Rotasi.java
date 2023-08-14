package day10;

import java.util.Scanner;

public class Soal01Rotasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("banyak rotasi : ");
        int n = scanner.nextInt();

        System.out.print("panjang deret: ");
        int deret = scanner.nextInt();
        int[] arrA = new int[deret];
        System.out.print("masukan array: ");
        for (int i = 0; i < deret ; i++) {
            arrA[i] =  scanner.nextInt();
        }
        scanner.close();
        //membalik array
//        for (int i = arrA.length-1; i >=0 ; i--) {
//            System.out.print(arrA[i] + " ");
//        }

        for (int i = 0; i < n; i++) {
            int j, last;

            last= arrA[arrA.length-1];
            for (j = arrA.length-1; j >0 ; j--) {
                arrA[j] = arrA[j-1];
            }
            arrA[0]=last;
        }
        System.out.println();
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
    }
}
