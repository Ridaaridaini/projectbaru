package day2.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Random tebakAngka = new Random();

        System.out.print("pilih angka= ");
        int angka = tebakAngka.nextInt(10);//7

        Scanner pilihan = new Scanner(System.in);
        int angkaPilihan = pilihan.nextInt();//7
        System.out.println("nomor yang terpilih adalah " +angka);

        if (angkaPilihan == angka){
            System.out.println(angka);
            System.out.println("selamat anda menang");
        }else{
            System.out.println("anda kalah");
        }
    }
}