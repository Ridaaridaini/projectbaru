package day5.latihan;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        int[] arrIni = new int[5];

        Scanner scanner = new Scanner(System.in);

        //input value ke setiap elemen
        for (int i = 0; i < 5; i++) {
            System.out.print("deret-" + (i+1) + ": ");
            arrIni[i] = scanner.nextInt();
        }
        System.out.println();
        // shorting
        int temp;
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {

                if (arrIni[i] > arrIni[j]){
                    temp = arrIni[i];
                    arrIni[i] = arrIni[j];
                    arrIni[j] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arrIni[i] + " ");
        }
        System.out.println();

        int bawah = 0, atas = 0;

        for (int i = 0; i < 5; i++) {
            if (i<4){
                bawah = bawah + arrIni[i];
            }

            if (i>0){
                atas = atas + arrIni[i];
            }
        }

        System.out.println(bawah + " dan " + atas);
    }

}
