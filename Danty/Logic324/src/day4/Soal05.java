package day4;

import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        for (int i = 1; i < n ; i++) {

            if(i%3 == 0 && i%2 == 0) {
                System.out.print(i + " ");

            } else{
                System.out.println();
            }
            }

        }

        }


