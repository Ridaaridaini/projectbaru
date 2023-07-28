package day2.latihan2;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        //Terdapat 3 keranjang buah di dapur. Salah satu keranjang kosong dan sisanya berisi masing-masing n & m buah.
        //Apabila salah satu keranjang tersebut dibawa ke pasar, maka berapa jumlah buah yang terdapat di dapur sekarang?
        //
        //Contoh		Contoh
        //Keranjang 1 = kosong		Keranjang 1 = 3
        //Keranjang 2 = 10		Keranjang 2 = kosong
        //Keranjang 3 = 5		Keranjang 3 = 8
        //Keranjang 1 dibawa ke pasar.		Keranjang 3 dibawa ke pasar.
        //Jumlah Buah = 10 + 5 = 15.		Jumlah Buah = 3 + 0 = 3.
        //
        //Output : Jumlah Buah		Input = nilai n, m & keranjang yang dibawa ke pasar.


        Scanner input = new Scanner(System.in);
        System.out.println();


        System.out.print("sisa buah dikeranjang 1: ");
        int keranjang1 = input.nextInt();
        System.out.print("sisa buah dikeranjang 2: ");
        int keranjang2 = input.nextInt();
        System.out.print("sisa buah dikeranjang 3: ");
        int keranjang3 = input.nextInt();
        System.out.print("keranjang dibawa kepasar 1-3 : ");
        int keranjang = input.nextInt();

        input.close();

        if(keranjang==1){
            int jumlah = keranjang2+keranjang3;
            System.out.println("jumlah buah "+jumlah);
        } else if (keranjang==2) {
            int jumlah1= keranjang1+keranjang3;
            System.out.println("jumlah buah "+jumlah1);
        } else {
            int jumlah1 = keranjang1+keranjang2;
            System.out.println("jumlah buah "+jumlah1);
        }

    }
}
