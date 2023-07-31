package day5;

import java.util.Scanner;

public class Array1DimContoh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //deklarasi array
        int[] arrA = new int[3];//[0,0,0] arr.length =3

        //kombinasi input menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {//i = 0,1,2
            System.out.print("input indeks ke " + i + " : ");
            arrA[i] = scanner.nextInt();

        }

        //kombinasi ooutput menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");

        }

        //ada pemisah koma
        System.out.println();
        for (int i = 0; i < arrA.length; i++) {
            if(i== arrA.length-1){//indeks terakhir
                System.out.print(arrA[i]);
            }else {
                System.out.print(arrA[i] + ", ");
            }

        }

    }
}
