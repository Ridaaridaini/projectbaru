package day3.latihan3;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();


        double x=3;
        double y = 0;
        double z;

        int a=1;
        System.out.println("***********CARA 1***************");
        for (int i = 0; i < n; i++) {
            a=a*3;
            System.out.print(a + " ");
        }

        System.out.println("\n");
        System.out.println("**********CARA 2**************");
        for (int i = 0; i < n; i++) {
            y++;
            z=Math.pow(x,y);
            System.out.print(z + " ");

        }


    }
}
