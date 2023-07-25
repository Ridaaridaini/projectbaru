package day1;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        //instaniasi
        Random randomGenerator = new Random();
        //tanpa batas
        int A = randomGenerator.nextInt();
        System.out.println(A);

        //ada batas 0 nya ikut
        int B = randomGenerator.nextInt(10);
        System.out.println(B);

        //ada batas 0 nya ga ikut
        int C = randomGenerator.nextInt(100);
        C = C + 1;
        System.out.println(C);
    }
}
