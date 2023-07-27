package day3.latihan3;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        int i, n;
        int a=1;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        n = inputan.nextInt();

        for(i=0; i<n; i++){    //
            System.out.print(a + " ");
            a= a+2;
        }
        System.out.println();
    }
}
