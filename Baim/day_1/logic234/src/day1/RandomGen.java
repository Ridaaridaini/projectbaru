package day1;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        //instansiasi
        Random randomGenerator = new Random();

        //generate random number
        int randomInt = randomGenerator.nextInt();
        System.out.println("Random Int: " + randomInt);

        //generate random number with bound
        int randomIntWithBound = randomGenerator.nextInt(10);
        System.out.println("Random Int With Bound: " + randomIntWithBound);

        //generate random number 1-100
        int randomInt1To100 = randomGenerator.nextInt(100) + 50;
        System.out.println("Random Int 1-100: " + randomInt1To100);

        int a = 100;
        int b = a;
        int c = b + 100;

        System.out.println(a);
    }
    
}
