package day2.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        int x, rand;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tebakan angka: ");
        x = scanner.nextInt();
        scanner.close();

        Random random = new Random();

        rand = random.nextInt(10);
        System.out.println("=====================");

        if (x > 9){
            System.out.println("Anda diluar nalar!");
        }else{

            System.out.println("Angka hoki: " + rand);

            if (x == rand){
                System.out.println("ANDA MENANG!");
            }else {
                System.out.println("anda belum beruntung");
            }

        }
    }
}
