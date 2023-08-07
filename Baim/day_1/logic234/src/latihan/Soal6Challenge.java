package latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal6Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean lanjut = true;
        while (lanjut) {
            System.out.print("Input angka anda: ");
            int angkaPlayer = scanner.nextInt();
            int angkaKomputer = random.nextInt(10);
            scanner.nextLine();

            if (angkaPlayer > angkaKomputer) {
                System.out.println("You Win");
            } else {
                System.out.println("You Lose");
            }

            System.out.println("Mau nyerah? (y/n)");
            String pilihan = scanner.nextLine();

            if (pilihan.equalsIgnoreCase("y")) {
                System.out.println("Anda nyerah");
                lanjut = false;
            }
        }

    }
}
