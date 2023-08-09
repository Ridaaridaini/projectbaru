package day10;

import java.util.Scanner;

public class Ekstra1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("masukan panjang deret : ");
        int n= scanner.nextInt();

        int[] arrN = new int[n];
        int a= 2;
        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = a;
            if(i%2 != 0){
                System.out.print(" * ");
            }else {
                System.out.print(arrN[i] + " ");
            }
            a=a+1;
        }


    }
}
