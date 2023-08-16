package latihanulang;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("n: ");
        Integer n= input.nextInt();
        int a=1,b=2;
        for (int i = 0; a<=n; i++) {
            System.out.print(a+" ");
            a=a+2;
        }
        System.out.println();
        for (int i = 0; b<=n; i++) {
            System.out.print(b+" ");
            b=b+2;
        }
    }
}
