package day5.latihan;

import java.util.Scanner;

public class Soal08 {

    public static void main(String[] args) {

        int panjangDeret, a = 0, b = 1, jumlah;

        Scanner scanner = new Scanner(System.in);
        System.out.print("panjang deret: ");
        panjangDeret = scanner.nextInt();

        int[] arrGanjil = new int[panjangDeret];
        int[] arrGenap = new int[panjangDeret];

        for (int i = 0; i < panjangDeret; i++) {
            arrGanjil[i] = b;
            arrGenap[i] = a;

            a = a+2;
            b = b+2;
        }

        for (int i = 0; i < panjangDeret; i++) {

            if (i == panjangDeret-1){
                System.out.print(arrGenap[i] + "+" + arrGanjil[i]);
            }else {
                System.out.print(arrGenap[i] + "+" + arrGanjil[i] + " ; ");
            }

        }

        System.out.println();

        for (int i = 0; i < panjangDeret; i++) {

            jumlah = arrGenap[i] + arrGanjil[i];

            if (i == panjangDeret-1) {
                System.out.print(jumlah);
            }else {
                System.out.print(jumlah + ", ");
            }

        }



    }

}
