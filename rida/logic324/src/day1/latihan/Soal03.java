package day1.latihan;

import day1.Input;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nama: ");
        String nama = input.nextLine();
        System.out.println("umur: ");
        Integer umur = input.nextInt();
        input.nextLine();
        System.out.println("motto hidup: ");
        String motto = input.nextLine();
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
        System.out.println("Motto hidup: "+motto);
    }
}
