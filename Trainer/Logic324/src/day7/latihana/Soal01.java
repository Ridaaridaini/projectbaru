package day7.latihana;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("pulsa : ");
        long pulsa = scanner.nextLong();

        long point1 = 0;
        long point2 = 0;
        long point3 = 0;

        pulsa = pulsa - 10000;

        if (pulsa > 0){
            if (pulsa <= 20000){
                point2 = pulsa/1000;
                pulsa = 0;
            } else {
                pulsa = pulsa - 20000;
                point2 = 20;
            }
        }

        point3 = (pulsa/1000) * 2;
        long totalPoint = point1 + point2 + point3;

        System.out.println(point1 + " + " + point2 + " + " + point3 + " = " + totalPoint + " poin");

    }
}
