package day5.latihanday5;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] arrA = new int[10]; //{1,2.4,7,8,6,9,2,5,4}

       int min = arrA.length; //min = 1
       int max = 0; //max = 4

        for (int i = 0; i < arrA.length; i++) {
            System.out.print("Indeks ke " + i + " : ");
            arrA[i] = input.nextInt();

        }
        for (int i = 0; i < arrA.length; i++) {// i = 0 1 2
            int a = arrA[i]; //a = 1 2
            if(a < min){ //true
                min = a;
            }
            if (a > max){
                max = a;
            }

        }
        System.out.print("Min = " + min + ", Max = " + max);

    }
}
