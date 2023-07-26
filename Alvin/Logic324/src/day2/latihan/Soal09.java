package day2.latihan;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        int keranjangSatu, keranjangDua, keranjangTiga, bawaKePasar;
        int n, m, jumlahBuah;

        Scanner scanner = new Scanner(System.in);

        System.out.print("keranjang 1: ");
        keranjangSatu = scanner.nextInt(); //0

        System.out.print("keranjang 2: ");
        keranjangDua = scanner.nextInt(); //10

        System.out.print("keranjang 3: ");
        keranjangTiga = scanner.nextInt(); // 5

        System.out.print("keranjang dibawa ke pasar: ");
        bawaKePasar = scanner.nextInt(); //1

        scanner.close();


        switch (bawaKePasar){
            case 1 :
                n = keranjangDua;
                m = keranjangTiga;
                jumlahBuah = n + m;
                System.out.println("Jumlah buah: " + jumlahBuah);
                break;
            case 2 :
                n = keranjangSatu;
                m = keranjangTiga;
                jumlahBuah = n + m;
                System.out.println("Jumlah buah: " + jumlahBuah);
                break;
            case 3 :
                n = keranjangSatu;
                m = keranjangDua;
                jumlahBuah = n + m;
                System.out.println("Jumlah buah: " + jumlahBuah);
                break;
            default:
                System.out.println("keranjangnya cuman 3 bossku");
                break;
        }


    }
}
