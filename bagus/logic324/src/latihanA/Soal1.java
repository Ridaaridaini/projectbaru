package latihanA;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int point3 = 0;
        int point2 = 0;
        int point1 = 0;
        int sisaPulsa = 0;


        System.out.println("Beli pulsa berapa? ");
        int pulsa = input.nextInt();
        if (pulsa <= 10000 && pulsa > 0) {
            point1 = 0;
        }
        if (pulsa > 10000) {
            if (pulsa > 10000 && pulsa <= 30000) {
                sisaPulsa = pulsa - 10000;
                point2 = point2 + (sisaPulsa / 1000);
            } else {
                sisaPulsa = pulsa - 30000;
                point2 = point2 + (20000 / 1000);
            }
        }
        if (pulsa > 30000) {
            sisaPulsa = pulsa - 30000;
            point3 = point3 + ((sisaPulsa / 1000) * 2);
        }
        int total = point1 + point2 + point3;
        System.out.println(total);

    }
}


//75000