package day5.latihan;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {
        int angka = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("panjang array: ");
        int x = scanner.nextInt();

        int[] arrA = new int[x];

        for (int i = 0; i < x; i++) {

            if (angka % 2 !=0){
                arrA[i] = angka;
            }else{
                i = i -1;
            }

            angka = angka +1;

        }

        for (int i = 0; i < x; i++) {
            System.out.print(arrA[i] + " ");
        }


    }

}
