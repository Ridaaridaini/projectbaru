package day2.latihan;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data Anda : ");
        int user = input.nextInt();

        if(user <10 && user > 0 ){
            System.out.println(" Input berupa satuan");
        } else if (user <100 && user > 9) {
            System.out.println(" Input berupa puluhan");
        } else if (user <=999 && user > 99) {
            System.out.println(" Input berupa Ratusan");
        }else {
            System.out.println(" Input anda tidak valid");
        }
    }
}
