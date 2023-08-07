package latihanFT1;

import java.util.Scanner;

public class Soal01Challenge {

    public static void main(String[] args) {


        //SOAL CHALLENGE : TIAP KELIPATAN 50000, BERTAMBAH 100 POINT


        Scanner input = new Scanner(System.in);

        System.out.print("Saldo = ");
        int saldo = input.nextInt();

        //setiap kelipatan 50.000, poin tambah 100

        int point = 0;

        if (saldo>30000){

            int saldo1 = saldo - 10000;
            int saldo2 = saldo1 - 20000;
            int point1 = 20000 / 1000;
            int point2 = (saldo2 / 1000) * 2;

            System.out.print("point = " + point + " + " + point1 + " + "  + point2 + " = " + (point+point1+point2));


            if(saldo % 50000 == 0) {

                 point1 = 20000 / 1000;
                 point2 = ((saldo2 / 1000) * 2);
                 int point4 = ((saldo/50000) * 100);

                System.out.println("point = " + point + " + " + point1 + " + " + point2 + " + " + point4 + " = " + (point+point1+point2+point4));
            }

        } else if(10001 <= saldo && saldo >= 30000){
            saldo = saldo-20000;
            int point3 = saldo/1000;

            System.out.print("point = " + point3);

        }else{

            System.out.println("point = " + point);
        }

    }
}
