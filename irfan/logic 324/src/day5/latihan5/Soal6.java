package day5.latihan5;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrA = {1,2,3,4,5,6,7};
        int index0 = 0;
        int index1 = 1;
        int index2 = 3;

        int total = arrA[index0]+ arrA[index1] + arrA[index2];
        System.out.println("total = "+ total);

    }
}
