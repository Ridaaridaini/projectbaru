package day3.latihan3;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();

        double a=2;
        double b= 0;
        double c;
        for (int i = 0; i < n; i++) {
            b++;
            c = Math.pow(a,b);
            System.out.print( c + " ");

        }

    }
}
