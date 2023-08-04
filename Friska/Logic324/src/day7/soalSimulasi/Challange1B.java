package day7.soalSimulasi;

import java.util.Scanner;

public class Challange1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i = i+2) {

            System.out.print(i + " ");// 1 3 5 7


        }
        System.out.println();
        for (int i = 2; i <= n; i = i+2) {
            System.out.print(i + " ");


        }
    }
}

