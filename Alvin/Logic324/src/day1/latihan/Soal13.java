package day1.latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        double hargaBeli, hargaJual;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Harga beli: ");
        hargaBeli = scanner.nextDouble();

        System.out.print("Harga jual: ");
        hargaJual = scanner.nextDouble();

        scanner.close();

        double keuntungan = ((hargaJual-hargaBeli)/hargaBeli)*100;

        System.out.println("Keuntungan: " + keuntungan +"%");
    }
}
