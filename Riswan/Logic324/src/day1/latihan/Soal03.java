package day1.latihan;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Umur : ");
        int umur = input.nextInt();
        System.out.print("Motto Hidup: ");
        input.nextLine();
        String motto = input.nextLine();
        input.close();
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("Motto Hidup : "+motto);
    }
}
