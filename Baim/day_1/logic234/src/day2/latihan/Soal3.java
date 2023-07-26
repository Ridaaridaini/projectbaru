package day2.latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan lebar persegi panjang: ");
        int y = scanner.nextInt();

        scanner.close();
        
        System.out.println("====================================");
        if (x < 1) {
            System.out.println("Panjang tidak boleh kurang dari 1");
        } else if (y < 1) {
            System.out.println("Lebar tidak boleh kurang dari 1");
        } else {
            int hasil = x * y;
            System.out.println("Luas persegi panjang adalah: " + hasil);
        }
    }
}
