package day3.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan number: ");
        int number = scan.nextInt();

        int bil = 1;
        for (int i = 0; i < number; i++) {
            if (number%2==0){
                if(i == number/2-1) {
                    System.out.print(" XXX ");
                    bil = bil * 3;
                    continue;
                }else if (i == number/2) {
                    System.out.print(" XXX ");
                    bil = bil * 3;
                    continue;
                }
            }
            else if (i == number/2) {
                System.out.print(" XXX ");
                bil = bil * 3;
                continue;
            }

            System.out.print(bil + " ");
            bil = bil * 3;
        }
    }
}

