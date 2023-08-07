package day6.latihan6;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("inputkan kalimat = ");
        String n = scanner.nextLine();          // Susilo Bambang

        //split
        String[] arrA = n.split(" "); // SusiLo Bambang
        //for (int i = 0; i < arrA.length; i++) {
        //   tampungstr = arrA[i].toUpperCase(); // ubah ke huruf Kapital

        for (String arrB : arrA) {
            if (!arrB.isEmpty()) {
                char awalan = Character.toUpperCase(arrB.charAt(0)); // Ubah huruf kapital 0
                char akhiran = Character.toUpperCase(arrB.charAt(arrB.length() - 1)); // ubah huruf kapital akhiran

                System.out.print(awalan);

                for (int i = 0; i < 3 ; i++) {
                    System.out.print("*");
                }

                System.out.println(akhiran);
            }
        }
    }
}
