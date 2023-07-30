package day2.latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Uang Alfin = ");
        int uangAlfin = input.nextInt(); //800000

        if(50000 <= uangAlfin && uangAlfin < 100000){// true && false = false
            System.out.println("Alfin akan membeli Kaos");
        }
        else if(100000 <= uangAlfin && uangAlfin < 250000){ // true && false = false
            System.out.println("Alfin akan membeli Kemeja");
        }
        else if (250000 <= uangAlfin && uangAlfin < 750000){ // true && false = false
            System.out.println("Alfin akan membeli Celana Panjang");
        }
        else if (uangAlfin >= 750000){ //true
            System.out.println("Alfin akan membeli Jas");
        }
    }
}
