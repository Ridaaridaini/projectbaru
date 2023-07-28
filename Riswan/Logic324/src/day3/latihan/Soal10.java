package day3.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input nilai n : ");
        int n = input.nextInt();
        int angka = 3;

        for (int i = 1; i <=n ; i++) {
            if( n % 2 == 1) {
                if(i == n/2+1){
                    angka = angka * 3;
                    System.out.print(" XXX ");

                }else{
                    System.out.print(" " + angka);
                    angka = angka * 3;
                }
            } else if (n % 2 == 0) {
                if (i==n/2 || i==n/2+1 ){
                    angka = angka * 3;
                    System.out.print(" XXX ");

                }else {
                    System.out.print(" " + angka);
                    angka = angka * 3;
                }
            }
        }
    }
}
