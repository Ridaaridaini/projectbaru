package day7.latihan01B;

import java.util.Scanner;

public class soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan n: ");
        int n = scanner.nextInt();

        System.out.print("bilangan ganjil: ");
        for (int i = 0; i <= n; i++) {
            if (i%2 != 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

        System.out.print("bilangan genap: ");
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                System.out.print(i + " ");
            }
        }





    }
}
