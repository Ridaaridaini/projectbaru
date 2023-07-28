package day3.latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input nilai n : ");
        int n = input.nextInt();
        int total = 2;
        for (int i = 1; i <=n ; i++) {
            System.out.print(total + " ");
            total = total * 2;
        }
    }
}
