package day2.latihan2;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        int keranjang1, keranjang2, keranjang3, kepasar;

        Scanner input = new Scanner(System.in);

        System.out.print(" keranjang 1 = ");
        keranjang1 = input.nextInt();

        System.out.print(" keranjang 2 = ");
        keranjang2 = input.nextInt();

        System.out.print(" keranjang 3 = ");
        keranjang3 = input.nextInt();

        System.out.print(" dibawa kepasar = ");
        kepasar = input.nextInt();

        int hasil1 = keranjang2 + keranjang3;
        int hasil2 = keranjang1 + keranjang3;
        int hasil3 = keranjang1 + keranjang2;

        if(kepasar == 1 ){
            System.out.println("jumlah buah = " + hasil1);
        } else if (kepasar == 2) {
            System.out.println("jumlah buah = " + hasil2);
        } else if (kepasar == 3) {
            System.out.println("jumlah buah = " + hasil3);
        }else {
            System.out.println("error");
        }


    }
}
