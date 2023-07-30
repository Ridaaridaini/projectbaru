package day3.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang deret bilangan: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        int a = 1;

        for (int i = 0; i < bilangan; i++) {
            if(i%3 == 2){
                System.out.print(" * ");
                continue;
            }
            System.out.print(a + " ");
            a += 4;
        }
    }
}
