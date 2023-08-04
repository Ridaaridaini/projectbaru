package latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal07baru {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int keranjang1=0, keranjang2=0, keranjang3=0;
        System.out.println("Constraint: Antara 3 keranjang salah satu keranjang harus kosong anda mengisi hanya 2 keranjang ");
        Random randomGen= new Random();
        Integer a=randomGen.nextInt(3);
        if (a==1){
            keranjang1=0;
            System.out.println("masukkan jumlah buah n: ");
            keranjang2=input.nextInt();
            System.out.println("masukkan jumlah buah m: ");
            keranjang3=input.nextInt();
        } else if (a==2){
            keranjang2=0;
            System.out.println("masukkan jumlah buah n: ");
            keranjang1=input.nextInt();
            System.out.println("masukkan jumlah buah m: ");
            keranjang3=input.nextInt();
        }else {
            System.out.println("masukkan jumlah buah n: ");
            keranjang1=input.nextInt();
            System.out.println("masukkan jumlah buah m: ");
            keranjang2=input.nextInt();
        }
        System.out.print("Keranjang berapa yang ingin dibawa: ");
        Integer keranjangDibawa=input.nextInt();
        if (keranjangDibawa==1){
            System.out.println("Jumlah Buah-> "+keranjang2+" + "+keranjang3+" = "+(keranjang2+keranjang3));
        } else if (keranjangDibawa==2) {
            System.out.println("Jumlah Buah-> "+keranjang1+" + "+keranjang3+" = "+(keranjang1+keranjang3));
        }else {
            System.out.println("Jumlah Buah: "+keranjang1+" + "+keranjang2+" = "+(keranjang1+keranjang2));
        }
    }
}
