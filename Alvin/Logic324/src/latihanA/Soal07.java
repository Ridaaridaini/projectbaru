package latihanA;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        int keranjang1, keranjang2, keranjang3, kePasar, jumlahBuah;

        Scanner scanner = new Scanner(System.in);

        System.out.print("keranjang 1: ");
        keranjang1 = scanner.nextInt();
        System.out.print("keranjang 2: ");
        keranjang2 = scanner.nextInt();
        System.out.print("keranjang 3: ");
        keranjang3 = scanner.nextInt();
        System.out.print("dibawa ke pasar: ");
        kePasar = scanner.nextInt();

        if (kePasar == 1){
            jumlahBuah = keranjang2+keranjang3;
            System.out.println("jumlah buah: " + keranjang2 + " + " + keranjang3 + " = " + jumlahBuah);
        } else if (kePasar == 2) {
            jumlahBuah = keranjang1+keranjang3;
            System.out.println("jumlah buah: " + keranjang1 + " + " + keranjang3 + " = " + jumlahBuah);
        } else if (kePasar == 3) {
            jumlahBuah = keranjang1+keranjang2;
            System.out.println("jumlah buah: " + keranjang1 + " + " + keranjang2 + " = " + jumlahBuah);
        }else{
            System.out.println("anda di luar angkasa!");
        }


    }

}
