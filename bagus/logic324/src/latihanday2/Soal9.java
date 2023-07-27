package latihanday2;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner keranjang = new Scanner(System.in);

        System.out.print("jumlah buah di keranjang 1= ");
        int BuahKeranjang1 = keranjang.nextInt();

        System.out.print("jumlah buah di keranjang 2= ");
        int BuahKeranjang2 = keranjang.nextInt();

        System.out.print("jumalh buah di keranjang 3= ");
        int BuahKeranjang3 = keranjang.nextInt();

        Scanner bawa = new Scanner(System.in);
        System.out.println("pilih keranjang yang mau dibawa= ");
        int BawaKeranjang = bawa.nextInt();


        if (BawaKeranjang == 1) {
            int hasil1 = BuahKeranjang2 + BuahKeranjang3;
            System.out.println("buah yang tersisa adalah= " + hasil1);
        } else if(BawaKeranjang == 2) {
            int hasil1 = BuahKeranjang1 + BuahKeranjang3;
            System.out.println("buah yang tersisa adalah= " + hasil1);
        } else if (BawaKeranjang == 3) {
            int hasil1 = BuahKeranjang1 + BuahKeranjang2;
            System.out.println("buah yang tersisa adalah= " + hasil1);
        }
    }
}


