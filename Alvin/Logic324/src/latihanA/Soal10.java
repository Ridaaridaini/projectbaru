package latihanA;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("panjang deret: ");
        int panjangDeret = scanner.nextInt();

        //membuat deret bilangan prima
        int[] arrPrima = new int[panjangDeret];
        int i=0, cek, bil=2;

        while (i < panjangDeret){
            cek = 0; //reset cek jadi 0 kembali

            for (int j = 2; j <= bil ; j++) {//2 3
                if (bil%j == 0) {
                    cek++;
                }
            }

            if (cek == 1){
                arrPrima[i] = bil;
                i++;
            }
            bil++;
        }
        //end of deret prima

        //membuat deret fibonacci
        int[] arrFibonacci = new int[panjangDeret];
        int fibonacci=1, past=1, current=1;

        for (i = 0; i < panjangDeret; i++) {

            if (i==0){
                arrFibonacci[i] = i;
                continue;
            }

            if (i == 1) {
                arrFibonacci[i] = i;
                continue;
            }

                arrFibonacci[i] = current;
                fibonacci = past+current;
                past = current;
                current = fibonacci;

        }
        //end of deret fibonacci

        System.out.print("deret prima    : ");
        for (int j = 0; j < panjangDeret; j++) {
            System.out.print(arrPrima[j] + " ");
        }
        System.out.println();
        System.out.print("deret fibonacci: ");
        for (int j = 0; j < panjangDeret; j++) {
            System.out.print(arrFibonacci[j] + " ");
        }
        System.out.println();
        //penjumlahan index ganjil +  index ganjil dan index genap + index genap
        int[] penjumlahan = new int[panjangDeret];
        for (i = 0; i < panjangDeret; i++) {

            if (i%2==0){
                //genap
                penjumlahan[i] = arrPrima[i] + arrFibonacci[i];
                System.out.print(arrPrima[i] + " + " + arrFibonacci[i] + "; ");
                continue;
            }else{
                //ganjil
                penjumlahan[i] = arrPrima[i] + arrFibonacci[i];
                System.out.print(arrPrima[i] + " + " + arrFibonacci[i] + "; ");
                continue;
            }

        }
        //end of penjumlahan bilangan berdasarkan index ganjil atau genap

        System.out.println();
        for (int j = 0; j < panjangDeret; j++) {
            System.out.print(penjumlahan[j] + " ");
        }

    }

}
