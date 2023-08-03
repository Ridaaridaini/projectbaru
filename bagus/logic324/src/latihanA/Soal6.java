package latihanA;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Soal6 {
    public static void main(String[] args) {
        Random angka = new Random();

        int A = RandomGenerator.getDefault().nextInt(10);
        Scanner input = new Scanner(System.in);


        System.out.println("1. Anda main dulu");
        System.out.println("2. Komputer main dulu");

        System.out.println("Masukan pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {

            System.out.println("Masukan Angka: ");
            int player = input.nextInt();
            System.out.println("Angka player: "+player);
            System.out.println("Angka komputer: "+A);

            if (player > A) {
                System.out.println("You Win");
            } else if (player < A) {
                System.out.println("You Lose");
            } else {
                System.out.println("Draw");
            }

        } else if (pilihan==2) {
            System.out.println("Masukan Angka: ");
            int player = input.nextInt();
            System.out.println("Angka komputer: "+A);
            System.out.println("Angka player: "+player);

            if (player > A) {
                System.out.println("You Win");
            } else if (player < A) {
                System.out.println("You Lose");
            } else {
                System.out.println("Draw");
            }
        }

    }
}

