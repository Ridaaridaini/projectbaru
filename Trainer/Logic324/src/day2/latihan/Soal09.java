package day2.latihan;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Isi Keranjang 1 : ");
        int isiKeranjang1 = input.nextInt();//0
        System.out.println("Isi Keranjang 2 : ");
        int isiKeranjang2 = input.nextInt();//2
        System.out.println("Isi Keranjang 3 : ");
        int isiKeranjang3 = input.nextInt();//1

        System.out.println("pilih Keranjang:");
        int pilih1 = input.nextInt();// 1
//        System.out.println("pilih Keranjang Kedua:");
//        int pilih2 = input.nextInt();

        int jumlah = 0;
        int hasil = isiKeranjang1 + isiKeranjang2 + isiKeranjang3;// hasil 3
        if(pilih1 == 1){// true
            jumlah = hasil - isiKeranjang1;// jumlah = 3
        } else if (pilih1 == 2 ) {
            jumlah = hasil - isiKeranjang2;
        } else if (pilih1 ==
                3 ) {
            jumlah = hasil - isiKeranjang3;
        }

        System.out.println("Jumlah Buah : "+ jumlah);


    }
    }
