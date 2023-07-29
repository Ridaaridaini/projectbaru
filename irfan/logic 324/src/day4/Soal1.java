package day4;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        int i, n;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama =");
        String a = input.nextLine();

        System.out.print("Quotes =");
        String b = input.nextLine();

        System.out.print("Repeat =");
        n = input.nextInt();

        for ( i = 0; i < n; i++) {
            System.out.println(a +" say,"+b);

        }

    }
}
