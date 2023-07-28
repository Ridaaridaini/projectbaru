package day3.latihan3;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {

        //n=7
        //1 3 7 10 13 16 19

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();

        int x= 1;
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            x= x+3;

        }

    }

}
