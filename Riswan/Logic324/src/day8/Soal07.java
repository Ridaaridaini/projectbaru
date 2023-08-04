package day8;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Isi Keranjang 1 : ");
        int isiKeranjang1 = input.nextInt();
        System.out.println("Isi Keranjang 2 : ");
        int isiKeranjang2 = input.nextInt();
        System.out.println("Isi Keranjang 3 : ");
        int isiKeranjang3 = input.nextInt();

        System.out.println("pilih Keranjang:");
        int pilih1 = input.nextInt();
//        System.out.println("pilih Keranjang Kedua:");
//        int pilih2 = input.nextInt();

        int jumlah = 0;
        int hasil = isiKeranjang1 + isiKeranjang2 + isiKeranjang3;
        if(pilih1 == 1){
            jumlah = hasil - isiKeranjang1;
        } else if (pilih1 == 2 ) {
            jumlah = hasil - isiKeranjang2;
        } else if (pilih1 == 3 ) {
            jumlah = hasil - isiKeranjang3;
        }

        System.out.println("Jumlah Buah : "+ jumlah);
    }
}
