package day2.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println(" Masukkan Tebakan anda : ");
        int user = input.nextInt();
        int random =  randomGenerator.nextInt(10);

        if(user == random){
            System.out.println("anda menang");
        }else {
            System.out.println("anda kalah");
            System.out.println("hasil : " + random);
        }
    }
}
