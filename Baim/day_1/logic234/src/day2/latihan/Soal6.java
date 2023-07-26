package day2.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bilanganRandom = random.nextInt(9);

        System.out.print("Masukkan sembarang angka 0-9 yang ingin ditebak: ");
        int bilangan = scanner.nextInt();

        scanner.close();

        System.out.println("===========================");
        if (bilangan == bilanganRandom) {
            System.out.println("Bilangan Random: " + bilanganRandom);
            System.out.println("Kamu menang");
        } else {
            System.out.println("Bilangan Random: " + bilanganRandom);
            System.out.println("Kamu kalah");
        }
    }

}
