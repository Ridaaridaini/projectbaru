package day1;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int iniIntegerRandom = randomGenerator.nextInt();
        System.out.println(iniIntegerRandom);

//      generate angka 0 - 9
        int iniRandomBound = randomGenerator.nextInt(10);

        System.out.println(iniRandomBound);

//        generate angka 1 - 100
        int iniRandomBound2 = randomGenerator.nextInt(100);
        iniRandomBound2 = iniRandomBound2 + 1;
        System.out.println(iniRandomBound2);
    }
}
