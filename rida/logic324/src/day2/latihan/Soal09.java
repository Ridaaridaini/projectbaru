package day2.latihan;

import java.util.Scanner;

public class Soal09 {
    /*Terdapat 3 keranjang buah di dapur. Salah satu keranjang kosong dan sisanya berisi masing-masing n & m buah.
Apabila salah satu keranjang tersebut dibawa ke pasar, maka berapa jumlah buah yang terdapat di dapur sekarang?
Output : Jumlah Buah		Input = nilai n, m & keranjang yang dibawa ke pasar.	*/
    /*public static void main(String[] args) {
        int keranjang1;
        int keranjang2;
        int keranjang3;
        Scanner input = new Scanner(System.in);
        System.out.println("Keranjang berapakah yang akan di kosongkan");
        Integer x = input.nextInt();
        if (x == 1) {
            keranjang1 = 0;
            System.out.println("Masukkan jumlah buah pada keranjang n ");
            keranjang2 = input.nextInt();
            System.out.println("Masukkan jumlah buah pada keranjang m ");
            keranjang3 = input.nextInt();

        } else if (x == 2) {
            keranjang2 = 0;
            System.out.println("Masukkan jumlah buah pada keranjang n ");
            keranjang1 = input.nextInt();
            System.out.println("Masukkan jumlah buah pada keranjang m ");
            keranjang3 = input.nextInt();
        } else if (x == 3) {
            keranjang3 = 0;
            System.out.println("Masukkan jumlah buah pada keranjang n ");
            keranjang1 = input.nextInt();
            System.out.println("Masukkan jumlah buah pada keranjang m ");
            keranjang2 = input.nextInt();
        }
        System.out.println("Keranjang yang akan dibawa?  ");
        Integer y = input.nextInt();
        if (y==1){
            int total;
            total= keranjang2 + keranjang3;
            System.out.println("Jumlah buah: " +total);
        } else if (y==2) {
            int total;
            total= keranjang1+keranjang3;
            System.out.println("Jumlah buah: " +total);
        } else if (y==3) {
            int total;
            total= keranjang1+keranjang2;
            System.out.println("Jumlah buah: " +total);
        }


    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah buah pada keranjang 1: ");
        Integer keranjang1 = input.nextInt();
        System.out.print("Masukkan jumlah buah pada keranjang 2: ");
        Integer keranjang2 = input.nextInt();
        System.out.print("Masukkan jumlah buah pada keranjang 3: ");
        Integer keranjang3= input.nextInt();
        System.out.print("Keranjang yang akan dibawa?  ");
        Integer y = input.nextInt();
        if (y==1){
            int total;
            total= keranjang2 + keranjang3;
            System.out.println("Jumlah buah: " +total);
        } else if (y==2) {
            int total;
            total= keranjang1+keranjang3;
            System.out.println("Jumlah buah: " +total);
        } else if (y==3) {
            int total;
            total= keranjang1+keranjang2;
            System.out.println("Jumlah buah: " +total);
        }


    }
}
