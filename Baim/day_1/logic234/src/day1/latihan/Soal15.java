package day1.latihan;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float terigu = 125f / 15f;
        float gula = 100f / 15f;
        float susu = 100f / 15f;

        System.out.print("Masukkan jumlah cupcake yang akan dibuat: ");
        int cupcake = input.nextInt();

        float totalTerigu = terigu * cupcake;
        float totalGula = gula * cupcake;
        float totalSusu = susu * cupcake;

        input.close();

        System.out.println("========================");
        System.out.println("Bahan yang harus digunakan:");
        System.out.println("Terigu: " + totalTerigu  + " gr");
        System.out.println("Gula: " + totalGula + " gr");
        System.out.println("Susu: " + totalSusu + " ml");
        System.out.println("========================");
    }
}
