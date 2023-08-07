package day4.LoopingLanjutan;

import java.util.Scanner;

public class Soal2PanjangdanAwalanDeret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Panjang deret: ");
        int panjang = input.nextInt();//7
        System.out.println("Masukkan awalan deret ");
        int awalan = input.nextInt();//3
        int n = 1;
        for (int i = 0; i < panjang; i++) {
                System.out.print(n);
                n = n+1;
            }
        System.out.println();
        for (int i = 0; i < panjang ; i++) {
            System.out.print(awalan);
            awalan = awalan+1;

        }

        }

    }

