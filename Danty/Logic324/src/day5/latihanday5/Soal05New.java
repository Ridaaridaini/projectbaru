package day5.latihanday5;

import java.util.Scanner;

public class Soal05New {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrA = {3, 2, 1, 5, 8};

        System.out.print("Nilai yang dicari? ");
        int nilai = input.nextInt();

        int a = 0; // a = 0 artinya belum ketemu, misal a = 1 berarti ketemu

        int posisi = 0;

        for (int i = 0; i < arrA.length; i++) {

            int kotakSekarang = arrA[i];

            if (kotakSekarang == nilai) {

                a = 1;
                posisi = i+1;
                break;

            }

        }
        if (a == 1) {

            System.out.print("Nilai "+ nilai + " ada di dalam deret, posisi " + posisi );

        } else if (a == 0) {

            System.out.print("Nilai tidak ada di dalam deret");
        }


    }
}


