package day4.latihan;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inputkan Nilai P : ");
        int p = input.nextInt();
        System.out.println("Inputkan Nilai S : ");
        int s = input.nextInt();

        for (int i = 1; i <=p ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = s; j < s+p ; j++) {
            System.out.print(j + " ");
        }
        }
    }
