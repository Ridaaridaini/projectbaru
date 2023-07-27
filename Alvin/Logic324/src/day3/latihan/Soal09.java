package day3.latihan;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("deret n: ");
        int n = scanner.nextInt();

        int x = 4;
        for (int i = 0; i < n; i++) {

            if (i % 3 == 2){
                System.out.print("* ");
            }else{
                System.out.print(x + " ");
                x = x * 4;
            }

        }

    }

}
