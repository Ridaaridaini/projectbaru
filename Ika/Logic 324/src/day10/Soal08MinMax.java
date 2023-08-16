package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Soal08MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scanner.nextInt();

        int[] arrDeret = new int[n];
        System.out.print("masukan array: ");
        int i = 0;
        for (; i < arrDeret.length; i++) {
            arrDeret[i] = scanner.nextInt();
        }
//
//        Arrays.sort(arrDeret);
//        System.out.print("Min ="+arrDeret[0] + " Max = " + arrDeret[arrDeret.length-1]);

        System.out.println("============cara1============");
        int min = arrDeret[0];
        int max = arrDeret[0];
        for (int j = 0; j < arrDeret.length; j++) {
            if(arrDeret[j] < min){
                min = arrDeret[j];
                System.out.print(arrDeret[j]);
            }
            System.out.println("langkah ke " + j);
            System.out.println("min : " + min);
        }



    }
}
