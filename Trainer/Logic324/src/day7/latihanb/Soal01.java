package day7.latihanb;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n : ");
        int n = scanner.nextInt();

        //ganjil
        int ganjil = 1;
        for (; ganjil <= n;) {
            System.out.print(ganjil + " ");
            ganjil = ganjil + 2;
        }

        System.out.println();

        //genap
        int genap = 2;
        for (; genap <= n;) {
            System.out.print(genap + " ");
            genap = genap + 2;
        }

        System.out.println();

    }
}
