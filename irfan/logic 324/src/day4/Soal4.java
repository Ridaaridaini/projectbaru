package day4;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka =");
        int n = input.nextInt();

        for (int i = 1; i <= n; i = i + 2) {// i =1 3 5 7
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 2; i <= n; i = i + 2) {//i = 2 4 6 8
            System.out.print(i + "");
        }
    }
}
