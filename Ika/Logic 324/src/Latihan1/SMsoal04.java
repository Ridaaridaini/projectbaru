package Latihan1;

import java.util.Scanner;

public class SMsoal04 {
    public static void main(String[] args) {
        //"Diinputkan sebuah nama, cetak huruf kapital awalan dan akhiran.
        //Di antara awalan dan akhiran, sertakan pattern bintang sepanjang tiap kata.
        //
        //Input :
        //Kalimat : Liv Rundgren Tyler
        //
        //output :
        //L***V
        //R********N
        //T*****R"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kalimat = scanner.nextLine().toUpperCase().split(" ");

        for (int i = 0; i < kalimat.length; i++) {
            String[] arrkal =  kalimat[i].split("");

            for (int j = 0; j < arrkal.length; j++) {
                if(j==0) {
                    System.out.print(arrkal[j]);
                }

                System.out.print("*");

                if (j== arrkal.length-1) {
                    System.out.print(arrkal[j]);
                }
            }

            System.out.println();
        }

    }
}
