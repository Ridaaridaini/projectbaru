package day6.latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata yang ingin diinisialkan: ");
        String inputString = scanner.nextLine();

        String[] pisahString = inputString.split(" ");

        String inisial = "";
        for (int i = 0; i < pisahString.length; i++) {
            inisial += pisahString[i].charAt(0);
        }

        System.out.println(inisial.toUpperCase());
        scanner.close();
    }
}
