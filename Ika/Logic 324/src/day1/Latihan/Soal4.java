package day1.Latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        //menentukan luas persegi panjang dengan mengimput panjang dan lebar dengan Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang: ");
        int x = input.nextInt();
        System.out.print("Lebar: ");
        int y = input.nextInt();
        int z = x*y;

        System.out.println("Luas Persegi panjang dengan panjang " + x + "dan lebar " + y + "adalah " + z);

    }
}
