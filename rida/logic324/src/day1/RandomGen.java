package day1;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        //Implementasi
        Random randomGeneerator = new Random();
        //Generate angka ineger ranom
        int intA = randomGeneerator.nextInt();
        System.out.println(intA);
        //Generate angka integer 0-9
        int intB = randomGeneerator.nextInt( 10);
        System.out.println(intB);
        //Generate angka 1- 100
        int intC = randomGeneerator.nextInt(  100);
        intC = intC+1;
        System.out.println(intC);
    }
}
