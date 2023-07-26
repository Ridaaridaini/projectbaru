package day1.latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int a,b;
        System.out.print(" nilai A =");
        a= userInput.nextInt();

        System.out.print("nilai B =");
        b=userInput.nextInt();

        float hasil = (float) Math.pow(a,b);
        System.out.println("hasil = "+ hasil);

    }
}
