package day5.latihan;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Panjang Array : ");
        int panjang = input.nextInt();
        int bilangan = 0;

        int[] element = new int[panjang];

        for (int i = 0; i < element.length; i++) {
            element[i] = 1 + bilangan;
            bilangan = bilangan + 2;
        }
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
    }
}
