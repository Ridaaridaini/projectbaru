package day1.latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {

        int x, y;

        Scanner userInput = new Scanner(System.in);

        System.out.print("harga beli X = ");
        x = userInput.nextInt();

        System.out.print("harga jual Y = ");
        y = userInput.nextInt();

        userInput.close();

        int untung = ((y - x) / x) * 100;
        System.out.println("nilai untung = " + untung);

    }
}
