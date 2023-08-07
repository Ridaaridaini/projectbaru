package day3LoopingBasic.latihan3;

import java.util.Scanner;

public class Soal10XXX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n: ");
        int n = input.nextInt();
        int bilangan = 3;
        for (int i = 0; i < n; i++) {
            if (i == n / 2) { // i ke -4
                System.out.print("  xxx  ");
                bilangan = bilangan * 3;
                continue;
            }
            if (n % 2 == 0) {
                if (i == n / 2) {
                    System.out.print("  xxx  ");
                    bilangan = bilangan * 3;
                    continue;

                } else if (i == n / 2 - 1) {
                    System.out.print("  xxx  ");
                    bilangan = bilangan * 3;
                    continue;
                }

            }
            System.out.print(bilangan + " ");
            bilangan = bilangan * 3;
        }
    }
}
