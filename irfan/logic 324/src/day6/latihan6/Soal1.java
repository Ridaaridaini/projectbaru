package day6.latihan6;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inputkan kalimat = ");
        String n = scanner.nextLine();

        String[] arrA = n.split(" "); // {'irfan','afandi'}
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]);

        }
    }
}
