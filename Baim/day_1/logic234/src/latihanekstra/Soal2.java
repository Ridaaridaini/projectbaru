package latihanekstra;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String[] nama = scanner.nextLine().split(" ");

        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i].toUpperCase().charAt(0) + "***" + nama[i].charAt(nama[i].length() - 1));
        }

        scanner.close();
    }
}
