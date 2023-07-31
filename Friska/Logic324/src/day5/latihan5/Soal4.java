package day5.latihan5;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang array: ");
        int panjang = input.nextInt();
        int a = 1;
        int[] arrA = new int [panjang];

        for (int i = 0; i < panjang; i++) {
            System.out.print(a+ " ");
            arrA[i] = a;
            a = a + 2;

            }

        }
    }

