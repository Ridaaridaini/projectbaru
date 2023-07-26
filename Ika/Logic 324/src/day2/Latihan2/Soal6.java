package day2.Latihan2;


import java.util.Scanner;
import java.util.Random;

public class Soal6 {
    public static void main(String[] args) {
        //Buatlah program tebak angka dari 0-9.
        //Cetak "Anda Menang" jika tebakan benar, dan cetak "Anda Kalah" Jika tebakan salah.

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("masukan tebakan: ");
        int tebakan = scan.nextInt();
        int angkaRandom = random.nextInt(10);
        System.out.println("angka random: " + angkaRandom);

        scan.close();

        if(tebakan==angkaRandom){
            System.out.println("Anda Menang");
        }else {
            System.out.println("Anda Kalah");
        }

    }
}
