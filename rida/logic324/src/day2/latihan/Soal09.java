package day2.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal09 {
    /*Terdapat 3 keranjang buah di dapur. Salah satu keranjang kosong dan sisanya berisi masing-masing n & m buah.
Apabila salah satu keranjang tersebut dibawa ke pasar, maka berapa jumlah buah yang terdapat di dapur sekarang?
Output : Jumlah Buah		Input = nilai n, m & keranjang yang dibawa ke pasar.	*/

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random randaomGen= new Random();
        Integer keranjangKosong= randaomGen.nextInt(2);
        Integer keranjang1=0,keranjang2=0, keranjang3=0, jumlah=0;
        System.out.println("masukkan nilai n");
        int n= input.nextInt();
        System.out.println("Masukkan nilai m");
        int m=input.nextInt();
        input.nextLine();
        if (keranjangKosong==0){
            keranjang2=n;
            keranjang3=m;
            keranjangKosong=1;
        } else if (keranjangKosong==1) {
            keranjang1=n;
            keranjang3=m;
            keranjangKosong=2;
        } else {
            keranjang1=n;
            keranjang2=m;
            keranjangKosong=3;
        }
        System.out.println("Keranjang berapakah yang ingin dibawa: ");
        int bawa= input.nextInt();
        if (bawa==1){
            jumlah=keranjang2+keranjang3;
        } else if (bawa==2) {
            jumlah=keranjang1+keranjang3;
        }else{
            jumlah=keranjang1+keranjang2;
        }
        System.out.println("Jumlah buah: "+jumlah);
        System.out.println("Keranjang kosong ialah keranjang ke-"+keranjangKosong);

    }

}
