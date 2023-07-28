package day4.latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan positif: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < bilangan; i++) {
            if(i%2 == 1){
                System.out.print(i + " ");
                continue;
            }
        }

        System.out.println("");

        for (int i = 0; i < bilangan; i++) {
            if(i%2 == 0 && i != 0){
                System.out.print(i + " ");
                continue;
            }
        }

    }
}
