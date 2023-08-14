package day10;

import java.util.Arrays;
import java.util.Scanner;

public class SampleSupMeanMedianMod {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("input angka : ");
        String  angka = scanner.nextLine();

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
        double median=0.0;
        double median2=0;
        for (int i = 0; i < arrAngka.length; i++) {
            double parsAngka = Integer.parseInt(arrAngka[i]);
//            System.out.println(parsAngka);
         if(arrAngka.length%2==0){
             if(i== arrAngka.length/2 || i== (arrAngka.length-1)/2){
                 median= median +(parsAngka)/2.0;
             }
         }else {
             if(i== arrAngka.length/2){
                 median=median+parsAngka;
             }
         }

        }
        System.out.println("median " + median);


        //mencari modus
        int maks=0, modus=0 , chek=0;
        for (int i = 0; i < arrAngka.length; i++) {
            chek=1;
            for (int j = i+1; j < arrAngka.length; j++) {
                if(Integer.parseInt(arrAngka[i])==Integer.parseInt(arrAngka[j])){
                    chek=chek+1;
                }
            }if(chek>maks){
                maks=chek;
                modus=Integer.parseInt(arrAngka[i]);
            }

        }
        System.out.println("modus "+modus);

    }
}
