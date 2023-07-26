package day2.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("angka tebakan = ");
        int x = input.nextInt();

        Random rG = new Random();
        int G = rG.nextInt(10);
        System.out.println("angka random = " + G);

        if(x == G){
            System.out.println("Anda Menang");
        }
        else if(x != G){
            System.out.println("Anda Kalah");
        }


    }
}
