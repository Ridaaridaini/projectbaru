package day7.latihan01A;

import java.util.Scanner;

public class Soal10FibChallange {
    public static void main(String[] args) {
        //JAWABAN KURANG TEPAT

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int deret = scanner.nextInt();

        int[] arrA = new int[deret];
        int[] prima =new int[deret];
        int[] fibonacci = new int[deret];
        int output;
        int jumlahBilPrima = 0;
        int selBilPrima=0;
        int jumBilFib =0;
        int selBilFib =0;

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

        System.out.print("bilangan prima : ");
        for ( i = 0; i < prima.length; i++) {
            System.out.print(prima[i] + " ");
            if(i % 2==0){
//                System.out.println(prima[i]);
                jumlahBilPrima=jumlahBilPrima + prima[i];
//                System.out.println("jumlah bilangan prima " + jumlahBilPrima);
            } else if (i%2 != 0) {
                selBilPrima = selBilPrima - prima[i];
//                System.out.println(selBilPrima);
                selBilPrima= Math.abs(selBilPrima);
            }

        }
        System.out.println();
        System.out.println("jumlah bilangan prima " + jumlahBilPrima);
        System.out.println("selisih bilngan prima " + selBilPrima);




        //mencari bilangan fibonacci
        System.out.println();
        System.out.print("bilangan fibonacci: ");
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

        for (int j = 0; j < fibonacci.length; j++) {
            if(j%2==0){
                jumBilFib = jumBilFib + fibonacci[j];
//                System.out.println(jumBilFib);
            } else if (j%2 != 0) {
                selBilFib= selBilFib - fibonacci[j];
                selBilFib= Math.abs(selBilFib);
//                System.out.println(selBilFib);
            }
        }
        System.out.println();
        System.out.println("jumlah indeks genap baris fibbonaci " +jumBilFib + " ");
        System.out.println("selisih indeks ganjil baris fibbonaci " + selBilFib + " ");


        System.out.println();
        System.out.print("hasil penjumlahan bilangan prima dan fibbonaci: ");
        for (int j = 0; j < arrA.length; j++) {
            output=prima[j]+fibonacci[j];
            System.out.print(output + " ");
        }


        //menghitung sum dan selisih bilangan prima




    }
}
