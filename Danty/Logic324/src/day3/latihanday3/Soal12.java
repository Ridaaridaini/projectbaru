package day3.latihanday3;

import java.util.Scanner;

public class Soal12 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println();

            for(int j = 0; j < i; j++){
                System.out.print("*" + " ");
            }

        }
    }
}
