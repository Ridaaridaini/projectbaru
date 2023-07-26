package day2.latihan2;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang X: ");
        int panjang = scanner.nextInt();

        System.out.print("Masukkan lebar persegi panjang Y: ");
        int lebar = scanner.nextInt();

        if (panjang < 1) {
            System.out.println("Panjang yang diinputkan tidak boleh kurang dari 1");
        } else if (lebar < 1) {
            System.out.println("Lebar yang diinputkan tidak boleh kurang dari 1");
        } else {
            int luas = panjang * lebar;
            System.out.println("Luas persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah " + luas);

        }
    }
}
