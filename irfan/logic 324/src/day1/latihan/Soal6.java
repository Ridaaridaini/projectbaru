package day1.latihan;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {

        int x, y;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Nilai X = ");
        x = userInput.nextInt();

        System.out.print("Nilai Y = ");
        y = userInput.nextInt();

        userInput.close();

        int keliling = 3 * x;
        System.out.println("hasil Nilai X = " + keliling);

        int luas = (y * y) * 1/2;
        System.out.println("hasil Nilai Y = " + luas);

        boolean bola = keliling == luas;
        System.out.println(bola);
    }
}
