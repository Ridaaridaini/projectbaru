package day3.latihan;

import java.util.Scanner;

public class Soal12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                if (i > j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
