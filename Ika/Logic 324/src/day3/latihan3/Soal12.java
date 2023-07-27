package day3.latihan3;

import java.util.Scanner;

public class Soal12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(j<i){
                    System.out.print("*");
                }
            }
            System.out.println();


        }



    }
}
