package simulasiFT1;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt();

        int[] arrFibo = new int[x];

        arrFibo[0] = 1;
        arrFibo[1] = 1;

        if (x == 1) {
            System.out.println(arrFibo[0] + " ");

        } else if (x > 1) {

            System.out.print(arrFibo[0] + " ");
            System.out.print(arrFibo[1] + " ");
        }

        for (int i = 2; i < arrFibo.length; i++) {

            arrFibo[i] = arrFibo[i - 2] + arrFibo[i - 1];
            System.out.print(arrFibo[i] + " ");


        }

        System.out.println();
        for (int i = 0; i < x; i++) {

            if(arrFibo[i]%2 == 1 && arrFibo[i]<x){

                 System.out.print(arrFibo[i] + " ");
             }




        }

    }
}

