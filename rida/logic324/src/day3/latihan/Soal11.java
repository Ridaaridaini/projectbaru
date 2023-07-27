package day3.latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah n: ");
        Integer n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0;  j <n ; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
