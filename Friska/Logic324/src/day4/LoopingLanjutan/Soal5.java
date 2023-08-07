package day4.LoopingLanjutan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) { // <= n supaya n nya juga masuk
            if (i % 3 == 0 && i != 0) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }
                continue;
            }

        }

    }
}
