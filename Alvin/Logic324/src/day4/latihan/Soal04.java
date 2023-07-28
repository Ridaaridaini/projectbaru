package day4.latihan;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

    int n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if ((i+1) % 2 != 0){
                System.out.print(i+1 + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            if ((i+1) % 2 == 0){
                System.out.print(i+1 + " ");
            }

        }

        scanner.close();


    }

}
