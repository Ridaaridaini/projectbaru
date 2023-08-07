package day7.latihanb;

import java.util.Scanner;

public class Soal01Challenge {
    //Cetak ganjil dan genapnya dari belakang
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n : ");
        int n = scanner.nextInt();

        //ganjil
        int ganjil = 0;
        if (n % 2 == 1){
            ganjil = n;
        } else {
            ganjil = n-1;
        }
        for (; ganjil > 0;) {
            System.out.print(ganjil + " ");
            ganjil = ganjil - 2;
        }

        System.out.println();

        //genap
        int genap = 0;
        if (n % 2 == 0){
            genap = n;
        } else {
            genap = n-1;
        }
        for (; genap > 0;) {
            System.out.print(genap + " ");
            genap = genap - 2;
        }

        System.out.println();

    }
}
