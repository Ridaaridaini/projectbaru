package day1.latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan harga beli barang (x): ");
        double hargaBeli = scanner.nextDouble();

        System.out.print("Masukkan harga jual barang (y): ");
        double hargaJual = scanner.nextDouble();

        double keuntunganPerSen = (hargaJual - hargaBeli) / hargaBeli * 100;
        System.out.println("Keuntungan per sen: " + keuntunganPerSen + "%");

        scanner.close();
    }
}
