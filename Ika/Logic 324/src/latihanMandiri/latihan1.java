package latihanMandiri;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyak baris n: ");
        int n= input.nextInt();

        input.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}