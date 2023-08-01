package day6.latihan;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("kalimat: ");
        String kalimat = scanner.nextLine();

        String[] word = kalimat.split(" ");

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }

    }

}
