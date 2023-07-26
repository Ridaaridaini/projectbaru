package day1;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        //instansiasi
        Random randomgenerator = new Random();

        // generate angka integer yang random tanda bound/batasan
        int intA = randomgenerator.nextInt();
        System.out.println(intA);

        //generat angka integer misal dari angka 0-9
        int intB = randomgenerator.nextInt(10);
        System.out.println(intB);

        // generat angka integer misal dari 7 sampai 9
        int intC = randomgenerator.nextInt(7,10);
        System.out.println(intC);

        //generate untuk int misal dari 1-100
        // lebih direkomendasikan pakai cara yang ini dibandingkan yang intC
        int intD = randomgenerator.nextInt(100);
        intD++; // atau intD = intD +1 atau intD+=1
        System.out.println(intD);



    }
}
