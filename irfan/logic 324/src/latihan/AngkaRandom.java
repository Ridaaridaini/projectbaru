package latihan;

import java.util.Random;
import java.util.Scanner;

public class AngkaRandom {
    public static void main(String[] args) {
        int a, rand;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tebakan = ");
        a = input.nextInt();

        Random random = new Random();
        rand = random.nextInt(10);

        if (a == rand) {
            System.out.println("Anda Menang");
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
