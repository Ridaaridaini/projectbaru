package latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class soal13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Masukkan harga beli barang: ");
        int hargaAwal = input.nextInt();

        System.out.print("Masukkan harga jual: ");
        int hargaJual = input.nextInt();

        input.close();

        int untung = hargaJual - hargaAwal;
        String persen = df.format(untung/(float) hargaAwal * 100);
        System.out.println("======================");
        System.out.println("Keuntungan yang diperoleh adalah sebesar " + persen + "%");
        System.out.println("======================");
    }
}
