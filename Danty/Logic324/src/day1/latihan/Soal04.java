package day1.latihan;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();

        System.out.print("y = ");
        int y = input.nextInt();

        System.out.println("z = x*y");
        int z = input.nextInt();

        System.out.println("Luas persegi panjang dengan panjang" + x + "dan lebar" y + "adalah" z);

        //System.out.println("Luas persegi panjang dengan panjang x dan lebar y adalah z");

    }
}
