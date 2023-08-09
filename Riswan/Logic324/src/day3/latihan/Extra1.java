package day3.latihan;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("panjang N : ");
        int n = input.nextInt();
        int count = n;
        int hitung = 0;
        int angka = 2;

        for (int i = 1; i <=n ; i++) {
            System.out.print(" " + angka);
            hitung++;
            if (hitung == count){
                break;
            }
            if (i%2==0){
                angka = angka +2;
                System.out.print(" * ");
            }else {
                angka = angka +2;
            }
        }
    }
}
