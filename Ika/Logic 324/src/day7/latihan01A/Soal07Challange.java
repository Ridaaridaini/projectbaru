package day7.latihan01A;

import java.util.Scanner;

public class Soal07Challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("keranjang 1: ");
        int keranjang1 = scanner.nextInt();

        System.out.print("keranjang 2: ");
        int keranjang2 = scanner.nextInt();

        System.out.print("keranjang 3: ");
        int keranjang3 = scanner.nextInt();

        System.out.print("pilih keranjang (1,2 atau 3): ");
        int pilih = scanner.nextInt();
        int totalBuah;

        if(pilih==1){
            totalBuah= keranjang2+keranjang3;
            System.out.println("total buah: " + totalBuah);
        } else if (pilih==2) {
            totalBuah=keranjang1+keranjang3;
            System.out.println("total buah: " + totalBuah);
        }else if(pilih==3){
            totalBuah=keranjang1+keranjang2;
            System.out.println("total buah: " + totalBuah);
        }else {
            totalBuah=keranjang1+keranjang2+keranjang3;
            System.out.println("total buah: " + totalBuah);
        }
    }
}
