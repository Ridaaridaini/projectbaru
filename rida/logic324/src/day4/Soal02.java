package day4;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("P? ");
        Integer p= input.nextInt();
        input.nextLine();
        System.out.print("S? ");
        Integer s= input.nextInt();
        input.nextLine();
        for (int i = 0; i < p; i++) {
            System.out.print(i+1+ " ");
            }
        System.out.println();
        for (int i = 0; i < p; i++) {
            System.out.print(s + " ");
            s=s+1;

        }

        }


    }

