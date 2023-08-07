package latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Input angka anda: ");
        int angkaPlayer = scanner.nextInt();
        int angkaKomputer = random.nextInt(10);

        if(angkaPlayer > angkaKomputer){
            System.out.println("You Win");
        } else {
            System.out.println("You Lose");
        }
    }
}
