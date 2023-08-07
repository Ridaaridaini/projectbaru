package day1BasicJava.latihan;

import java.util.Scanner;

public class Soal13PersenKeuntungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah harga beli :");
        double xhargabeli = input.nextDouble();

        System.out.println("Masukkan jumlah harga jual: ");
        double yhargajual = input.nextDouble();
        input.close();
        double keuntungan = yhargajual-xhargabeli;
        double persentaseUntung = (keuntungan / xhargabeli)*100;

        System.out.println("Keuntungan yg diperoleh yaitu: "+persentaseUntung+"%");
    }
}
