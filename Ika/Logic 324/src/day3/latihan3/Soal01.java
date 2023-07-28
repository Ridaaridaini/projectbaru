package day3.latihan3;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {

        //n=7
        // 1 3 5 7 9 11 13
        Scanner scan = new Scanner(System.in);

        System.out.print("masukan panjang deret: ");
        int n= scan.nextInt();
        scan.close();

        int a=1;//angka yang akan di print
        for(int i=0 ; i < n;i++ ){
            System.out.print(a + " ");
            a= a+2;

        }
    }
}
