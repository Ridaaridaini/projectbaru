package latihanekstra;

import java.util.Scanner;

public class Soal22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String[] kata = scanner.nextLine().split("");

        for (int i = kata.length; i > 0; i--) {
            for (int j = 0; j < (kata.length / 2); j++) {
                System.out.print("*");
            }

            System.out.print(kata[i - 1]);

            for (int j = 0; j < (kata.length / 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// if (kata.length % 2 == 0) {
// } else {
// for (int i = kata.length; i > 0; i--) {
// for (int j = 0; j < (kata.length / 2); j++) {
// System.out.print("*");
// }

// System.out.print(kata[i - 1]);

// for (int j = 0; j < (kata.length / 2); j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }