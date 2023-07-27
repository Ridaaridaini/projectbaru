package day1.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int a,b;

        System.out.print(" nilai A =");
         a= userInput.nextInt();

        System.out.print("nilai B =");
        b=userInput.nextInt();

        int hasil = (int) Math.max(a,b);

        System.out.println("Hasil = " + hasil);
    }
}
