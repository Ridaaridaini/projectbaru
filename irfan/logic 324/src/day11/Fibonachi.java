package day11;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka = ");
        int n = scanner.nextInt();

        int[] arrFibo = new  int[n];
        int[] arrPrima = new int[n];

        int[] hasil = new int[n];

        arrFibo[0] = 1;
        arrFibo[1] = 1;

        for (int i = 2; i <arrFibo.length ; i++) {
            arrFibo[i] = arrFibo[i-2] + arrFibo[i-1];

        }
        int a = 2; //bilangan dicek
        for (int i = 0; i < arrPrima.length; i++) {

            int cekPrima = 0;
            for (int j = 1; j <= a; j++) {
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
        for (int i = 0; i < arrFibo.length ; i++) {
            if (i % 2 == 0){
                hasil[i] = arrFibo[i] + arrPrima[i];
            }else{
                hasil[i] = arrFibo[i] + arrPrima[i];
            }
            System.out.print(arrFibo[i]+" + "+arrPrima[i]+ " ;");
        }
        System.out.println();
        for (int i = 0; i < hasil.length ; i++) {
            System.out.print(hasil[i]+ " ");
        }

    }
}
