package day10;

import java.util.Scanner;

public class LE9FibGenap {
    public static void main(String[] args) {
        //berapa banyak angka fibbonaci selain nol dibawah x yang merupakan bilangan genap
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret fibbonaci: ");
        int x = scanner.nextInt();

        int[] arrFeb = new int[x];
        arrFeb[0] = 1;
        arrFeb[1] = 1;

        int sesudah = 1;
        int sebelum = 0;
        int fibbonaci =1;
        for (int i = 0; i < arrFeb.length; i++) {
            arrFeb[i] =fibbonaci;
            fibbonaci= sebelum+sesudah;
            sebelum=sesudah;
            sesudah=fibbonaci;

//            System.out.print(arrFeb[i] + " ");
            if(fibbonaci%2==0){
                System.out.print(fibbonaci +  " ");
            }

            if(fibbonaci>x){
                break;
            }



        }



    }
}
