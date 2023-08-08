package day3.latihan;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan panjang deret: ");
        int angka = input.nextInt();

        int bil = 2;
        for (int i = 0; i < angka; i++) {

            if (i % 2 == 0){
                System.out.print(bil+ " ");
                bil = bil + 2;
            }else {
                System.out.print(" * ");
            }
        }
    }
}
