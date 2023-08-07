package day7.soalSimulasi;

import java.util.Random;
import java.util.Scanner;

public class Soal6Kartu1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input pilihan : 1.Player main dahulu ; " +
                "2. Computer main dahulu");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Masukkan angka player: ");
            int angkaPlayer = input.nextInt();

            Random randomGenerator = new Random();
            int angkaKomputer = randomGenerator.nextInt(10);

            if (angkaPlayer > angkaKomputer) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");

            }
            System.out.println("Angka player : "+ angkaPlayer);
            System.out.println("Angka komputer : "+ angkaKomputer);

        } else {

            Random randomGenerator = new Random();
            System.out.println("Angka komputer");
            int angkaKomputer = randomGenerator.nextInt(10);

            System.out.println("Masukkan angka player: ");
            int angkaPlayer = input.nextInt();

            if (angkaKomputer > angkaPlayer) {
                System.out.println("You Lose");
            } else {
                System.out.println("You Win");

            }
            System.out.println("Angka komputer : "+ angkaKomputer);
            System.out.println("Angka player : "+ angkaPlayer);
        }
    }
}
