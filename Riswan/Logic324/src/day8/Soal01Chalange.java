package day8;

import java.util.Scanner;

public class Soal01Chalange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Beli Pulsa : ");
        int beli = input.nextInt();
        int point = 0;
        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        int point4 = 0;

        if(beli<=10000){
            System.out.println("tidak dapat point");
            System.exit(0);
        }
        if(beli >= 10001 && beli<=30000){
            beli = beli - 10000;

            for (int i = 0; i < beli; i = i+1000) {
                point2 = point2 +1;
            }
            System.out.println(point +" + "+point2 +" = "+(point1+point2) +" Points");
        }
        if(beli >30000){
            int diskon2 = beli -30000;
            point2 = 20;

            for (int i = 0; i < diskon2; i = i+1000) {
                point3 = point3 +2;
            }
            System.out.println(point +" + "+point2 +" + "+point3 +" = "+(point1+point2+point3)+" Points");
            if(beli>=50000){
                for (int i = 0; i < diskon2; i = i+50000) {
                    point4 = point4 +100;
                }
                System.out.println(point +" + "+point2 +" + "+point3 +" + "+point4+" = "+(point1+point2+point3+point4)+" Points");
            }

        }
    }
}
