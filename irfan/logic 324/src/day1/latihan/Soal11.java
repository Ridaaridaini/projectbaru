package day1.latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print(" nilai A =");
        int a= userInput.nextInt();

        System.out.print("nilai B =");
        int b=userInput.nextInt();

        System.out.println("hasil = "+ (int)Math.pow(a,b));

    }
}
