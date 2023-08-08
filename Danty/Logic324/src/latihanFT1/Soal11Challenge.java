package latihanFT1;

import java.util.Scanner;

public class Soal11Challenge {

    public static void main(String[] args) {

        //SOAL CHALLENGE : MENAMPILKAN DARI URUTAN BELAKANG

        Scanner input = new Scanner(System.in);

        System.out.print(" n = ");
        int n = input.nextInt();



        int a = n;
        if(n%2 == 0){

            a = n-1;
        }

        for (int i = 0; i < n; i = i+2) {

            System.out.print(a + " ");
            a = a-2;

        }
        System.out.println();

        int b = n;
        if(n%2 == 1){

            b = n-1;
        }

        for (int i = 1; i < n; i = i + 2) {

            System.out.print(b + " ");
            b = b-2;

        }

    }
}
