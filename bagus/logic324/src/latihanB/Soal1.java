package latihanB;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan n: ");
        int n = input.nextInt();

        for (int i = n; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i = 2; i <= n; i = i+2) {
            System.out.print(i+ " ");
        }

    }
}
