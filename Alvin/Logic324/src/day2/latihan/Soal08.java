package day2.latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        long x;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Uang Alfin: ");
        x = scanner.nextLong();
        scanner.close();

        if (x >= 50_000 && x < 100_000){
            System.out.println("Beli Kaos");
        } else if (x >= 100_000 && x < 250_000) {
            System.out.println("Beli Kemeja");
        } else if (x >= 250_000 && x < 750_000) {
            System.out.println("Beli Celana Panjang");
        } else if (x >= 750_000) {
            System.out.println("Beli Jas");
        }
    }
}
