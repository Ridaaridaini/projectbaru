package day1.latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("panjang X =");
        int panjang=userInput.nextInt();

        System.out.print("lebar Y =");
        int lebar=userInput.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas =" + luas);

    }
}
