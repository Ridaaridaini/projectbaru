package day3.latihan3;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        // n=7
        // 1 5 9 13 17 21 25

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();

        int x = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            x = x+4;

        }

    }
}
