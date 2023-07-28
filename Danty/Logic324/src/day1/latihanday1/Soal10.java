package day1.latihanday1;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();
        int hasil = Math.max(a,b);

        System.out.println(hasil);
    }

}
