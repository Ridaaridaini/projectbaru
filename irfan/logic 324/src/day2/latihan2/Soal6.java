package day2.latihan2;

import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {

        int a, rand;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tebakan = ");
        a = input.nextInt();

        Random random = new Random();
        rand = random.nextInt(10);

        if (a == rand) {
            System.out.println("Anda Menang");
            System.out.println("angka komputer = " +rand);

        } else {
            System.out.println("Anda Kalah");
            if (a > 9) {
                System.out.println("tebakan salah");
            } else {
                System.out.println("angka random = " + rand);
            }
        }
    }
}
