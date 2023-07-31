package day4;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Nama: ");
        String nama= input.nextLine();
        System.out.println("Quotes: ");
        String quotes= input.nextLine();
        System.out.println("Repeat: ");
        Integer n= input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(nama+ " Say, " +quotes);
        }

    }
}
