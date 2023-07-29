package day4.latihan4;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) { // <= n supaya n nya juga masuk
            if (i % 3 == 0 && i % 2 == 0){
                System.out.println(i);
        }


        }

    }
}
