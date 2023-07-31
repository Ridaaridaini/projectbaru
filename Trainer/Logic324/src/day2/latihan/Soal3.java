package day2.latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai panjang: ");
        int x = input.nextInt();//2
        if (x < 1){ //false
            System.out.println("Panjang yang diinputkan tidak boleh kurang dari 1");
            System.exit(0);
        }

        System.out.println("Masukkan nilai lebar: ");
        int y = input.nextInt();//0

        if (y < 1){//3// false
            System.out.println("Lebar yang diinputkan tidak boleh kurang dari 1");
        }
        else {
            int Hasilluas = x * y;// 2*3
            System.out.println("Luas persegi panjang dengan panjang x dan lebar y adalah : "+ Hasilluas);
        }
    }
}
