package day4.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("masukan nilai x: ");
        int x = scan.nextInt();

        for (int i = 3; i <=x; i++) {
            if(i%3!=0 ){
                continue;
            }
            if (i%2!=0 ){
                continue;
            }
            System.out.print(i + " ");
            i= i+3;

        }
    }
}
