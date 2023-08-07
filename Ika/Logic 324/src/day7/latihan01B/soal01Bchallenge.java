package day7.latihan01B;

import java.util.Scanner;

public class soal01Bchallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan n: ");
        int n = scanner.nextInt();


        System.out.println("bilangan ganjil terbesar ke terkecil");
        System.out.print("bilangan ganjil: ");
        for (int i = n; i >= 1; i--) {
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println();
        System.out.println("bilangan genap terbesar ke terkecil");
        for (int i = n; i >= 1; i--) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
