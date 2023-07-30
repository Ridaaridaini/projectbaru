package day2.latihan2;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai panjang: ");
        int x = input.nextInt();
        if (x < 1){
            System.out.println("Panjang yang diinputkan tidak boleh kurang dari 1");
            System.exit(0);}

        System.out.println("Masukkan nilai lebar: ");
        int y = input.nextInt();

        if (y < 1){
            System.out.println("Lebar yang diinputkan tidak boleh kurang dari 1");
        }
        else {
            int Hasilluas = x * y;
            System.out.println("Luas persegi panjang dengan panjang x dan lebar y adalah : "+ Hasilluas);
        }
    }
}
