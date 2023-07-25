package day1.latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai panjang: ");
        int panjang = input.nextInt();

        System.out.println("Masukkan nilai lebar: ");
        int lebar = input.nextInt();

        input.close();
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang yaitu : "+ luas);


    }
}
