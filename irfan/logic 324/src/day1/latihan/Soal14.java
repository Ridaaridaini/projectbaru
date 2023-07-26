package day1.latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        int x, y, z;

        Scanner userInput = new Scanner(System.in);

        System.out.print("pecahan sepeluh ribu  = ");
        x = userInput.nextInt();

        System.out.print("pecahan lima ribu  = ");
        y = userInput.nextInt();

        System.out.print("pecahan dua puluh ribu = ");
        z = userInput.nextInt();

        userInput.close();

        int Total = (x * 10000) + (y * 5000) + (z * 20000);
        System.out.println("jumlah total pecahan = " + Total);
    }
}
