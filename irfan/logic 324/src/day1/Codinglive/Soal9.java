package day1.Codinglive;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        int a;
        int b;

      Scanner input = new Scanner(System.in);

        System.out.print( "inputan A = ");
        a = input.nextInt();

        System.out.print( "inputan b = ");
        b = input.nextInt();

        float hasil = (float)Math.pow(a,b);

        System.out.println("Hasil = " + hasil);


    }
}
