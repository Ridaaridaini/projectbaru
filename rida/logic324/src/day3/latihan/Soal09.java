package day3.latihan;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah n: ");
        Integer n = input.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 2 && i != 0){
                System.out.print("* ");
                continue;
            }
            a=a*4;
            System.out.print(a + " ");

        }
    }
}


