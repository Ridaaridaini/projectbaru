package day3.latihan3;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        //n=7
        // 2 4 6 8 10 12 14
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();

        int a= 2;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a=a+2;

        }
    }
}
