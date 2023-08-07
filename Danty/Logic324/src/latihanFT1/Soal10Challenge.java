package latihanFT1;

import java.util.Scanner;

public class Soal10Challenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Panjang Deret : ");
        int n = input.nextInt();

        //Deret Bilangan Ganjil

        int[] arrA = new int[n]; //Deret bilangan prima
        int[] arrB = new int[n]; //Deret bilangan fibonacci

        int a = 2; //bilangan yang di cek
        for (int i = 0; i < arrA.length; ) { //i sebagai penanda berapa bilangan prima yang udah ketemu

            int cekPrima = 0;

            for (int j = 1; j <= a; j++) { //j untuk pengecek ada berapa angka yang bisa habis membagi a
                if (a % j == 0) {

                    cekPrima = cekPrima + 1;
                }
            }
            if (cekPrima == 2) {

                arrA[i] = a;
                System.out.print(arrA[i] + " ");
                i++;
            }
            a++;

        }

        System.out.println();

        int b = 1; //ini fn
        int c = 1;
        int d = 0;
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = b;
            System.out.print(arrB[i] + " ");
            b = c + d;
            d = c;
            c = b;

        }
        System.out.println();
        for (int i = 0; i < n; i++) {

            if(i%2 == 0) {
                int totalGenap = arrA[i] + arrB[i];
                System.out.print(totalGenap + " ");
            }
            else if(i%2 != 0){

                int totalGanjil = arrA[i] - arrB[i];//perlu fungsi absolut biar nggak negatif
                System.out.print(totalGanjil + " ");
            }


        }

    }
}
