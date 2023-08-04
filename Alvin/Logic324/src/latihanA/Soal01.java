package latihanA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("beli pulsa: ");
        long pulsa = scanner.nextLong();//75_000

        long point = 0;

        if (pulsa > 0 && pulsa <= 10_000){

            point = point + 0;
            System.out.print(point + " = ");

        }else if (pulsa>10_000 && pulsa <= 30_000){

            System.out.print(point + " + ");
            pulsa = pulsa-10_000;
            point = point + (pulsa/1000);
            System.out.print(point + " = ");

        } else if (pulsa>30_000) { // true

            pulsa = pulsa-10_000; // 75_000 - 10_000 = 65_000
            point = point +  0;
            System.out.print(point + " + ");

            pulsa = pulsa-20_000; // 65_000 - 20_000 = 54_000
            point = point + (20_000/1000);
            System.out.print(point + " + ");

            point = point + ((pulsa/1000)*2);
            System.out.print((point-20) + " = ");
        }else{
            System.out.println("anda diluar nalar!");
        }

        System.out.println(point);

    }

}
