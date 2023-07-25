package day1.Latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nilai x: ");
        int x = input.nextInt();

        System.out.print("nilai y: ");
        int y = input.nextInt();

        int z= x%y;

        input.close();

        System.out.println("sisa bagi " + x + " dari " + y + " adalah " + z);
    }
}
