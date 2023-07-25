package day1.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("A =");
        int panjang=userInput.nextInt();

        System.out.print("B =");
        int lebar=userInput.nextInt();

        int hasil = panjang % lebar;
        System.out.println("hasil =" + hasil);
    }
}
