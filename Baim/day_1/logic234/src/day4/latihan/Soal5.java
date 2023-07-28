package day4.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < bilangan; i++) {
            if(i%3==0 && i != 0){
                if(i%2==0){
                    System.out.print(i + " ");
                }
                continue;
            }
        }
    }
}
