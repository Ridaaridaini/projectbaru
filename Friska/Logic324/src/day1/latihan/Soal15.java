package day1.latihan;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Cupcake yang akan dibuat: ");
        int jumCupcake = input.nextInt();
        input.close();
        float jumTerigu = 125/15 *jumCupcake;
        float jumGula = 100/15 *jumCupcake;
        float jumSusu = 100/15*jumCupcake;

        System.out.println("Bahan yang diperlukan untuk Membuat "+jumCupcake+ " Cupcake adalah:");
        System.out.println(jumTerigu +" gr Terigu");
        System.out.println(jumGula + " gr Gula");
        System.out.println(jumSusu + " gr Susu");













}}