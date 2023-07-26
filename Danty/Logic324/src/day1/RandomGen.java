package day1;

import java.util.Random;

public class RandomGen {

    public static void main(String[] args) {

        //instansiasi
        Random randomGenerator = new Random();

        //Generate Angka integer random (tanpa batas)
        int intA = randomGenerator.nextInt();
        System.out.println(intA);

        //Generate angka integer random (dengan batas)
        int intB = randomGenerator.nextInt(10); //ini contoh intervalnya dari 0 - 9
        System.out.println(intB);

        int intC = randomGenerator.nextInt(100); //ini berarti 0-99
        intC = intC + 1; //ini agar interval 1 - 100
        System.out.println(intC);
    }
}
