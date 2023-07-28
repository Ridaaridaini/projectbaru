package day4.latihan;

import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {

        int x, n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        x = scanner.nextInt();


        for (int i = 0; i < x; i++) {
            n = n + 3;

            if (n%2 == 0){
                if (n <= x){
                    System.out.print(n + " ");
                }
            }


        }

    }

}
