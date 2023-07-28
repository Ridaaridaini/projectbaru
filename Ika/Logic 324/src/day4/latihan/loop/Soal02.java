package day4.latihan.loop;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {

        //"Diinputkan nilai p sebagai panjang deret dan s sebagai awalan deret.
        //buat pattern berikut.
        //
        //input
        //P ? 7
        //S ? 3
        //
        //output
        //1 2 3 4 5 6 7
        //3 4 5 6 7 8 9"

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret p: ");
        int p = scan.nextInt();

        System.out.print("masukan awalan deret s: ");
        int s = scan.nextInt();

        scan.close();

        int a =1;
        for (int i = 1; i <= p; i++) {
            System.out.print(i + " ");
            }
            System.out.println();

        for (int j = 0; j < p; j++) {
            System.out.print(s + " ");
            s=s+1;
        }
        System.out.println();

    }

}