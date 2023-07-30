package day3.latihan;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input nilai n : ");
        int n = input.nextInt();
        int angka = 1;
        for (int i = 1; i <=n ; i++) {
            System.out.print(" " + angka);
            if(i % 2 == 0){
                angka = angka + 4;
                System.out.print(" * ");
                n=n-1;
                angka = angka + 4;

            }else {
                angka = angka + 4;
            }

        }
}}
