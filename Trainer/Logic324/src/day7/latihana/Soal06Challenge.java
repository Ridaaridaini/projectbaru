package day7.latihana;

import java.util.Random;
import java.util.Scanner;

public class Soal06Challenge {
    //Buat permainan berulang sampai player menyerah/berhenti
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean lanjutMain = true;

        while(lanjutMain){
            System.out.println("Input Pilihan");
            System.out.println("1. Player main dahulu");
            System.out.println("2. Computer main dahulu (angka tidak boleh dibuka/rahasia)");
            int pilihan = scanner.nextInt();

            if (pilihan == 1){
                System.out.println("angka player : ");
                int angkaPlayer = scanner.nextInt();
                int angkaKomputer = random.nextInt(10);
                System.out.println("angka komputer : " + angkaKomputer);

                if (angkaPlayer>= angkaKomputer){
                    System.out.println("You Win!");
                } else {
                    System.out.println("You Lose!");
                }
            } else if(pilihan == 2){
                int angkaKomputer = random.nextInt(10);
                System.out.println("angka player : ");
                int angkaPlayer = scanner.nextInt();
                System.out.println("angka komputer : " + angkaKomputer);

                if (angkaPlayer>= angkaKomputer){
                    System.out.println("You Win!");
                } else {
                    System.out.println("You Lose!");
                }
            }

            System.out.println("Lanjut Main (1.YA/2.TIDAK)");
            int pilih = scanner.nextInt();
            if (pilih == 2){
                break;
            }
        }


    }
}
