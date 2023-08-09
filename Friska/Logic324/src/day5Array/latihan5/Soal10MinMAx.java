package day5Array.latihan5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10MinMAx {
    public static void main(String[] args) {

        int ArrA [] = new int [10];
        int Min = 0, Max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        for (int i = 0; i < ArrA.length; i++) {
            int angka = input.nextInt();
            ArrA[i] = angka;
        }
        Arrays.sort(ArrA);

        for (int i = 0; i < ArrA.length; i++) {
            System.out.print(ArrA[i]+" ");
        }
        System.out.println();
        Min = ArrA[0];
        Max = ArrA[ArrA.length-1];
        System.out.println();
        System.out.println("Min "+ Min + " ; Max "+ Max);


        }
}
