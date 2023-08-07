package latihan;

import java.util.Scanner;

public class Soal1Challage {
    public static void main(String[] args) {

        long pulsa;
        long point1 = 0;
        long point2 = 0;
        long point3 = 0;
        long bonus = 0;
        long hasil = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Beli pulsa = ");
        pulsa = scanner.nextLong();        //75.000


        if (pulsa >= 0 && pulsa <= 10001) { // TRUE && FALSE
            point1 = 0;

            } else if (pulsa > 10001 && pulsa <= 30000) {
                point1 = 0;
                pulsa = pulsa - 10000;
                point2 = pulsa / 1000;
            } else if (pulsa > 30000) {

            if(pulsa >= 50000){
            bonus = pulsa / 50000 * 100;

            }
            point1 = 0;
            point2 = 20;
            pulsa = pulsa - 10000;
            pulsa = pulsa - 20000;
            point3 = (pulsa / 1000) * 2;

            hasil = point1 + point2 + point3 +bonus;
            }
//        else if (pulsa >= 50000) {
//            pulsa = pulsa /50000;
//            bonus = (pulsa / 50000) * 100;
//            hasil = point1 + point2 + point3 +bonus;

//        }
        System.out.println(point1 + "+" + point2 + "+" + point3 + "+" + bonus + " = " + hasil);
        }
    }




