package day2.latihanday2;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println("bilangan genap");

        }else {
            System.out.println("bilangan ganjil");
        }




    }
}
