package day6.latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata yang ingin dipisah: ");
        String inputString = scanner.nextLine();

        String[] pisahString = inputString.split(" ");

        for (int i = 0; i < pisahString.length; i++) {
            System.out.println(pisahString[i]);
        }

        scanner.close();
    }
}
