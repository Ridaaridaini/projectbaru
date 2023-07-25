package day1;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        //instansiasi
        Random randomGenerator = new Random();

        //random angka integer
        int intA = randomGenerator.nextInt();
        int intB = randomGenerator.nextInt(100);
        int intC = randomGenerator.nextInt(100);
        System.out.println(intA);
        System.out.println(intB);
        System.out.println(intC + 1);
    }
}
