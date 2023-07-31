package day4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

        int i,j,n;
        int a=1;
        int b=3;
        Scanner inputan = new Scanner(System.in);

        System.out.print("P = ");
        n = inputan.nextInt();

        System.out.print("S = ");
        j = inputan.nextInt();


        for(i=0; i<n; i++){
            System.out.print(a +"");
            a = a+1;
        }
        System.out.println();

        for(i=0; i<n; i++){
            System.out.print(b +"");
            b = b+1;

        }

    }
}
