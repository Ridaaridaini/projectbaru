package day10;

import java.util.Arrays;
import java.util.Scanner;

public class SampleSupernova {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("input angka : ");
        String  angka = scanner.nextLine();
        ;
        String[] arrAngka = angka.replace(" ","").split("");
        double mean=0;
        double mean2 =0;
        //menghitung mean
        for (int i = 0; i < arrAngka.length; i++) {
            double parsAngka = Integer.parseInt(arrAngka[i]);
            mean= mean + parsAngka;
            mean2 = mean/arrAngka.length;
        }
        System.out.println("nilai rata-rata: "+mean2);

        Arrays.sort(arrAngka);
        double modus=0;
        double modus2=0;
        for (int i = 0; i < arrAngka.length; i++) {
            double parsAngka = Integer.parseInt(arrAngka[i]);
//            System.out.println(parsAngka);
            if(i%2==0){
                if(i==arrAngka.length/2 || i==(arrAngka.length/2)+1 ){
                    modus=modus+parsAngka;
                    modus2=modus/2;
                }
            }

        }

        System.out.println(modus2);

    }
}
