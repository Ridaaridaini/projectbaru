package day1.latihan;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah cup : ");
        int cup = input.nextInt();

        double Terigu = 125/15f;
        double Pasir = 100/15f;
        double Susu = 100/15f;

        System.out.println("Takaran untuk Cupcake sebanyak : " + cup);
        System.out.println("Terigu  : " + (Math.round(Terigu *cup)) + " gr");
        System.out.println("Gula    : " + (Math.round(Pasir *cup)) + " gr");
        System.out.println("Susu    : " + (Math.round(Susu *cup)) + " gr");

    }
}
