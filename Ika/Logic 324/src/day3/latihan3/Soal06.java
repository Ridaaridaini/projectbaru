package day3.latihan3;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();

        int a= 1;// 1 5 9
        for (int i = 1; i < n+1; i++) {//i=1 2 3
            if( i%3==0){
                a= a+4;
                System.out.print(" * ");
                continue;
            }
            System.out.print(a + " ");
            a= a+4;

            //output = 1 5 *
        }
    }
}
