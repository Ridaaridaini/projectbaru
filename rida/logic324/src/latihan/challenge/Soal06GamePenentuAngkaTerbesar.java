package latihan.challenge;

import java.util.Random;
import java.util.Scanner;

public class Soal06GamePenentuAngkaTerbesar {
    public static void main(String[] args) {
        System.out.println("/*Game penentu angka terbesar*/");
        Scanner input = new Scanner(System.in);
        Random randomGen = new Random();
        System.out.println("Input Pilihan: 1. Player Main Dahulu.  2.Computer Main Dahulu(angka tidak boleh dibuka/ rahasia.");
        System.out.println("*Input pilihannya berupa angka");
        Integer pil = input.nextInt();
        int pilihan =1;
        while (pilihan == 1) {
            if (pil == 1) {
                System.out.print("Masukkan angka anda: ");
                Integer player = input.nextInt();
                input.nextLine();
                Integer computer = randomGen.nextInt(10);
                if (player > computer) {
                    System.out.println("You Win");
                } else if (computer > player) {
                    System.out.println("You Lose");
                } else {
                    System.out.println("Angka Sama");
                }
                System.out.println("Angka Computer adalah: " + computer);
                System.out.println("apakah ingin menyerah: 1.Tidak  2.YA");
                pilihan = input.nextInt();
                continue;
            }
            if (pil == 2) {
                Integer computer = randomGen.nextInt(10);
                System.out.print("Masukkan angka anda: ");
                Integer player = input.nextInt();
                input.nextLine();
                if (player > computer) {
                    System.out.println("You Win");
                } else if (computer > player) {
                    System.out.println("You Lose");
                }else {
                    System.out.println("Angka Sama");
                }
                System.out.println("Angka Computer adalah: " + computer);
                System.out.println("apakah ingin menyerah: 1.TIDAK  2.YA");
                pilihan = input.nextInt();
                continue;
            }
            System.out.println("Input Pilihan: 1. Player Main Dahulu.  2.Computer Main Dahulu(angka tidak boleh dibuka/ rahasia.");
            pil= input.nextInt();
        }
    }
}