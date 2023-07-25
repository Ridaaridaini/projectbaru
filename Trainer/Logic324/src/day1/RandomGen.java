package day1;

import java.util.Random;

public class RandomGen {

    public static void main(String[] args) {
        //instansiasi
        Random randomGenerator = new Random();

        //Generate Angka integer random
        int intA = randomGenerator.nextInt();
        System.out.println(intA);

        //Generate Angka Integer 0-9
        int intB = randomGenerator.nextInt(10);
        System.out.println(intB);

        //Generate Angka Integer 1-100
        int intC = randomGenerator.nextInt(100); //0-99
        intC = intC + 1; //1-100
        System.out.println(intC);

    }
}
