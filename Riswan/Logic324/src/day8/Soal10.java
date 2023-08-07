package day8;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("panjang deret : ");
        int panjangDeret = input.nextInt();

        int[] arrPrima = new int[panjangDeret];
        int[] arrFibo = new int[panjangDeret];

        //Bilangan Prima
        int indeksPrima = 0;
        for (int i = 2; indeksPrima < panjangDeret; i++) {
            int bilPrima = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0){
                    bilPrima++;
                }
            }
            if (bilPrima == 2){
                arrPrima[indeksPrima] = i;
                System.out.print(arrPrima[indeksPrima]+" ");
                indeksPrima++;
            }
        }
        System.out.println();

        //Bilangan Fibonacci
        if (panjangDeret == 1){
            arrFibo[0] = 1;
        } else if (panjangDeret > 1){
            arrFibo[0] = 1;
            arrFibo[1] = 1;
        }
        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i-1] + arrFibo[i-2];
        }
        for (int i = 0; i < arrFibo.length; i++) {
            System.out.print(arrFibo[i]+" ");
        }
        System.out.println();
        //Penjumlahan
        for (int i = 0; i < arrFibo.length; i++) {
            int jumlah = arrPrima[i]+arrFibo[i];
            if (i == arrFibo.length-1){
                System.out.println(jumlah);
            } else {
                System.out.print(jumlah + ", ");
            }
        }
    }
}
