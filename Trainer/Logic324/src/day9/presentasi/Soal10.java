package day9.presentasi;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("panjang deret : ");
        int panjangDeret = scanner.nextInt(); // 3

        int[] arrPrima = new int[panjangDeret]; // [2,3,5]
        int[] arrFibo = new int[panjangDeret];  // [1,1,2]

        //Bilangan Prima
        int indeksPrima = 0; // 1 2
        for (int i = 2; indeksPrima < panjangDeret; i++) { // i = 2 ,3  // true
            int bilPrima = 0; // 1 2
            for (int j = 1; j <= i ; j++) { // 1 2 3 4// true // false
                if (i % j == 0){ // 3 % 3 // true
                    bilPrima = bilPrima + 1;
                }
            }
            if (bilPrima == 2){// 2 /true
                arrPrima[indeksPrima] = i; //
                indeksPrima++;
            }
        }

        //Bilangan Fibonacci
        if (panjangDeret == 1){ //
            arrFibo[0] = 1;
        } else if (panjangDeret > 1){ //true
            arrFibo[0] = 1;
            arrFibo[1] = 1;
        }
        for (int i = 2; i < arrFibo.length; i++) { // 2 3 // true // false
            arrFibo[i] = arrFibo[i-1] + arrFibo[i-2]; // 1 + 1 =2
        }

        //Penjumlahan
        for (int i = 0; i < arrFibo.length; i++) { // i=0 1 2 3// false
            int jumlah = arrPrima[i]+arrFibo[i]; // 5+2
            if (i == arrFibo.length-1){  //
                System.out.println(jumlah);
            } else {
                System.out.print(jumlah + ", ");
            }
        }
// 3, 4, 7


    }
}
