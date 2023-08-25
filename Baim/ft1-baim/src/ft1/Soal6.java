package ft1;

import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("Masukan playyer pilihanmu (a/b): ");
        String pilihan = scanner.nextLine();

        int tampungA = 0;
        int tampungB = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Round ke-" + (i + 1));
            int a = randomGenerator.nextInt(9);
            int b = randomGenerator.nextInt(9);

            if (a == 1) {
                tampungA += 3;
            }
            if (a == 2) {
                tampungA += 5;
            }
            if (a == 3) {
                tampungA += 3;
            }
            if (a == 4) {
                tampungA += 5;
            }
            if (a == 5) {
                tampungA += 8;
            }
            if (a == 6) {
                tampungA += 5;
            }
            if (a == 7) {
                tampungA += 3;
            }
            if (a == 8) {
                tampungA += 3;
            }
            if (a == 9) {
                tampungA += 3;
            }

            if (b == 1) {
                tampungB += 3;
            }
            if (b == 2) {
                tampungB += 5;
            }
            if (b == 3) {
                tampungB += 3;
            }
            if (b == 4) {
                tampungB += 5;
            }
            if (b == 5) {
                tampungB += 8;
            }
            if (b == 6) {
                tampungB += 5;
            }
            if (b == 7) {
                tampungB += 3;
            }
            if (b == 8) {
                tampungB += 3;
            }
            if (b == 9) {
                tampungB += 3;
            }
            System.out.println("Nilai A = " + tampungA);
            System.out.println("Nilai B = " + tampungB);
        }

        if (pilihan.equalsIgnoreCase("a")) {
            if (tampungA > tampungB) {
                System.out.println("Player A menang");
            } else {
                System.out.println("Player A kalah");
            }
        }
        if (pilihan.equalsIgnoreCase("b")) {

            if (tampungA < tampungB) {
                System.out.println("Player B menang");
            } else {
                System.out.println("Player B kalah");
            }
        }
    }
}
