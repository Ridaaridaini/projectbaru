package day2.latihan2;

import day1.Input;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("uang alfin = " );
        float x = input.nextFloat();

        if(x >= 50_000 && x < 100_000){
            System.out.println("Beli Kaos");
        } else if (x >= 100_000 && x < 250_000) {
            System.out.println("Beli Kemeja");
        } else if (x >= 250_000 && x < 750_000) {
            System.out.println("Beli Celana Panjang");
        } else if ( x >= 750_000) {
            System.out.println("Beli jas");
        }else {
            System.out.println(" duit kurang ");
        }


    }

    }
