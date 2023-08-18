package Latihan1;

import java.util.Scanner;

public class SMsoal03 {
    public static void main(String[] args) {
        //"Diinputkan sebuah nama, cetak awalan di tiap kata menggunakan huruf kapital.
        //Input :
        //Kalimat : Dwayne Doughlas Johnson
        //output :
        //DDJ"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kalimat = scanner.nextLine().toUpperCase().split(" ");

        for (int i = 0; i < kalimat.length; i++) {
            String[] arrKal = kalimat[i].split("");
            for (int j = 0; j < arrKal.length; j++) {
                if(j==0){
                    System.out.print(arrKal[j]);
                }
            }
        }


    }
}
