package latihanC;

import java.util.Scanner;

public class Nomor2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nama: ");
        String[] nama = scanner.nextLine().split(" ");

        for (int i = 0; i < nama.length; i++) {
            String[] word = nama[i].split("");

            System.out.print(word[0]);

            System.out.print("***");

            System.out.print(word[word.length-1]);

            System.out.print(" ");
        }

    }

}
