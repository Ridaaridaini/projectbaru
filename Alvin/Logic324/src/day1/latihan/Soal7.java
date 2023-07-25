package day1.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang sisi persegi: ");
        x = scanner.nextInt();

        System.out.print("Panjang sisi segitiga: ");
        y = scanner.nextInt();

        boolean perbandingan =  (4 * x) > (3 * y);

        System.out.println("Keliling persegi lebih besar dari keliling segitiga? : " + perbandingan);

        scanner.close();
    }
}
