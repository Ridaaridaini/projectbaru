package day5.Latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrA = { 3, 2, 1, 5, 8 };

        System.out.print("Nilai yang dicari: ");
        int nilai = scanner.nextInt();

        int indeks = 0;
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] == nilai) {
                indeks = i;
                System.out.println("Nilai " + nilai + " Ada dalam indeks " + indeks);
                indeks += 1;
                break;
            }
        }

        if (indeks == 0) {
            System.out.println("Nilai " + nilai + "Tidak ada dalam deret");
        }
    }
}
