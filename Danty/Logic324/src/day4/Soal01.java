package day4;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Quotes : ");
        String quotes = input.nextLine();

        System.out.print("Repeat : ");
        int repeat = input.nextInt();

        for( int i = 0; i < repeat; i++){

            System.out.println(nama + " say " + quotes);
        }



    }
}
