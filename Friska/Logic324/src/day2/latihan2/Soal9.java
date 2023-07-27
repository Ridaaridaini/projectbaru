package day2.latihan2;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan isi keranjang 1: ");
        int keranjang1 = input.nextInt();
        System.out.println("Masukkan isi keranjang 2: ");
        int keranjang2 = input.nextInt();
        System.out.println("Masukkan isi keranjang 3: ");
        int keranjang3 = input.nextInt();
        System.out.println("Masukkan keranjang berapa yang ingin dibawa");
        int kepasar = input.nextInt();
        if (kepasar == 1){
            int jumBuah1 =  keranjang2 + keranjang3;
            System.out.println("Jumlah buah yang tidak dibawa kepasar adalah "+ jumBuah1);
        }
        else if (kepasar == 2){
            int jumBuah2 = keranjang1 + keranjang3;
            System.out.println("Jumlah buah yang tidak dibawa kepasar adalah "+ jumBuah2);
        }
        else if (kepasar == 3){
            int jumBuah3 = keranjang1 +keranjang2;
                System.out.println("Jumlah buah yang tidak dibawa kepasar adalah "+ jumBuah3);
            }

        else {
            System.out.println("Input anda tidak valid");
        }

    }
}
