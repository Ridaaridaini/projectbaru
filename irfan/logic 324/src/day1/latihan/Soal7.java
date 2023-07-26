package day1.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {


        int x, y;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Nilai X = ");
        x = userInput.nextInt();

        System.out.print("Nilai Y = ");
        y = userInput.nextInt();

        userInput.close();

        int kelilingpersegi = 4 * x;
        System.out.println("hasil Nilai X = " + kelilingpersegi);

        int kelilingsegitiga = 3 * y ;
        System.out.println("hasil Nilai Y = " + kelilingsegitiga);

        boolean bol1= kelilingpersegi > kelilingsegitiga;
        System.out.println(bol1);
    }
}
