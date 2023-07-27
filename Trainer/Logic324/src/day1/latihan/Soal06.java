package day1.latihan;

import java.util.Scanner;

/*
Soal 06 (Pengembangan Soal 04)
Diketahui sebuah persegi dengan sisi x yang berupa inputan user.
Diketahui juga sebuah segitiga siku-siku sama kaki yang memiliki dengan panjang sama-kaki adalah y yang berupa inputan user.
Tentukan apakah persegi dan luas segitiga siku-siku sama kaki memiliki luas yang sama?
Output berupa true / false
Hint : Gunakan Operasi Komparasi!
 */
public class Soal06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x : ");
        int x = scanner.nextInt();

        System.out.print("y : ");
        int y = scanner.nextInt();

        int lPersegi = x * x;
        System.out.println(lPersegi);
        int lSegitiga = y * y / 2;
        System.out.println(lSegitiga);

        boolean hasil = lPersegi == lSegitiga;
        System.out.println(hasil);
    }
}
