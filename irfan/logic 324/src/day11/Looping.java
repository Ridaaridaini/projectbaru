package day11;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {

        int a = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int input = scanner.nextInt();


        for (int i = 0; i < input; i++) {

            System.out.print(a+ " ");
            a = a * 3;

        }

    }
}
