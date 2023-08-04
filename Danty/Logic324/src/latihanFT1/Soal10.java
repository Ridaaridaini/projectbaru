package latihanFT1;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Panjang Deret : ");
        int n = input.nextInt();

        //Deret Bilangan Ganjil

        int [] arrA = new int [n];
        int [] arrB = new int [n];

        int a = 1;
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = a;
            System.out.print(arrA[i] + " ");
            a = a+2;

        }
        System.out.println();
        int b = 1; //ini fn
        int c = 1;
        int d = 0;
        for (int i = 0; i < arrB.length; i++) {
            arrB [i] = b;
            System.out.print(arrB[i] + " ");
            b = c + d;
            d = c;
            c = b;

            }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int total = arrA[i] + arrB[i];
            System.out.print(total + " ");
        }


                }

            }



