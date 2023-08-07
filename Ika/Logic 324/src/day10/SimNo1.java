package day10;

import java.util.Scanner;

public class SimNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        int input = scanner.nextInt();
        int[] arrI = new int[input];
        int min = arrI[0];
        for (int i = 0; i < arrI.length; i++) {
            System.out.print(arrI[i] + " ");

        }

        for (int i = 0; i < arrI.length; i++) {
            if(arrI[i]<min){
                min=arrI[i];
            }
            System.out.print(min + " ");
        }


    }
}
