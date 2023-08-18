package simulasiFT1;

import java.util.Scanner;

public class Soal01A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scanner.nextInt();

        System.out.print("masukan angka kelipatan a: ");
        int a = scanner.nextInt();

        System.out.print("masukan angka kelipan b: ");
        int b= scanner.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        int a1 =a; int b1=b;
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] =a;
            System.out.print(arrA[i] + " ");
           a=a+a1;
        }

        System.out.println();
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] =b;
            System.out.print(arrB[i] + " ");
            b=b+b1;
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            if(i==n-1){
                System.out.print(arrA[i]+arrB[i] + " ");
            }else{
                System.out.print(arrA[i]+arrB[i] + ",");
            }

        }
    }
}
