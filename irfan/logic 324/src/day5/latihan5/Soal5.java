package day5.latihan5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {

        int[] deret = {3, 2, 1, 5, 8};
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai yang dicari? ");
        int nilaiDicari = input.nextInt();

        boolean Kondisi = false;
        int posisi = -1;

        for (int i = 0; i < deret.length; i++) {
            if (deret[i] == nilaiDicari) {
                Kondisi = true;
                posisi = i + 1;
                break;
            }
        }

        if (Kondisi) {
            System.out.println("Nilai " + nilaiDicari + " ada dalam deret di posisi " + posisi + ".");
        } else {
            System.out.println("Nilai " + nilaiDicari + " tidak ada dalam deret.");
        }

     }
}

