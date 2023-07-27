package day2.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {
    /*Buatlah program tebak angka dari 0-9.
Cetak "Anda Menang" jika tebakan benar, dan cetak "Anda Kalah" Jika tebakan salah.
Contoh :
Input :
Masukkan Tebakan = 5
Output :
Angka Random = 5
Anda Menang!	*/
    public static void main(String[] args) {
        Random randomGeneerator = new Random();
        int y = randomGeneerator.nextInt( 10);
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan Tebakan : ");
        Integer x= input.nextInt();
        if (x>=0 && x==y){
            System.out.println("Angka random= "+y);
            System.out.println("Anda Menang!");
        }else{
            System.out.println("Angka random= "+y);
            System.out.println("Anda Kalah!");
        }

    }
}
