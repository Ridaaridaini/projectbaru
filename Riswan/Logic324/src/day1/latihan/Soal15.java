package day1.latihan;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah cup : ");
        int cup = input.nextInt();
//        int sup1 = 125/15;
//        System.out.println(sup1);
        System.out.println("Takaran untuk Cupcake sebanyak :" + cup + "Sebesar " + (125 / 15 *cup) + " terigu" + (100/15*cup) + "terigu" + (100/15*cup) + "terigu");


    }
}
