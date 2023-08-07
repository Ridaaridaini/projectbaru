package latihanB;

import java.util.Scanner;

public class Soal1Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan n: ");
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
