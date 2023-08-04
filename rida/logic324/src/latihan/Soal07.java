package latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int keranjang1=0, keranjang2=0, keranjang3=0;
        System.out.println("Constraint: Antara 3 keranjang salah satu keranjang harus kosong anda mengisi hanya 2 keranjang ");
        System.out.println("/*input dalam bentuk angka");
        for (int i = 0; i < 2; i++) {
            System.out.print("keranjang berapa yang ingin anda isi: ");
            Integer pil= input.nextInt();
            if (pil==1){
                System.out.print("input jumlah buah: ");
                keranjang1=input.nextInt();
                continue;
            }
            if (pil==2){
                System.out.print("input jumlah buah: ");
                keranjang2=input.nextInt();
                continue;
            }
            if (pil==3) {
                System.out.print("input jumlah buah: ");
                keranjang3 = input.nextInt();
                continue;
            }
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
