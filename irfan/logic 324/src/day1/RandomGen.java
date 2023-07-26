package day1;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {

        //instansiasi
        Random randomgenerator = new Random();

        //generate Angke integer random
        int intA = randomgenerator.nextInt();
        System.out.println(intA);

        //generate Angka 0-9
        int intB = randomgenerator.nextInt(10);
        System.out.println(intB);

        int intC= randomgenerator.nextInt(100 );
        intC = intC + 1;
        System.out.println(intC);
    }
}
