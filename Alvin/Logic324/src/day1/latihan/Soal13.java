package day1.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        int hargaBeli, hargaJual;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Harga beli: ");
        hargaBeli = scanner.nextInt();

        System.out.print("Harga jual: ");
        hargaJual = scanner.nextInt();

        scanner.close();

        double keuntungan = hargaJual-hargaBeli;

        DecimalFormat decimal = new DecimalFormat("##.00");
        String presentaseKeuntungan = decimal.format((keuntungan/hargaBeli)*100);

        System.out.println("Keuntungan: " + presentaseKeuntungan +"%");
    }
}
