package day3.latihan;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("deret n: ");
        int n = scanner.nextInt();

        int x = 2;
        for (int i = 0; i < n; i++) {

            System.out.print(x + " ");
            x = x + 2;

        }

    }

}
