package day7.latihana;

import java.util.Scanner;

//indeks genap ditambah, indeks ganjil hitung selisih
public class Soal10Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("panjang deret : ");
        int panjangDeret = scanner.nextInt();

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
                indeksPrima++;
            }
        }

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

        //Penjumlahan
        for (int i = 0; i < arrFibo.length; i++) {
            int jumlah = 0;
            if (i % 2 == 0){
                jumlah = arrPrima[i]+arrFibo[i];
            } else {
                jumlah = Math.abs(arrPrima[i]-arrFibo[i]);
            }

            if (i == arrFibo.length-1){
                System.out.println(jumlah);
            } else {
                System.out.print(jumlah + ", ");
            }
        }


    }
}
