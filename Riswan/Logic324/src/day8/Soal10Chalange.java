package day8;

import java.util.Scanner;

public class Soal10Chalange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah N : ");
        int n = input.nextInt();
        //Prima : 2 3 5 7 11

        int[] arrPrima = new int[n];

        int a = 2; //bilangan yang dicek
        for (int i = 0; i < arrPrima.length;) {
            //i buat penanda berapa bil prima yg udah ketemu
            int cekPrima = 0;
            for (int j = 1; j <= a; j++) {
                //j untuk pengecek ada berapa angka yang bisa habis membagi a
                if (a % j == 0){
                    cekPrima = cekPrima + 1;
                }
            }
            if (cekPrima == 2){
                arrPrima[i] = a;
                i++;
            }
            a++;
        }

        int[] arrFibo = new int[n];

        //asumsi panjang array minimal 2
        arrFibo[0] = 1;
        arrFibo[1] = 1;

        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i-2] + arrFibo[i-1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrPrima[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arrFibo[i]+" ");
        }
        System.out.println();
        System.out.println("Indeks genap dijumlah dan indeks ganjil selisih ");

        for (int i = 0; i < n; i++) {
            if(i % 2 ==0){
                System.out.print(Math.abs(arrPrima[i]+arrFibo[i])+" ");
            }
            if(i % 2 ==1){
                System.out.print(Math.abs(arrPrima[i]-arrFibo[i])+" ");
            }
        }
    }
}
