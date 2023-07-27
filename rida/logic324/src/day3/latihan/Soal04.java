package day3.latihan;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan jumlah n: ");
        Integer n= input.nextInt();
        int a=1;
        for (int i = 0; i <  n ; i++) {
            System.out.print(a+" ");
            a= a+4;

        }
    }
}
