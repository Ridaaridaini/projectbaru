package day2.latihan2;

import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tebakan angka anda:");
        int tebakan = input.nextInt();

        int angkaRandom = random.nextInt(10);

        if (tebakan == angkaRandom){
            System.out.println("Anda Menang!");
        }
        else {
                System.out.println("Tebakan anda salah, coba lagi ya!");
            }
        }



    }

