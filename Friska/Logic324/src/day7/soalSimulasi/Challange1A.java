package day7.soalSimulasi;

import java.util.Scanner;

public class Challange1A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Beli pulsa: ");
        int pulsa = input.nextInt();
        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        int totalPoint = 0;

        if (pulsa >= 50000) {
            int point4 = pulsa / 50000;
            point4 = point4 * 100;

            if (pulsa >= 0 && pulsa <= 10000) {
                point1 = 0;

            } else if (pulsa >= 10001 && pulsa <= 30000) {
                pulsa = pulsa - 10000;
                point1 = 0;
                point2 = pulsa / 1000;
                totalPoint = point1 + point2;
                System.out.println(point1 + "+" + point2 + "=" + totalPoint);

            } else if (pulsa > 30001) {
                pulsa = pulsa - 10000;
                pulsa = pulsa - 20000;
                point1 = 0;
                point2 = 20000 / 1000;
                point3 = pulsa / 1000 * 2;
            }
            totalPoint = point1 + point2 + point3 + point4;
            System.out.println(point1 + "+" + point2 + "+" + point3 + "+" + point4 + "=" + totalPoint);
        }
    }


}

