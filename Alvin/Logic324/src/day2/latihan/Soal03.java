package day2.latihan;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("panjang: ");
        x = scanner.nextInt();
        System.out.print("lebar: ");
        y = scanner.nextInt();

        if (x<1){
            System.out.println("panjang tidak boleh kurang dari 1");
        } else if (y<1) {
            System.out.println("lebar tidak boleh kurang dari 1");
        }else {
            int z = x * y;
            System.out.println("luas persegi panjang " + z);
        }
    }
}
