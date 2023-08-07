package latihan;

import java.util.Scanner;

public class DeretPrima {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n =5;

        int[] arrPrima = new  int[n];

        int a=2;
        for (int i = 0; i < arrPrima.length; i++) {
            // i buat penanda berapa bilangan bil prima yg udah ketemu
            int cekPrima = 0;

            for (int j = 1; j <= a ; j++) {
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
    }
}
