package day1.latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah harga beli :");
        float xhargabeli = input.nextInt();

        System.out.println("Masukkan jumlah harga jual: ");
        float yhargajual = input.nextInt();
        input.close();
        float keuntungan = yhargajual-xhargabeli;
        float persentaseUntung = ((keuntungan / yhargajual)*100);

        System.out.println("Keuntungan yg diperoleh yaitu: "+persentaseUntung+"%");
    }
}
