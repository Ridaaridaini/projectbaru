package day4.latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang deret: ");
        int panjang = scanner.nextInt();

        System.out.print("Start deret: ");
        int start = scanner.nextInt();

        for (int i = 0; i < panjang; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println("");
        for (int i = 0; i < panjang; i++) {
            System.out.print(start + " ");
            start++;
        }
    }
}
