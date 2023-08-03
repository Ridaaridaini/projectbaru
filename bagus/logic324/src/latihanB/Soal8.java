package latihanB;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan deret: ");
        int deret = input.nextInt();

        int n = 0;
        int m = 1;
        int fibonacci;
        int prima;
        int panjang=2;
        System.out.print(m + " ");
        for (int i = 2; i <= deret; i++) {
            fibonacci = n + m;
            System.out.print(fibonacci + " ");
            n = m;
            m = fibonacci;
        }

        System.out.println();



        for (int i = 2; i <= deret+panjang; i++) {
            prima = 0;
            for (int j = 1;j <=i; j++) {
                if(i % j == 0){
                    prima++;
//                    System.out.print(i+ " ");
                }

            }
            if (prima == 2){
                System.out.print(i+ " ");


            }panjang++;

        }
    }
}
