package day1.latihan;

import java.util.Scanner;

public class Soal15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = 125;
        int g = 100;
        int s= 100;

        int c = 15;
        int a = (t+g+s)/c;

        System.out.println(a);
        System.out.print("n = ");
        int n = input.nextInt();

        System.out.println(a*n);




    }
}
