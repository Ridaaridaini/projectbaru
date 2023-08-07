package day9.presentasi;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan beli pulsa: ");
        int pulsa= scanner.nextInt();//25000

        int point=0;
        int kelipatan = 1_000;
        int point1=0;
        int point2=0;
        int point3=0;
        int bonus =0;
        int sumPoint=0;
        int sisapulsa;

        if(pulsa<=10_000) {
            point1 = 0;//false
//            System.out.println(point);
        }

        if(pulsa>10_000) {//true
            if(pulsa>10_000 && pulsa <=30_000){//true && true
                sisapulsa = (pulsa - 10_000);//25000-10000=15000
                point2 = point2+(sisapulsa/kelipatan);//0+15
            }else{
                sisapulsa=pulsa-30_000;//50000-30000=20000
                point2=point2+(20_000/kelipatan);//point 20
            }
        }

        if (pulsa>30_000){
            sisapulsa= pulsa-30_000;//50000-30000=20000
            point3=point3+((sisapulsa/kelipatan)*2);//0+(20000/1000)*2
            //point 3=40
        }

        if(pulsa>=50000){
                sisapulsa = pulsa/50000;
                bonus= bonus + sisapulsa*100;
        }

        sumPoint = point1+point2+point3+bonus;

        System.out.println(point1 + " + " + point2 + " + " + point3 +  " + " +bonus + " = "  + sumPoint);
//        System.out.println(sumPoint);//15

    }
}
