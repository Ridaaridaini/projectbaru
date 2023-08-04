package latihanFT1;

import java.util.Scanner;

public class Soal01 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Saldo = ");
        int saldo = input.nextInt();


        //0-10.000 = 0 point
        //10.001 - 30.000 = 1 point setiap kelipatan 1000
        //> 30.000 = 2 point setiap kelipatan 1000

        int point = 0;
//        int saldo1 = saldo - 10000;
//        int saldo2 = saldo1 - 20000;
//        int point1 = 20000/1000;
//        int point2 = (saldo2/1000)*2;
//
//        System.out.println(saldo1);
//        System.out.println(saldo2);
//        System.out.println(point1);
//        System.out.println(point2);

        if (saldo>30000){
            int saldo1 = saldo - 10000;
            int saldo2 = saldo1 - 20000;
            int point1 = 20000/1000;
            int point2 = (saldo2/1000)*2;

            System.out.println("point = " + (point + point1 + point2));

        } else if(10001 <= saldo && saldo >= 30000){
             saldo = saldo-20000;
             int point3 = saldo/1000;

            System.out.print("point = " + point3);

        }else{

            System.out.println("point = " + point);
        }



        }
    }
