package day7.soalSimulasi.SoalA;

import java.util.Scanner;

public class Soal7AKeranjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBuah = 0;
        System.out.println("Masukkan keranjang buah dikeranjang 1:");
        int keranjang1 = input.nextInt();
        System.out.println("Masukkan keranjang buah dikeranjang 2:");
        int keranjang2 = input.nextInt();
        System.out.println("Masukkan keranjang buah dikeranjang 3:");
        int keranjang3 = input.nextInt();

        System.out.println("Masukkan keranjang yang akan  dibawa: ");
        int keranjangBawa = input.nextInt();

        if (keranjangBawa == 1){
            totalBuah = keranjang2 + keranjang3;
            System.out.println("Jumlah buah: "+ totalBuah);

        } else if (keranjangBawa == 2) {
            totalBuah = keranjang1 + keranjang3;
            System.out.println("Jumlah buah: "+ totalBuah);

        }else if (keranjangBawa == 3){
            totalBuah = keranjang1 + keranjang2;
            System.out.println("Jumlah buah: "+ totalBuah);
        }else {
            System.out.println("input yang dimasukkan salah");
        }


    }
}
