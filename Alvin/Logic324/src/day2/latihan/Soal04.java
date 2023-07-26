package day2.latihan;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai X: ");
        x = scanner.nextInt();

        scanner.close();

        if (x % 2 == 0){
            System.out.println(x +" adalah bilangan genap");
        }else {
            System.out.println(x +" adalah bilangan ganjil");
        }
    }
}
