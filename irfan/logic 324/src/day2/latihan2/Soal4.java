package day2.latihan2;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        int x;
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai x = ");
        x = input.nextInt();

        if(x%2==0) {
            System.out.println(" bilangan genap");

        }else{
                System.out.println("bilangan ganjil");
            }

    }
}
