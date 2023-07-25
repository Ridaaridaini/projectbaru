package day1.latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String myName = scanner.nextLine();

        System.out.print("Umur: ");
        int myAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Motto hidup: ");
        String myMotto = scanner.nextLine();

        scanner.close();

        System.out.println("Nama Saya " + myName + " umur saya "+ myAge + " tahun. Motto hidup saya " + myMotto);
    }
}
