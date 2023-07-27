package day3.latihan3;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("masukan panjang deret: ");
        int n= scan.nextInt();
        scan.close();

        int a=1;//angka yang akan di print
        for(int i=0 ; i < n;i++ ){
            System.out.println(a + " ");
            a= a+2;

        }
    }
}
