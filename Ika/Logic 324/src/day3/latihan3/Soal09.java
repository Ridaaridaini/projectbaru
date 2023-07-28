package day3.latihan3;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();

        double a = 4;
        double b = 0;
        double c ;

        int x=1;

        System.out.println("*************CARA 1***********");
        for (int i = 1; i < n+1; i++) {
            if(i %3 ==0){
                System.out.print(" * ");

            }
            b++;
            c=Math.pow(a,b);
            System.out.print(c + " ");

        }

        System.out.println("\n");
        System.out.println("********CARA 2*************");
        for (int i = 1; i < n+1; i++) {
            if(i%3==0){
                System.out.print(" * ");
                continue;
            }
            x=x*4;
            System.out.print(x + " ");

        }

    }
}
