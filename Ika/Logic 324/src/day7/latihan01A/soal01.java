package day7.latihan01A;

import java.util.Scanner;

public class soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan beli pulsa: ");
        int pulsa= scanner.nextInt();

        int kelipatan = 1_000;
        int point1=0;
        int point2=0;
        int point3=0;
        int sumPoint=0;
        int sisapulsa;

        if(pulsa<=10_000) {
            point1 = 0;
//            System.out.println(point);
        }

        if(pulsa>10_000) {
            if(pulsa>10_000 && pulsa <=30_000){
                sisapulsa = (pulsa - 10_000);
                point2 = point2+(sisapulsa/kelipatan);
            }else{
                sisapulsa=pulsa-30_000;
                point2=point2+(20_000/kelipatan);
            }
        }

        if (pulsa>30_000){
            sisapulsa= pulsa-30_000;
            point3=point3+((sisapulsa/kelipatan)*2);
        }

        sumPoint = point1+point2+point3;
//        System.out.println(sumPoint);

        System.out.println(point1 + " + " + point2 + " + " + point3 + " = " + sumPoint);
    }
}
