package day9.presentasibahas;

import java.util.Scanner;

public class Soal10AChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int deret = scanner.nextInt();

        int[] arrA = new int[deret];
        int[] prima =new int[deret];
        int[] fibonacci = new int[deret];
        int output = 0;

        //mencari bilangan prima
        int bil = 2;
        int i=0;
        while (i < prima.length){//i=0
            int cek = 0;
            for (int j = 2; j <= bil; j++) {
                if (bil%j==0){//
                    cek += 1;
                }
            }
            if(cek==1){
                prima[i]=bil;//2
                i++;
            }
            bil++;
        }
        for ( i = 0; i < prima.length; i++) {
            System.out.print(prima[i] + " ");
        }


        //mencari bilangan fibonacci
        System.out.println();
        int bilSebelum=1;
        int bilSesudah=0;
        int bilFibonacci=1;
        for (i = 0; i < fibonacci.length; i++) {

            fibonacci[i]=bilFibonacci; //memasukan bilangan
            System.out.print(fibonacci[i] + " ");

            bilFibonacci=bilSebelum+bilSesudah;
            bilSesudah=bilSebelum;
            bilSebelum=bilFibonacci;

        }

        System.out.println();
        for (int j = 0; j < arrA.length; j++) {
            if (j % 2 == 0){//indeks genap
                output=prima[j]+fibonacci[j];
            } else {//indeks ganjil
                output=Math.abs(prima[j]-fibonacci[j]);
            }
            System.out.print(output + " ");
        }

    }
}
