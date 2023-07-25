package day1.latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama :");
        String nama = input.nextLine();

        System.out.println("Masukkan Umur :");
        int umur = input.nextInt();

        input.nextLine();
        System.out.println("Masukkan motto hidup :");
        String motto = input.nextLine();

        input.close();
        System.out.println(nama);
        System.out.println(umur);
        System.out.println(motto);
    }
}
