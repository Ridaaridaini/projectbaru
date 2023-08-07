package latihanA;

import java.util.Scanner;

public class Soal01Challenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("beli pulsa: ");
        int pulsa = scanner.nextInt();//75_000

        int point = 0;
        int bonus = 0;

        System.out.print("poin anda: ");

        if (pulsa > 0 && pulsa <= 10_000){

            System.out.print(point + " = ");

        }else if (pulsa>10_000 && pulsa <= 30_000){

            System.out.print(point + " + ");
            pulsa = pulsa-10_000;
            point = point + (pulsa/1000);
            System.out.print(point + " = ");

        } else if (pulsa>30_000) { // true

            if (pulsa >= 50_000){
                bonus = bonus +  ((pulsa/50_000)*100);
            }

            pulsa = pulsa-10_000; // 75_000 - 10_000 = 65_000
            System.out.print(point + " + ");

            pulsa = pulsa-20_000; // 65_000 - 20_000 = 54_000
            point = point + (20_000/1000);
            System.out.print(point + " + ");

            point = point + ((pulsa/1000)*2);
            System.out.print((point-20) + " + ");

            System.out.print(bonus + " = ");
        }else{
            System.out.println("anda diluar nalar!");
        }


        System.out.println(point+bonus);

    }

}
