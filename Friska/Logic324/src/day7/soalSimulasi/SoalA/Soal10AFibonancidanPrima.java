package day7.soalSimulasi.SoalA;

import java.util.Scanner;

public class Soal10AFibonancidanPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang deret: ");
        int panjang = input.nextInt();

        //2.Masukkan ke dalam array untuk nampung fibo dan prima nya
        int[] arrPrima = new int[panjang];
        int[] arrFibonacci = new int[panjang];

        //3.Bilangan prima
        //--> prima bilangan yang habis dibagi 1 dan diri nya sendiri
        int indeksPrima = 0;
        for (int i = 2; indeksPrima < panjang; i++) {
            int bilPrima = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bilPrima++;
                }
                if (bilPrima == 2) {
                    arrPrima[indeksPrima] = i;
                    indeksPrima++;
                }

            }

        }
        //Bilangan Fibonacci
        if(panjang == 1){
            arrFibonacci[0] = 1;
        } else if (panjang > 1) {
            arrFibonacci[0]=1;
            arrFibonacci[1]=1;
        }
        for (int i = 2; i < arrPrima.length; i++) {
            arrFibonacci[i] = arrFibonacci[i-1]+arrFibonacci[i-2];

        }

        //penjumlahan
        for (int i = 0; i < arrFibonacci.length; i++) {
            int jum = arrPrima[i]+arrFibonacci[i];
            if(i == arrPrima.length-1){
                System.out.print(jum);
            }else {
                System.out.print(jum + ", ");
            }


        }


    }
}
